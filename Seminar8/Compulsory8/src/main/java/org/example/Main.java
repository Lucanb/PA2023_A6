package org.example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void printAlbums() throws SQLException {
        String sql = "SELECT * FROM albums";
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("year") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getString("artist") + " " +
                        resultSet.getString("genre"));
            }
        }
    }
    public static void main(String args[]) {
        try {
            var artists = new ArtistAO( 11, "Pink Floyd");
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            var genres = new GenreDAO(12, "Rock");
            genres.create("Rock"); //TODO: Funk, Soul, Pop
            genres.create("Funk");
            genres.create("Soul");
            genres.create("Pop");

            Database.getConnection().commit();
            var albums = new AlbumDAO(13, "The Wall", "Pink Floyd", "Rock");
            albums.create(1979, "The Wall", "Pink Floyd", "Rock");
            //findByName
            albums.create(1982, "Thriller", "Michael Jackson","Funk,Soul,Pop");
                    Database.getConnection().commit();
            //TODO: print all the albums in the database

            Main.printAlbums();

            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            Database.rollback();
        }
    }
}
