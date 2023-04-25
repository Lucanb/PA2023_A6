package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class GenreDAO {

    private int genreID;
    private String genreName;

    public GenreDAO(int genreID, String genreName) {
        this.genreID = genreID;
        this.genreName = genreName;
        String sql = "CREATE TABLE IF NOT EXISTS genres (genreID integer NOT NULL, genreName character varying NOT NULL,PRIMARY KEY (\"genresID\"))";
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

   public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public void create(String genreName) {
        System.out.println("Genre created: " + genreName);
    }

    public void delete(String genreName) {
        System.out.println("Genre deleted: " + genreName);
    }

    public void update(String genreName) {
        System.out.println("Genre updated: " + genreName);
    }

    public void select(String genreName) {
        System.out.println("Genre selected: " + genreName);
    }

    public void selectAll() {
        System.out.println("Genre selected");
    }

    public void selectByName(String genreName) {
        System.out.println("Genre selected: " + genreName);
    }

    public void selectByArtist(String genreName) {
        System.out.println("Genre selected: " + genreName);
    }

    public void selectByGenre(String genreName) {
        System.out.println("Genre selected: " + genreName);
    }
}
