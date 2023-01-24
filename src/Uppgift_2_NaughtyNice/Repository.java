package Uppgift_2_NaughtyNice;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Repository {

    int getBarnIdFrånNamn (String nameOfInterest) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        int barnId = 0;

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id, namn from Barn")
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String namn = resultSet.getString("namn");
                if (namn.equals(nameOfInterest)){
                    barnId=id;
                    break;
                }
                else {
                    barnId=-1;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return barnId;
    }

    String findNaughtyOrNiceById(int idOfInterest) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        String result = "";

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select handlarOm, varitSnäll from Rapport")
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("handlarOm");
                boolean varitSnäll = resultSet.getBoolean("varitSnäll");
                if (id == idOfInterest){
                    result = booleanToString(varitSnäll);
                    break;
                }
                else result = "Detta barn finns inte i databasen.";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    String booleanToString(boolean snällhet){
        String resultat = "";
        if (snällhet){
            resultat = "Detta barn har varit snäll.";
        }
        else resultat = "Detta barn har varit elak.";

        return resultat;
    }
}