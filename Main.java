package com.example;


import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Load the dataset from resources folder
        // csv file format userid,itemid,preference
        File dataFile = new File("src/main/resources/data.csv");
        DataModel model = new FileDataModel(dataFile);

        // Create similarity metric
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

        // Define neighborhood (e.g., top 2 similar users)
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(3, similarity, model);


        // Build recommender
        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        // Print recommendations for all users
        for (LongPrimitiveIterator users = model.getUserIDs(); users.hasNext(); ) {
            long userId = users.nextLong();
            List<RecommendedItem> recommendations = recommender.recommend(userId, 2);
        
            System.out.println("User " + userId + ":");
            if (recommendations.isEmpty()) {
                System.out.println("  No recommendations found.");
            } else {
                for (RecommendedItem item : recommendations) {
                    System.out.println("  Recommended Item: " + item.getItemID() + " (score: " + item.getValue() + ")");
                }
            }
        }
        
    }
}
