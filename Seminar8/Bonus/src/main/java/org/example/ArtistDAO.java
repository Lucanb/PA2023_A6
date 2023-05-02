package org.example;

import java.sql.SQLException;

public class ArtistDAO {
    public void create(String name) {
        try {
            String Default = "Unknown";
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO ARTIST (Name,Country) VALUES (?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2, Default);
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void createArtist(String name, String genre) {
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO ARTIST (Name, Country) VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, genre);
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void createArtist(Artist artist) {
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO ARTIST (Name, Country) VALUES ( ?, ?)");
            preparedStatement.setString(1, artist.getName());
            preparedStatement.setString(2, artist.getCountry());
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT id FROM ARTIST WHERE name = ?");
        preparedStatement.setString(1, name);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        Integer id = null;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
        }
        Database.closeConnection();
        return id;
    }

    public String findById(Integer id) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT name FROM ARTIST WHERE id = ?");
        preparedStatement.setInt(1, id);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        String name = null;
        while (resultSet.next()) {
            name = resultSet.getString(1);
        }
        Database.closeConnection();
        return name;
    }

    public void findByNameAndCountry(String name, String country) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT * FROM ARTIST WHERE name = ? AND country = ?");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, country);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
        Database.closeConnection();
    }

    public void deleteArtist(Integer id) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("DELETE FROM ARTIST WHERE id = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        Database.getConnection().commit();
        Database.closeConnection();
    }

    public void updateArtistName(Integer id, String name) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("UPDATE ARTIST SET name = ? WHERE id = ?");
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        Database.getConnection().commit();
        Database.closeConnection();
    }

    public void updateArtistCountry(Integer id, String country) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("UPDATE ARTIST SET country = ? WHERE id = ?");
        preparedStatement.setString(1, country);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        Database.getConnection().commit();
        Database.closeConnection();
    }

    public void displayArtists() throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT * FROM ARTIST");
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
        Database.closeConnection();
    }

    public void displayArtistsOrdered() throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT * FROM ARTIST ORDER BY name");
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
        Database.closeConnection();
    }

public void displayArtistsByCountry(String country) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT * FROM ARTIST WHERE country = ?");
        preparedStatement.setString(1, country);
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
        Database.closeConnection();
    }

    //delete
    public void deleteArtistByName(String name) throws SQLException {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("DELETE FROM ARTIST WHERE name = ?");
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        Database.getConnection().commit();
        Database.closeConnection();
    }

}
