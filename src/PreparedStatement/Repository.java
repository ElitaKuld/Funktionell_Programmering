package PreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {
    List<Barn> getBarnFrånNamn(String name) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/Settings.properties"));
        List<Barn> barn = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(properties.getProperty("connectionString"), properties.getProperty("name"),
                properties.getProperty("password"));
             PreparedStatement preparedStatement = connection.prepareStatement("select id, namn, adress, landId, ansvarigFörBarn " +
                     "from Barn where namn = ?");


        ) {
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Barn temp = new Barn();
                temp.setId(resultSet.getInt("id"));
                temp.setNamn(resultSet.getString("namn"));
                temp.setAdress(resultSet.getString("adress"));
                temp.setLandId(resultSet.getInt("landId"));
                temp.setAnsvarigFörBarn(resultSet.getInt("ansvarigFörBarn"));
                barn.add(temp);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return barn;
    }
}