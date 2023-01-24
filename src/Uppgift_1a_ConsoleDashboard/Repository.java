package Uppgift_1a_ConsoleDashboard;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {

    int getAntalBarn() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        int antalBarn = 0;

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id from Barn")
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                antalBarn++;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return antalBarn;
    }

    int getAntalNissar() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        int antalNissar = 0;

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id from Tomte")
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                antalNissar++;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return antalNissar;
    }

    List<String> getNamnPåNissar() throws IOException {


        List<String> namnPåNissar = new ArrayList<>();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select namn from Tomte")
        ) {
            while (resultSet.next()) {
                String namn = resultSet.getString("namn");
                namnPåNissar.add(namn);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return namnPåNissar;
    }

    List<Boolean> getSnällhet() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        List<Boolean> snällhetsLista = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select varitSnäll from Rapport")
        ) {
            while (resultSet.next()) {
                boolean snäll = resultSet.getBoolean("varitSnäll");
                snällhetsLista.add(snäll);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return snällhetsLista;
    }

    double getMedelvärdePåSnällhet (List<Boolean> snällhet){
        int snällaBarn = 0;
        int elakaBarn = 0;
        int totaltBarn = 0;

        for (int i = 0; i < snällhet.size(); i++){
            if (snällhet.get(i) == true){
                snällaBarn++;
            }
            else elakaBarn++;
            totaltBarn++;
        }
        return snällaBarn * 100 / totaltBarn;
    }
}