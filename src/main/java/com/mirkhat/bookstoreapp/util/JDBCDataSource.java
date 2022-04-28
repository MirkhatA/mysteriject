package com.mirkhat.bookstoreapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDataSource {
    private static String dbUrl = "jdbc:mysql://localhost:3306/book_store";
    private static String dbUsername = "root";
    private static String dbPassword = "root";
    private static String dbDriver = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
