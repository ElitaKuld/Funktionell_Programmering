package Uppgift_3a_Namnbytesprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Repository {
    void changeElfName(String currentName, String desiredName) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "update Tomte set namn=? where namn=?");


        ) {
            preparedStatement.setString(1, desiredName);
            preparedStatement.setString(2, currentName);

            int resultat = preparedStatement.executeUpdate();
            System.out.println(resultat + " rader uppdaterades");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}