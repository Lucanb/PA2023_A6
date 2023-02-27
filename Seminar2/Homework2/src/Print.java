public class Print{

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