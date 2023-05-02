package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlbumDAO {
    public void create(int year, String theWall, String pinkFloyd, String rock) {
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO ALBUM (Title,YEAR,ARTISTNAME,GENRENAME) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, theWall);
            preparedStatement.setInt(2, year);
            preparedStatement.setString(3, pinkFloyd);
            preparedStatement.setString(4, rock);
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

void createAlbum(Album album) {
    try {
        Database.createConnection();
        java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO ALBUM (Title, artist_id, genre_id) VALUES (?, ?, ?)");
        preparedStatement.setString(1, album.getName());
        preparedStatement.setInt(2, album.getArtist_id());
        preparedStatement.setInt(3, album.getGenre_id());
        preparedStatement.executeUpdate();
        Database.getConnection().commit();
        Database.closeConnection();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public boolean findAll() {
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT * FROM albums");
            java.sql.ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt(4));
            }
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void importData(String path) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "COPY albums(release_year, title, artist, genres) FROM '" + path +"' DELIMITER ',' CSV HEADER;")){
            pstmt.executeUpdate();
        }
        catch(SQLException ex){
            System.err.println(ex);
        }
    }
}
