package Uppgift_2_NaughtyNice2;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Repository {

    String findNaughtyOrNiceByName(String nameOfInterest) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        String result = "";

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select Barn.namn, Rapport.varitSnäll from Barn, Rapport " +
                     "where Barn.id=Rapport.handlarOm")
        ) {
            while (resultSet.next()) {
                boolean varitSnäll = resultSet.getBoolean("Rapport.varitSnäll");
                String namn = resultSet.getString("Barn.namn");

                if (namn.equals(nameOfInterest)){
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