
import javax.print.attribute.standard.PrinterLocation;
import java.util.Scanner;

//The best Route problem -> Clases creating
public class Main {
    public static void main(String[] args) {

        Coordonates coordonates=new Coordonates(12f,3.6f);
        LocationType locationType = new LocationType("GasStation");
        RoadType roadType = new RoadType("Express");
        StringBuilder stringBuilder = new StringBuilder("Bucuresti");
        Location loc = new Location(stringBuilder, locationType,coordonates);
        Road roads =new Road(132f,2500f, roadType);

        System.out.println(loc.toString());
        System.out.println(roads.toString());
    }
}



