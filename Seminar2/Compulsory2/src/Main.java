
import javax.print.attribute.standard.PrinterLocation;
import java.util.Scanner;

//The best Route problem -> Clases creating
public class Main {
    public static void main(String[] args) {
        Print p = new Print();
        Coordonates coordonates=new Coordonates(12f,3.6f);
        StringBuilder stringBuilder = new StringBuilder("Bucuresti");
        Location loc = new Location(stringBuilder, Location.locationTypes.GasStation,coordonates);
        Road roads =new Road(132f,2500f, Road.roadsType.Express);
        p.PrintLocation(loc);
        p.PrintRoads(roads);
      //  System.out.println(loc);
      //  System.out.println(roads);
    }
}

//Fiecare locatie are coordonate ,nume,tip
//Fiecare Drum are lungime,limitaviteza,tip;



