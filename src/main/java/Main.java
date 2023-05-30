import HomeWork_2.Task1;
import HomeWork_2.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String queryPart = "select * from students where ";
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String sqlQuery = task1.generateSqlQuery(queryPart, json);
        System.out.println(sqlQuery);
        Task2 task2 = new Task2();
        try {
            String str = task2.readJsonFromFile("students.json");
            task2.generateTextFromJson(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}