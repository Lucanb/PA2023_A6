package org.example;

import java.sql.*;

public class Database {
    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521:XE";
     private static final String USER = "LAB8";
    private static final String PASSWORD = "sql";
    private static Connection connection = null;
    private Database() {}
    public static Connection getConnection() {
       if(connection ==null){
           createConnection();
       }
       return connection;
    }
    /**
     * creez conexiunea cu baza de date
     */
    private static void createConnection() {
        try {
            Class.forName("org.oracle.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            System.out.println("Am reusit sa ma conectez ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public static void closeConnection() {
        try{
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
}
    public static void rollback() {
        Connection con = getConnection();
        try {
            con.rollback();
        } catch (SQLException e) {
            System.err.println("Failed to rollback transaction: " + e.getMessage());
        }
    }

}