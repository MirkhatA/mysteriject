package com.mirkhat.bookstoreapp.dao;

import com.mirkhat.bookstoreapp.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private String dbUrl = "jdbc:mysql://localhost:3306/book_store";
    private String dbUsername = "root";
    private String dbPassword = "root";
    private String dbDriver = "com.mysql.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public int registerUser(User user) throws ClassNotFoundException, SQLException {
        loadDriver(dbDriver);
        Connection connection = getConnection();

        String INSERT_USERS_SQL = "INSERT INTO users (`email`, `password`, `status`, `is_admin`) VALUES (?, ?, ?, ?);";

        int result = 0;

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setBoolean(3, true);
            preparedStatement.setBoolean(4, false);

            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
