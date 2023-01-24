package UppkopplingDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class UppkopplingDemo {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));


        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id, namn, adress from Barn")
        ) {
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String namn = resultSet.getString("namn");
                String adress = resultSet.getString("adress");

                System.out.println(id + " " + namn + " " + adress);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}