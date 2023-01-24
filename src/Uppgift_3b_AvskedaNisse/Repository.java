package Uppgift_3b_AvskedaNisse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Repository {

    void avskedaNisse (String namnPåNisse) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "delete from Tomte where namn=?;");

        ) {

                preparedStatement.setString(1, namnPåNisse);

                int resultat = preparedStatement.executeUpdate();
                System.out.println(resultat + " rader uppdaterades");

            } catch (SQLException e) {
                throw new RuntimeException(e);

        }
    }
}