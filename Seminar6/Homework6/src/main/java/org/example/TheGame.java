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
    private transient final Map<Line,Player>playersMove;
    private transient List<Line> uncolouredLines;
    private final Map<String,List<SerializateLines>>playersMoveSerialized;
    private final List<SerializateLines>uncolouredLinesSerialized;
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

    public Map<Line, Player> getPlayersMove() {
        return playersMove;
    }

    public Map<String, List<SerializateLines>> getPlayersMoveSerialized() {
        return playersMoveSerialized;
    }

    public void setUncolouredLines(List<Line> uncolouredLines) {
        this.uncolouredLines = uncolouredLines;
    }

    public List<Line> getUncolouredLines() {
        return uncolouredLines;
    }

    public List<SerializateLines> getUncolouredLinesSerialized() {
        return uncolouredLinesSerialized;
    }

    public void addMove(Line line,Player player)
    {
        if (firstPlayer.getPlayerName().equals(player.getPlayerName())) {
            secondPlayerMove = secondPlayer;
        } else if (secondPlayer.getPlayerName().equals(player.getPlayerName())) {
            secondPlayerMove = firstPlayer;
        }

        this.playersMove.put(line, player);
    }

    public boolean moveValid(Line line)
    {
        return playersMove.containsKey(line);
    }
    public boolean isMoved(){
        return (this.playersMove.size() == 0);
    }
    @Override
    public String toString() {
        return "TheGame{" +
                "firstPlayer=" + firstPlayer +
                ", secondPlayer=" + secondPlayer +
                ", firstPlayerMove=" + firstPlayerMove +
                ", secondPlayerMove=" + secondPlayerMove +
                ", numberDots=" + numberDots +
                ", lineProbability=" + lineProbability +
                ", playersMove=" + playersMove +
                ", uncolouredLines=" + uncolouredLines +
                ", playersMoveSerialized=" + playersMoveSerialized +
                ", uncolouredLinesSerialized=" + uncolouredLinesSerialized +
                '}';
    }

    public TheGame()
    {
        this.playersMove = new HashMap<>();
        this.playersMoveSerialized = new HashMap<>();
        this.uncolouredLines = new ArrayList<>();
        this.uncolouredLinesSerialized = new ArrayList<>();
    }
    public TheGame(Player playerFirst,Player playerSecond,Integer numberDots,Double lineProbability)
    {
        setFirstPlayer(playerFirst);
        setSecondPlayer(playerSecond);
        setNumberDots(numberDots);
        setLineProbability(lineProbability);

        // setFirstPlayerMove(playerFirst.getColor():playerFirst == Color.Red ? playerFirst:playerSecond);
        // setSecondPlayerMove(playerFirst.getColor():playerSecond == Color.Yellow ? playerSecond:playerSecond);
        firstPlayerMove = playerFirst.getColor() == javafx.scene.paint.Color.RED ? playerFirst : playerSecond;
        secondPlayerMove = playerSecond.getColor() == Color.BLUE ? playerFirst : playerSecond;

    }

}
