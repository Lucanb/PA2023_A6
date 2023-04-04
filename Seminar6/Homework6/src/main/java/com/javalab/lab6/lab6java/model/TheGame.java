package com.javalab.lab6.lab6java.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.io.*;
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

    public boolean isIntersecting(Line line1,Line line2){
        double x1 = line1.getStartX();
        double y1 = line1.getStartY();
        double x2 = line1.getEndX();
        double y2 = line1.getEndY();
        double x3 = line2.getStartX();
        double y3 = line2.getStartY();
        double x4 = line2.getEndX();
        double y4 = line2.getEndY();

        double dx12 = x2 - x1;
        double dy12 = y2 - y1;
        double dx34 = x4 - x3;
        double dy34 = y4 - y3;

        double denominator = (dy12 * dx34 - dx12 * dy34);

        if (denominator == 0) {
            return false;
        }

        double t1 = ((x1 - x3) * dy34 + (y3 - y1) * dx34) / denominator;
        if (t1 < 0 || t1 > 1) {
            return false;
        }

        double t2 = ((x3 - x1) * dy12 + (y1 - y3) * dx12) / -denominator;
        if (t2 < 0 || t2 > 1) {
            return false;
        }

        return true;
    }

    public boolean trinagleExists(List<Line> lines)
    {
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                for (int k = j + 1; k < lines.size(); k++) {
                    Line line1 = lines.get(i);
                    Line line2 = lines.get(j);
                    Line line3 = lines.get(k);
                    if (isIntersecting(line1, line2) && isIntersecting(line1, line3) && isIntersecting(line2, line3))
                        return true;
                }
            }
        }
         return false;
    }
    public boolean shoWiner(Player player)
    {
        List<Line> listPlayer = new ArrayList<>();
        playersMove.forEach((key,value)->{
           if(value == player)
           {
               listPlayer.add(key);
           }
        });

        if(listPlayer.size() < 3)
        {
            return false;
        }
        boolean triangleIs = trinagleExists(listPlayer);
        if(triangleIs)
            resetThisGame();
        return  triangleIs;
    }
    public void Load(){
      playersMove.clear();
      uncolouredLines.clear();

      Gson gson = new Gson();
        FileReader fileReader;
      try
      {
         fileReader=new FileReader("myGame.json");

         TheGame theGameDeserializated = gson.fromJson(fileReader,TheGame.class);
         this.firstPlayer=theGameDeserializated.getFirstPlayer();
         this.secondPlayer=theGameDeserializated.getSecondPlayer();
         this.firstPlayerMove=theGameDeserializated.getFirstPlayerMove();
         this.secondPlayerMove=theGameDeserializated.getSecondPlayerMove();
         this.numberDots=theGameDeserializated.getNumberDots();
         Map<String,List<SerializateLines>> playerMoveSerializated = theGameDeserializated.getPlayersMoveSerialized();

         playerMoveSerializated.entrySet().forEach(theGameDeserializatedEntry->{
             Player player =theGameDeserializatedEntry.getKey().equals(firstPlayer.getPlayerName()) ? firstPlayer:secondPlayer;
             List<SerializateLines>  serializateLines = theGameDeserializatedEntry.getValue();
             serializateLines.stream().forEach(serializateLinesEntry->{
                Line line =serializateLinesEntry.toLine();
                this.playersMove.put(line,player);
             });
         });

         List<SerializateLines> serializateLines =theGameDeserializated.getUncolouredLinesSerialized();
         serializateLines.forEach(line->{
             uncolouredLines.add(line.toLine());
         });

         theGameDeserializated.getPlayersMoveSerialized().clear();
         theGameDeserializated.getUncolouredLinesSerialized().clear();
      }catch(FileNotFoundException e){
              e.printStackTrace();
        }
    }
    public void Save(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       this.playersMove.forEach((key,value)->{
           List<SerializateLines> serializateLines = playersMoveSerialized.get(value.getPlayerName());
           if(serializateLines==null)
           {
               serializateLines=new ArrayList<>();
               playersMoveSerialized.put(value.getPlayerName(),serializateLines);
           }
           serializateLines.add(SerializateLines.myLine(key));
       });
       this.getUncolouredLines().forEach(line->{
           this.uncolouredLinesSerialized.add(SerializateLines.myLine(line));
       });

       String gameJson = gson.toJson(this);

       try(PrintWriter out= new PrintWriter(new FileWriter("myGame.json"))){
            out.write(gameJson);
       }catch(Exception e){
           e.printStackTrace();
        }finally {
           playersMoveSerialized.clear();
           uncolouredLinesSerialized.clear();
       }
    }
    public void resetThisGame()
     {
         this.playersMove.clear();
         this.playersMoveSerialized.clear();
         this.firstPlayer=null;
         this.secondPlayer=null;
         this.firstPlayerMove=null;
         this.secondPlayerMove=null;
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
        this();
        setFirstPlayer(playerFirst);
        setSecondPlayer(playerSecond);
        setNumberDots(numberDots);
        setLineProbability(lineProbability);

        // setFirstPlayerMove(playerFirst.getColor()==playerFirst.getColor() == Color.RED ? playerFirst:playerSecond);
        // setSecondPlayerMove(playerSecond.getColor()==playerSecond.getColor() == Color.YELLOW ? playerFirst:playerSecond);
        this.firstPlayerMove = playerFirst.getColor() == Color.RED ? playerFirst : playerSecond;
        this.secondPlayerMove = playerSecond.getColor() == Color.YELLOW ? playerFirst : playerSecond;

    }

}
