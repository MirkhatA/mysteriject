package com.mirkhat.bookstoreapp.dao;

import com.mirkhat.bookstoreapp.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public int registerUser(User user) throws ClassNotFoundException, SQLException {
        String INSERT_USERS_SQL = "INSERT INTO user" +
                " (id, username, password) VALUES " +
                " (?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/book_store?useSSL=false", "root", "root");

             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            // TODO: make autoincrement
             preparedStatement.setInt(1, 3);
             preparedStatement.setString(2, user.getUsername());
             preparedStatement.setString(3, user.getPassword());

            System.out.println(preparedStatement);

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
