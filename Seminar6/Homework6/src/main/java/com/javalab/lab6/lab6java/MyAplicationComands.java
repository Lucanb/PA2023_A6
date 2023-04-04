package com.javalab.lab6.lab6java;
import com.javalab.lab6.lab6java.model.Player;
import com.javalab.lab6.lab6java.model.TheGame;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyAplicationComands {

    public ComboBox<Double> lineProbabilityCombo;
    public Spinner<Integer> numberOfDotsSpinner;
    public Canvas canvasPaneId;
    public TextArea redPlayerName;
    public TextArea yellowPlayerName;

    public Group canvasGroupRoot;
    public AnchorPane mainDialog;
    public TextArea playerToMoveName;

    private TheGame theGame;

    @FXML
    public void initialize() {
        lineProbabilityCombo.getItems().removeAll(lineProbabilityCombo.getItems());
        lineProbabilityCombo.getItems().addAll(0.0, 0.15, 0.25, 0.35, 0.5, 0.65, 0.75, 1.0);
        lineProbabilityCombo.getSelectionModel().select(1.0);
        numberOfDotsSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10));
    }

    public void ResetButton(MouseEvent mouseEvent) {
        canvasGroupRoot.getChildren().clear();
        if (theGame != null) {
            theGame.resetThisGame();
        }
    }

    private EventHandler<MouseEvent> getEventHandlers() {
        return new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Player playerToMove;

                if (theGame.isMoved()) {  //isFirstMove
                    playerToMove = theGame.getFirstPlayerMove();
                } else {
                    playerToMove = theGame.getSecondPlayerMove();
                }

                Line line = (Line) mouseEvent.getSource();

                if (theGame.moveValid(line)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Line already colored, choose another line", ButtonType.OK);
                    alert.showAndWait();
                } else {
                    System.out.println("Coloring line for player " + playerToMove.getPlayerName() + " with color = " + playerToMove.getColor());
                    line.setStroke(playerToMove.getColor());
                    theGame.addMove(line, playerToMove);
                    playerToMoveName.setText(theGame.getSecondPlayerMove().getPlayerName());

                    if (theGame.shoWiner(playerToMove)) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Player " + playerToMove.getPlayerName() + " has won! ", ButtonType.OK);
                        alert.showAndWait();

                        canvasGroupRoot.getChildren().clear();
                    }
                }
            }
        };
    }

    public void NewGameButton(MouseEvent mouseEvent)
    {
       canvasGroupRoot.getChildren().clear();

       String redPlayer =redPlayerName.getText().trim();
       String yellowPlayer = yellowPlayerName.getText().trim();

       Player firstPlayer = new Player(redPlayer, Color.RED);
       Player secondPlayer =new Player(yellowPlayer, Color.YELLOW);

       theGame = new TheGame(firstPlayer,secondPlayer,numberOfDotsSpinner.getValue(),lineProbabilityCombo.getValue());
       playerToMoveName.setText(theGame.getFirstPlayerMove().getPlayerName());

        GraphicsContext gc = canvasPaneId.getGraphicsContext2D();
        gc.setLineWidth(1.0);

       Integer numDots = numberOfDotsSpinner.getValue();
       List<Circle> dots=drawDots(numDots);
       List<Line> uncolouredLines = greyLines(numDots,dots);
       uncolouredLines.forEach(uncolouredLine->uncolouredLine.addEventHandler(MouseEvent.MOUSE_PRESSED, getEventHandlers()));
       theGame.setUncolouredLines(uncolouredLines);
    }
    public void LoadButton(MouseEvent mouseEvent) {
        ResetButton(mouseEvent);
        if (theGame == null) {
            theGame = new TheGame();
        }
        theGame.Load();

        Integer numDots = theGame.getNumberDots();
        Map<Line, Player> playerMap = theGame.getPlayersMove();
        drawDots(numDots);

        theGame.getUncolouredLines().forEach(uncolouredLine -> {
            uncolouredLine.setStroke(Color.GREY);
            uncolouredLine.setStrokeWidth(8);
            canvasGroupRoot.getChildren().add(uncolouredLine);
            uncolouredLine.addEventHandler(MouseEvent.MOUSE_PRESSED, getEventHandlers());
        });

        playerMap.entrySet().forEach(entry -> {
            Player player = entry.getValue();
            Line line = entry.getKey();
            line.setStroke(player.getColor());
            line.setStrokeWidth(5);
            canvasGroupRoot.getChildren().add(line);
        });

        playerToMoveName.setText(theGame.getSecondPlayerMove().getPlayerName());
    }

    public void SaveButton(MouseEvent mouseEvent) throws IOException {
        theGame.Save();
    }

    public void ExitButton(MouseEvent mouseEvent) {
        Platform.exit();
    }

    private List<Line> greyLines(Integer dotsNumber, List<Circle> dots) {
        List<Line> lines = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < dotsNumber; i++) {
            for (int j = i + 1; j < dotsNumber; j++) {
                if (rand.nextDouble() <= lineProbabilityCombo.getValue()) {
                    Line line = new Line(dots.get(i).getCenterX(), dots.get(i).getCenterY(), dots.get(j).getCenterX(), dots.get(j).getCenterY());
                    line.setStroke(javafx.scene.paint.Color.GREY);
                    line.setStrokeWidth(8);
                    canvasGroupRoot.getChildren().add(line);
                    lines.add(line);
                }
            }
        }
        return lines;
    }

    private List<Circle> drawDots(Integer dotsNumber) {
        double centerX = canvasPaneId.getWidth() / 2;
        double centerY = canvasPaneId.getHeight() / 1.7;

        // Create a list to hold the dots
        List<Circle> dots = new ArrayList<>();

        // Calculate the position of each dot around the circle
        for (int i = 0; i < dotsNumber; i++) {
            double angle = 2 * Math.PI * i / dotsNumber;
            int CIRCLE_RADIUS = 250;
            double x = centerX + CIRCLE_RADIUS * Math.cos(angle);
            double y = centerY + CIRCLE_RADIUS * Math.sin(angle);

            // Create the dot
            Circle dot = new Circle(x, y, 10, Color.BLACK);

            // Add the dot to the list and to the scene
            dots.add(dot);
            canvasGroupRoot.getChildren().add(dot);
        }

        return dots;
    }


    public void handleExportPNG(MouseEvent mouseEvent) {
        // Create a writable image from the canvas
        WritableImage writableImage = new WritableImage((int) canvasPaneId.getWidth(), (int) canvasPaneId.getHeight());
        this.canvasGroupRoot.snapshot(null, writableImage);

        File file = new File("image.png");
        // Convert the writable image to a buffered image
        java.awt.image.BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);

        // Save the buffered image as a PNG file
        Platform.runLater(() -> {
            RenderedImage renderedImage = SwingFXUtils.fromFXImage(writableImage, null);
            try {
                ImageIO.write(renderedImage, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
