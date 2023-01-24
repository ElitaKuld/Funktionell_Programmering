package Uppgift_3c_LäggInPresent;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

import java.util.Properties;

public class Repository {
    void insertPresent(String name, int responsibleElf) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "insert into Present (namn, ansvarigFörPresent) values (?,?)");


        ) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, responsibleElf);

            int resultat = preparedStatement.executeUpdate();
            System.out.println(resultat + " rader uppdaterades");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}