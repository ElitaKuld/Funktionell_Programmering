package Uppgift_6_AnställNisse;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

import java.util.Properties;

public class Repository {

    void addManufacturingElf2(String tomteNamn, int chefId) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));

             CallableStatement callableStatement = connection.prepareCall("call addManufacturingElf2 (?,?)");

        ) {
            callableStatement.setString(1, tomteNamn);
            callableStatement.setInt(2, chefId);

            callableStatement.executeQuery();

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }
}