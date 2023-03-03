
import javax.print.attribute.standard.PrinterLocation;
import java.util.Objects;
import java.util.Scanner;

//The best Route problem -> Clases creating
public class Main {
    public static void main(String[] args) {

        Map map = new Map();
        Coordonates coordonates1=new Coordonates(12.0,3.6);
        Coordonates coordonates2=new Coordonates(13.0,4.6);
        AirPort airPort = new AirPort(123);
        HighWay roadType = new HighWay("Express");
        StringBuilder stringBuilder = new StringBuilder("Bucuresti");
       // Location loc = new Location(stringBuilder, airPort,coordonates);
       // Road roads =new Road(132d,2500d, roadType);
       // System.out.println(loc.toString());
       // System.out.println(roads.toString());
        Location loc1 = new Location("Buc",roadType,coordonates1);
        Location loc2 = new Location("Iasi",roadType,coordonates2);
        Road road = new Road(coordonates1,coordonates2,143.5,10,roadType);
        map.addCity(loc1);
        map.addCity(loc2);
        map.addRoad(road);
       // System.out.println(map.locationVector.get(map.numberCities).toString());
        /*  for(int i=0;i<=1;i++)
            for(int j=0;j<=1;j++)
            {
                System.out.println(map.costMatrix[i][j]);
            }

       */
    }
}



