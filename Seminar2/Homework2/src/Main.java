
import javax.print.attribute.standard.PrinterLocation;
import java.util.Objects;
import java.util.Scanner;

//The best Route problem -> Clases creating
public class Main {
    public static void main(String[] args) {

        Map map = new Map();
        Coordonates coordonates1=new Coordonates(12.0,3.6);
        Coordonates coordonates2=new Coordonates(13.0,4.6);
        Coordonates coordonates3=new Coordonates(15.0,4.6);

        AirPort airPort = new AirPort(123);
        HighWay roadType = new HighWay("Express");
        StringBuilder stringBuilder = new StringBuilder("Bucuresti");
       // Location loc = new Location(stringBuilder, airPort,coordonates);
       // Road roads =new Road(132d,2500d, roadType);
       // System.out.println(loc.toString());
       // System.out.println(roads.toString());
        Location loc1 = new Location("Buc",roadType,coordonates1);
        Location loc2 = new Location("Iasi",roadType,coordonates2);
        Location loc3 = new Location("Tulcea",roadType,coordonates3);
        Road road = new Road(coordonates1,coordonates2,143.5,10,roadType);
       // Road road2 = new Road(coordonates1,coordonates3,143.5,10,roadType);
        map.addCity(loc1);
        map.addCity(loc2);
        map.addCity(loc3);
        map.addRoad(road);
      //  map.addRoad(road2);
        //Testez Matricea
          for(int i=0;i<=2;i++) {
              for (int j = 0; j <= 2; j++) {
                  System.out.print(map.costMatrix[i][j]);
                  System.out.print(" ");

              }
              System.out.println("");
          }
         //Drum de la loc 1 la loc 2 exista :
          map.PossibleCity(loc1,loc2);
         //Drum de la loc 1 la loc 3 nu exista:
          map.PossibleCity(loc1,loc3);
    }
}



