package org.example;

import java.sql.Connection;

public class Database {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "LAB8";
    private static final String PASSWORD = "sql";
    private static Connection connection = null;


    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        Database.connection = connection;
    }

    public static String getURL() {
        return URL;
    }

    public static String getUSER() {
        return USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    //create connection
    public static void createConnection() {
        try {
            connection = java.sql.DriverManager.getConnection(getURL(), getUSER(), getPASSWORD());
            connection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //rollback
    public static void rollback() {
        try {
            connection.rollback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
