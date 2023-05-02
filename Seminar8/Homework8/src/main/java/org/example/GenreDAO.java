package org.example;

public class GenreDAO {

    public void createGenre(Genre genre){
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO GENRE (Name) VALUES (?)");
            preparedStatement.setString(1, genre.getGenre());
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void create(String name) {
        try {
            Database.createConnection();
            java.sql.PreparedStatement preparedStatement = Database.getConnection().prepareStatement("INSERT INTO GENRE (Name) VALUES (?)");
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            Database.getConnection().commit();
            Database.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
