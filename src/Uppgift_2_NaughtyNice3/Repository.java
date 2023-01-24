package Uppgift_2_NaughtyNice3;


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
             ResultSet resultSet = statement.executeQuery("select Rapport.varitSnäll from Barn, Rapport " +
                     "where Barn.id=Rapport.handlarOm and Barn.namn=" + "\"" + nameOfInterest + "\"")
        ) {

            while (resultSet.next()) {
                boolean varitSnäll = resultSet.getBoolean("Rapport.varitSnäll");
                result = booleanToString(varitSnäll);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    String booleanToString(boolean snällhet) {
        String resultat = "";
        if (snällhet) {
            resultat = "Detta barn har varit snäll.";
        } else resultat = "Detta barn har varit elak.";

        return resultat;
    }
}