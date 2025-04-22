# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY: CODTECH IT SOLUTIONS

NAME: KHUSHI SAHU

INTERN ID:CT4MTGYC

DOMAIN: JAVA PROGRAMMING

DURATION: 16 WEEKS

MENTOR: NEELA SANTOSH

# DESCRIPTION

A collaborative filtering recommendation engine built using **Java** and **Apache Mahout**. This project suggests items for users based on preferences stored in a sample dataset. 

## 🔍 Overview

This project demonstrates how to create a **user-based recommender system** using the Apache Mahout library. It processes a dataset of user-item interactions and provides personalized item recommendations.

## 📌 Features

- User-Based Collaborative Filtering
- Java 21 + Apache Mahout
- File-based data model (CSV)
- Simple CLI-based recommendation output
- Maven support for dependency management

## 🛠 Technologies Used

- **Java 21**
- **Apache Mahout (0.13.1)**
- **Maven**
- **VS Code**

  ## 📂 Project Structure
  task4/ ├── src/ │ └── main/ │ ├── java/ │ │ └── org.example/ │ │ └── Main.java │ └── resources/ ├── dataset.csv └── pom.xml


  ## Steps to run
  1. Clone this repository:
   git clone https://github.com/your-username/recommendation-system-java.git
   cd recommendation-system-java

  2. Add your dataset in CSV format:
          userId,itemId,rating
          1,101,5.0
          1,102,3.0
          2,101,4.0
           ...
  3. Build the project:
         mvn clean install

  4. Run the application:
        mvn exec:java -Dexec.mainClass="org.example.Main"

## 🧠 How It Works
- Reads a dataset file using Mahout's FileDataModel

-Calculates user similarity using Pearson correlation

-Identifies neighborhood users

-Generates top-N recommendations

# Output:
![Image](https://github.com/user-attachments/assets/4c11254c-6b9a-4735-9e31-62520670beb7)
