
import javax.print.attribute.standard.PrinterLocation;
import java.util.Scanner;

//The best Route problem -> Clases creating
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//Fiecare locatie are coordonate ,nume,tip
//Fiecare Drum are lungime,limitaviteza,tip;


class Print{

    public void PrintLocation(Location loc){
         System.out.print(loc.getCoord().x);
         System.out.print(" ");
         System.out.println(loc.getCoord().y);
         System.out.println(loc.getName());
         System.out.println(loc.getType());
    }

    public void PrintRoads(Road road){
        System.out.println(road.getLength());
        System.out.println(road.getSpeedLimit());
        System.out.println(road.getType());
    }
}
class Coordonates {
    Float x;
    Float y;

};

class Location {

    public enum locationTypes {
        City, Airport, GasStation
    }
    ;
    private StringBuilder Name;
    private locationTypes type;
    private Coordonates coord;

    public void setName(StringBuilder Name1) {
        Name=Name1;
    }

    public void setType(locationTypes type1) {
        type = type1;
    }

    public void setCoord(Coordonates coord1) {
        coord = coord1;
    }

    public StringBuilder getName() {
        return Name;
    }

    public locationTypes getType() {
        return type;
    }

    public Coordonates getCoord() {
        return coord;
    }

    public Location(StringBuilder Name1, locationTypes types1, Coordonates coord1) {
        setCoord(coord1);
        setType(types1);
        setName(Name1);
    }
}

class Road {
    public enum roadsType {
        HighWay, Express, Country
    }

    ;
    private roadsType type;
    private Float length;
    private Float speedLimit;

    public void setType(roadsType type1) {
        type = type1;
    }

    public void setLength(Float length1) {
        length = length1;
    }

    public void setSpeedLimit(Float speedLimit1) {
        speedLimit = speedLimit1;
    }

    public Float getLength() {
        return length;
    }

    public Float getSpeedLimit() {
        return speedLimit;
    }

    public roadsType getType() {
        return type;
    }

    public Road(Float speedLimit1, Float length1, roadsType type1) {
        setLength(length1);
        setType(type1);
        setSpeedLimit(speedLimit1);
    }

}



