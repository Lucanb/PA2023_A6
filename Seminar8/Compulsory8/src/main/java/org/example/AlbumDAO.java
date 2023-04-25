package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlbumDAO {

    private int year;
    private String name;
    private String artist;
    private String genre;

    public AlbumDAO(int year, String name, String artist, String genre) {
        this.year = year;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        String sql= "CREATE TABLE IF NOT EXISTS albums (year int, name character varying NOT NULL, " +
                "artist character varying NOT NULL, genre character varying NOT NULL)";
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return year + " " + name + " " + artist + " " + genre;
    }

    public void create(int year, String name, String artist, String genre) {
        System.out.println("Album created: " + year + " " + name + " " + artist + " " + genre);
    }

    public void create(String artist) {
        System.out.println("Album created: " + year + " " + name + " " + artist + " " + genre);
    }

    public void delete(int year) {
        System.out.println("Album deleted: " + year);
    }

    public void update(int year, String name, String artist, String genre) {
        System.out.println("Album updated: " + year + " " + name + " " + artist + " " + genre);
    }

    public void select(int year) {
        System.out.println("Album selected: " + year);
    }

    public void selectAll() {
        System.out.println("Album selected");
    }

       public void selectByName(String name) {
            System.out.println("Album selected: " + name);
        }

        public void selectByArtist(String artist) {
            System.out.println("Album selected: " + artist);
        }

        public void selectByGenre(String genre) {
            System.out.println("Album selected: " + genre);
        }

    public void selectByYear(int year) {
            System.out.println("Album selected: " + year);
        }

     public void selectByYearAndName(int year, String name) {
            System.out.println("Album selected: " + year + " " + name);
        }
    public void selectByYearAndNameAndArtist(int year, String name, String artist) {
            System.out.println("Album selected: " + year + " " + name + " " + artist);
        }

}
