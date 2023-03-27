package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class ConfigPanel extends GridPane {
    private final MainFrame frame;

    private Button createNew;
    private Spinner<Integer> nrNodes;
    private Label numberOfDots;
    private Label lineProbability;
    private ObservableList<String> shapeList;
    private ComboBox lineProb;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        lineProbability = new Label("Line Probability");
        shapeList = FXCollections.observableArrayList("1.0", "0.9","0.8","0.7","0.6", "0.5","0.4","0.3", "0.2","0.1","0.0");
        lineProb = new ComboBox<>(shapeList);
        lineProb.setValue("1.0");
        lineProb.setOnAction((a) -> {
            if(lineProb.getValue().equals("1.0")) {
                this.getColumnConstraints().clear();
                this.getChildren().clear();
                this.add(lineProbability, 1, 0);
                this.add(lineProb, 1, 1);
                initGraph();
            }
            else {
                this.getColumnConstraints().clear();
                this.getChildren().clear();
                this.add(lineProbability, 1, 0);
                this.add(lineProb, 1, 1);
                initGraph();
            }
        });
        this.add(lineProbability, 1, 0);
        this.add(lineProb, 1, 1);
        initGraph();
    }

    private void initGraph() {
      //  createGame = new Label("Create new Game");
        createNew = new Button("Create New Game");
        numberOfDots = new Label("Number of Dots");
        nrNodes = new Spinner<>(1, 250, 10, 1);
        nrNodes.setEditable(true);

        this.add(numberOfDots, 0, 0);
        this.add(nrNodes, 0, 1);
        this.add(createNew, 2, 1);


        ColumnConstraints column = new ColumnConstraints();
        column.setPercentWidth(33);
        this.getColumnConstraints().addAll(column, column, column);
    }

    public Button getButton() {
        return createNew;
    }

    public String getSelectedShape() {
        return (String) lineProb.getValue();
    }

    public Spinner<Integer> getNrNodes() {
        return nrNodes;
    }
}