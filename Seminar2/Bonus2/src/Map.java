import java.security.KeyPair;
import java.util.List;
import java.util.Vector;

public class Map {
    int numberCities;
    int roadsNumber;

    //Vect de Roads-uri ,vect de Locations; (pt verificarea lor) ~ a list
    Vector<Road> roadVector = new Vector<Road>(500);
    Vector<Location> locationVector = new Vector<Location>(500);
    //matrice de coorodonate cu 1 sau 0 cost(daca am drum)

    //Vect cu id intre orase (il iau de la 0 la n); si pe matrice la fel voi avea exact dependenta de id-uri.
    int vectId[] = new int[500];
    double costMatrix[][] = new double[500][500];


    //adaug operatori de supra incarcare(addRoad,addCity)
    public void addRoad(Road road) {
        int sw = 0;
        for (int i = 0; i < roadsNumber; i++)
            if (road.equals(roadVector.get(i))) {
                System.out.println("Error,this road exists!");
                sw = 1;
            }
        if (sw == 0) {
            if (road.getLength() >= road.distance(road.getFirstCity(), road.getSecondCity())) {
                int x = -1, y = -1; //Trebuie sa vad in lista
                for (int j = 0; j < locationVector.size(); j++) {
                    if (locationVector.get(j).getCoord() == road.getFirstCity())
                        x = j;
                    if (locationVector.get(j).getCoord() == road.getSecondCity())
                        y = j;

                }
                if (x != -1 && y != -1) {
                    roadVector.add(road);
                    costMatrix[x][y] = road.getLength();
                    costMatrix[y][x] = road.getLength();
                    roadsNumber++;
                } else {
                    System.out.println("A city doe not exists!");
                }

            } else {
                System.out.println("Wrong Road Distance");
            }
        } else {
            System.out.println("Canno t inser the road");
        }
    }

    public void addCity(Location location) {
        int sw = 0;
        for (int i = 0; i < numberCities; i++)
            if (location.equals(locationVector.get(i))) {
                System.out.println("Error,this city exists!");
                sw = 1;
            }
        if (sw == 0) {
            vectId[numberCities] = numberCities;
            locationVector.add(location);
            numberCities++;
        } else {
            System.out.println("Cannot add the city");
        }
    }

    public void PossibleCity(Location locationStart, Location locationFinish) {
        int sw = 0;
        for (int i = 0; i < roadVector.size(); i++) {
            if (locationStart.getCoord().equals(roadVector.get(i).getFirstCity())) {
                sw++;
            }
            if (locationFinish.getCoord().equals(roadVector.get(i).getSecondCity())) {
                sw++;
            }
        }
        if (sw == 2) {
            System.out.println("It exists such a road!");
        } else {
            System.out.println("It doesn't exists such a road from the 2 cities!");
        }

    }

    public Map() {
        roadsNumber = 0;
        numberCities = 0;
    }
}
