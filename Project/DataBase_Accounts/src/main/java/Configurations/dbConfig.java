package Configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConfig {
    public static Connection connection = null;
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "ADMIN";
    private static final String PASSWORD = "sql";

    public static void createConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
