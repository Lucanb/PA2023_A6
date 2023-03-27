package org.example;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Pair;

import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.Math.*;

public class DrawingPanel extends FlowPane {
    private final MainFrame frame;
    public final static int WIDTH = 512, HEIGHT = 512;

    public Canvas imageCanvas;
    public GraphicsContext graphicsContext;

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void drawGraph(int n, double probability) {
        Map<Pair<Double, Double>, Pair<Double, Double>> myGraph = new HashMap<>();
        ArrayList<Double> vec1 = new ArrayList<>();
        ArrayList<Double> vec2 = new ArrayList<>();
        double coordCentru1 = this.imageCanvas.getHeight() / 2 + this.imageCanvas.getWidth() / 2;
        double coordCentru2 = this.imageCanvas.getHeight() / 2 + this.imageCanvas.getWidth() / 2;
        double r = coordCentru2 * 0.3;
        int m = (int) (probability * (n * (n - 1) / 2));
        int maxtrx[][] = new int[500][500]; //la nimereala duc muchia intre 2 nevizitate. Ca sa nu fiu futut de rand pot sa scot punctele din lista.
        double constant = Math.random() * n;
        for (int i = 0; i < n; i++) {
            java.awt.Point point = new Point();
            double x = coordCentru1 + r * cos(constant * 2 * PI / n);
            double y = coordCentru2 + r * sin(constant * 2 * PI / n);
            vec1.add(x);
            vec2.add(y);// si asa am adaugat punctele din graful meu.
        }

        //Cele n puncte desenate
        for (int i = 0; i < n; i++) {
            graphicsContext.fillOval(vec1.get(i), vec2.get(i), 0.2, 0.3);
        }

        int i = 0;

        while (i < m) {
            int k = (int) (Math.random() * n);
            int l = (int) (Math.random() * n);
            Pair<Double, Double> point1 = new Pair<Double, Double>(vec1.get(k), vec2.get(k));
            Pair<Double, Double> point2 = new Pair<Double, Double>(vec1.get(l), vec2.get(l));

            if (myGraph.get(point1) == point2) {
                continue;
            } else {
                myGraph.put(point1, point2);
                graphicsContext.strokeLine(point1.getKey(), point1.getValue(), point2.getKey(), point2.getValue());
                i++;
            }

        }

    }

    private void init() {
        imageCanvas = new Canvas(WIDTH, HEIGHT);
        graphicsContext = imageCanvas.getGraphicsContext2D();

        graphicsContext.setLineWidth(2);
        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, WIDTH, HEIGHT);

        imageCanvas.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if (frame.configPanel.getOnMouseClicked().equals(frame.configPanel.getButton())) {
                drawGraph(frame.configPanel.getNrNodes().getValue(), Integer.parseInt(frame.configPanel.getSelectedShape()));
            } else {
                drawGraph(frame.configPanel.getNrNodes().getValue(), Integer.parseInt(frame.configPanel.getSelectedShape()));
            }
        });

        this.getChildren().add(imageCanvas);
    }

    public Image getImage() {
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);
        return imageCanvas.snapshot(params, null);
    }

    public void setImage(Image image) {
        graphicsContext.drawImage(image, 0, 0, WIDTH, HEIGHT);
    }

    public void resetImage() {
        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, WIDTH, HEIGHT);
    }
}