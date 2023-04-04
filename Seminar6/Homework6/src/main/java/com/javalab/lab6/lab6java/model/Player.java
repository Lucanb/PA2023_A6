package com.javalab.lab6.lab6java.model;

import javafx.scene.paint.Color;

public class Player {
    private String playerName;
    private Color color;

   public void setPlayerName(String playerName)
   {
       this.playerName=playerName;
   }

   public String getPlayerName()
   {
      return this.playerName;
   }

   public void setColor(Color color)
   {
       this.color=color;
   }

   public javafx.scene.paint.Color getColor()
   {
       return color  == Color.RED ? javafx.scene.paint.Color.RED : javafx.scene.paint.Color.YELLOW;
   }

    public Player()
    {
        setColor(Color.YELLOW);
        setPlayerName("Luca");
    }

    public Player(String playerName,Color color)
    {
        setPlayerName(playerName);
        setColor(color);
    }

}
