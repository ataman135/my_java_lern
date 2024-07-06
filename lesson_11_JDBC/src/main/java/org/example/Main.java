package org.example;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "a27b83v0";
        List<Car> cars = new ArrayList<>();

        Connection connection = getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cars");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int mileage = resultSet.getInt("mileage");
            cars.add(new Car(id, name, mileage));
        }

        cars.forEach(System.out::println);
        resultSet.close();
        statement.close();
        connection.close();
    }
}
