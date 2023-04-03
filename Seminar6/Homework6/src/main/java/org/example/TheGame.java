package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheGame {
    private Player firstPlayer;
    private Player secondPlayer;
    private Player firstPlayerMove;
    private Player secondPlayerMove;
    private Integer numberDots;
    private Double lineProbability;

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }
    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }
    public Player getSecondPlayer() {
        return secondPlayer;
    }
    public void setFirstPlayerMove(Player firstPlayerMove) {
        this.firstPlayerMove = firstPlayerMove;
    }

    public Player getFirstPlayerMove() {
        return firstPlayerMove;
    }

    public void setSecondPlayerMove(Player secondPlayerMove) {
        this.secondPlayerMove = secondPlayerMove;
    }

    public Player getSecondPlayerMove() {
        return secondPlayerMove;
    }

    public void setNumberDots(Integer numberDots) {
        this.numberDots = numberDots;
    }

    public Integer getNumberDots() {
        return numberDots;
    }

    public void setLineProbability(Double lineProbability) {
        this.lineProbability = lineProbability;
    }

    public Double getLineProbability() {
        return lineProbability;
    }

    public TheGame() {

    }


}
