package org.example;

public class Album extends Superclass{
    private String name;
    private String artist;
    private String genre;
    private Integer year;

    private Integer artist_id;

    private Integer genre_id;

    public Album(String name, String artist, String genre, int year) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
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


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   public Integer getArtist_id() {
        return artist_id;
    }
    public Integer getGenre_id() {
        return genre_id;
    }
    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
