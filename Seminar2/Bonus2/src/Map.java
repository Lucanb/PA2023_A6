import java.security.KeyPair;
import java.util.List;
import java.util.Vector;

public class Map {
    int numberCities;
    int roadsNumber;

    //Vect de Roads-uri ,vect de Locations; (pt verificarea lor) ~ a list
     Vector<Road> roadVector = new Vector<>(500);
     Vector<Location> locationVector = new Vector<>(500);
    //matrice de coorodonate cu 1 sau 0 cost(daca am drum)

    //Vect cu id intre orase (il iau de la 0 la n); si pe matrice la fel voi avea exact dependenta de id-uri.
    int vectId[] = new int[500];
    double costMatrix[][] = new double[500][500];


    //adaug operatori de supra incarcare(addRoad,addCity)
    public void addRoad(Road road){
       for(int i=0;i<roadsNumber;i++)
           if(road.equals(roadVector.get(i)))
           {
              System.out.println("Error,this road exists!");
           }
       else{
              if(road.getLength()>=road.distance(road.getFirstCity(),road.getSecondCity())) {
                  int x=-1, y=-1; //Trebuie sa vad in lista
                  for(int j=0;j<locationVector.size();j++)
                  {
                         if(locationVector.get(j).getCoord() == road.getFirstCity())
                             x=j;
                         if(locationVector.get(j).getCoord() == road.getSecondCity())
                             y=j;

                  }
                  if(x!=-1 && y!= -1) {
                      roadVector.add(road);
                      costMatrix[x][y] = road.getLength();
                      costMatrix[y][x] = road.getLength();
                      roadsNumber++;
                  }else
                  {
                      System.out.println("A city doe not exists!");
                  }

              }
              else
              {
                  System.out.println("Wrong Road Distance");
              }
           }
    }
    public void addCity(Location location){
        for(int i=0;i<numberCities;i++)
            if(location.equals(locationVector.get(i)))
            {
                System.out.println("Error,this road exists!");
            }
            else
            {
                vectId[numberCities]=numberCities;
                locationVector.add(location);
                numberCities++;
            }
    }
    public void PossibleCity(Location locationStart,Location locationFinish){
          for(int i=0;i<roadVector.size();i++)
              if(locationStart.equals(roadVector.get(i).getFirstCity()) && locationFinish.equals(roadVector.get(i).getSecondCity()))
              {
                System.out.println("It exists such a road from the 2 cities!");
              }
              else
              {
                  System.out.println("It doesn't exists such a road from the 2 cities!");
              }

    }
    public double optimalDist(Location location1,Location location2)
    {
          double min=10000;

          return min;
    }
    public Map(){
          roadsNumber=0;
          numberCities=0;
    }
}
