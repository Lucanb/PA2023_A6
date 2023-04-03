package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyAplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyAplication.class.getResource("mainframe-view.fxml")); ///
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Drawing");
        stage.setScene(scene);
    }
}
