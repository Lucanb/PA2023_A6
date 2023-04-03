package org.example;

import java.util.Objects;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.scene.shape.Line;
public class SerializateLines {
   private double firstX;
   private double firstY;
   private double secondX;
   private double secondY;

   public static SerializateLines myLine(Line line)
   {
       return new SerializateLines(line.getStartX(),line.getStartY(),line.getEndX(),line.getEndY());
   }
    public Line toLine() {
        return new Line(firstX, firstX, secondX, secondY);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerializateLines)) return false;
        SerializateLines that = (SerializateLines) o;
        return Double.compare(that.firstX, firstX) == 0 && Double.compare(that.firstY, firstY) == 0 && Double.compare(that.secondX, secondX) == 0 && Double.compare(that.secondY, secondY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstX, firstY, secondX, secondY);
    }

    @Override
    public String toString() {
        return "SerializateLines{" +
                "firstX=" + firstX +
                ", firstY=" + firstY +
                ", secondX=" + secondX +
                ", secondY=" + secondY +
                '}';
    }

    public void setFirstX(double firstX) {
        this.firstX = firstX;
    }

    public double getFirstX() {
        return firstX;
    }

    public void setFirstY(double firstY) {
        this.firstY = firstY;
    }

    public double getFirstY() {
        return firstY;
    }

    public void setSecondX(double secondX) {
        this.secondX = secondX;
    }

    public double getSecondX() {
        return secondX;
    }

    public void setSecondY(double secondY) {
        this.secondY = secondY;
    }

    public double getSecondY() {
        return secondY;
    }
    public SerializateLines()
    {
       setFirstX(0.0);
       setFirstY(0.0);
       setSecondX(5.0);
       setSecondY(6.0);
    }
    public SerializateLines(Double firstX, Double firstY, Double secondX, Double secondY)
    {
        setFirstX(firstX);
        setFirstY(firstY);
        setSecondX(secondX);
        setSecondY(secondY);
    }


}
