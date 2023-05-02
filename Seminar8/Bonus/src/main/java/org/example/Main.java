package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String args[]) {
        try {
            var artists = new ArtistDAO();
            artists.create("Pink Floyd");
            artists.create("Michael Jackson");
            var genres = new GenreDAO();
            genres.create("Rock"); //TODO: Funk, Soul, Pop
            genres.create("Funk");
            genres.create("Soul");
            genres.create("Pop");
            var albums = new AlbumDAO();
            albums.create(1979, "The Wall", "Pink Floyd", "Rock");

            //findByName
 //           System.out.println(artists.findByName("Pink Floyd"));
           albums.create(1982, "Thriller", "Michael Jackson","Funk,Soul,Pop");

            //TODO: print all the albums in the database
     //       System.out.println(albums.findAll());
          //   Database.createConnection(); //////////////
            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            Database.rollback();
        }
    }
}
