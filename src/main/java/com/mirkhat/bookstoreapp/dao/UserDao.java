package com.mirkhat.bookstoreapp.dao;

import com.mirkhat.bookstoreapp.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private String dbUrl = "jdbc:mysql://localhost:3306/book_store";
    private String dbUsername = "root";
    private String dbPassword = "root";
    private String dbDriver = "com.mysql.jdbc.Driver";

    private static final String INSERT_USERS_SQL = "INSERT INTO users (`email`, `password`, `status`, `is_admin`) VALUES (?, ?, ?, ?);";
    private static final String SELECT_USER_SQL = "SELECT * FROM users WHERE email = ? AND password = ?;";
    private static final String SELECT_ALL_USERS = "SELECT * FROM users";


    protected Connection getConnection() {
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

    public void insertUser(User user) throws ClassNotFoundException, SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, 1);
            preparedStatement.setInt(4, 0);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int loginUser(User user) throws ClassNotFoundException, SQLException {
        int result = 0;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_SQL)) {
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
