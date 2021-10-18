package com.example.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DatabaseConnection {
    private static Connection conn = null;

    static{
        String url = System.getenv("JDBC_DATABASE_URL");
        try {
            conn = DriverManager.getConnection(Objects.requireNonNullElse(url, "jdbc:postgresql://localhost:5432/kitchen_b?user=postgres&password=root"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}
