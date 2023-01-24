package ObjektDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ObjektDemo {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));


        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id, namn, adress, landId, ansvarigFörBarn from Barn")
        ) {
            List<Barn> barn = new ArrayList<>();

            while (resultSet.next()) {
                Barn temp = new Barn();
                temp.setId(resultSet.getInt("id"));
                temp.setNamn(resultSet.getString("namn"));
                temp.setAdress(resultSet.getString("adress"));
                temp.setLandId(resultSet.getInt("landId"));
                temp.setAnsvarigFörBarn(resultSet.getInt("ansvarigFörBarn"));
                barn.add(temp);
            }

            barn.forEach(b -> System.out.println(b.getNamn() + " " + b.getAdress()));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}