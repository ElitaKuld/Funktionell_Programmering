package Uppgift_5_AddPresent_Callable_StoredProcedure;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {

    void addPresent(String presentNamn, int responsibleElf) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));

             CallableStatement callableStatement = connection.prepareCall("call addPresent (?,?)");

        ) {
            callableStatement.setString(1, presentNamn);
            callableStatement.setInt(2, responsibleElf);

            callableStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void addPresentOUT(String presentNamn, int responsibleElf) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));

             CallableStatement callableStatement = connection.prepareCall("call addPresentOUT (?,?,?)");

        ) {
            callableStatement.setString(1, presentNamn);
            callableStatement.setInt(2, responsibleElf);
            callableStatement.registerOutParameter(3, Types.VARCHAR);

            callableStatement.executeQuery();
            String feedback = callableStatement.getString(3);
            System.out.println(feedback);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void addPresentSELECT(String presentNamn, int responsibleElf) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));

             CallableStatement callableStatement = connection.prepareCall("call addPresentSELECT (?,?)");

        ) {
            callableStatement.setString(1, presentNamn);
            callableStatement.setInt(2, responsibleElf);

            callableStatement.executeQuery();
            ResultSet resultSet = callableStatement.getResultSet();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("namn"));
            }


        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
        }
    }
}