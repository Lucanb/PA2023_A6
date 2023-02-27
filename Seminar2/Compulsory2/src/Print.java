public class Print {
        Print() {
        }

        public void PrintLocation(Location var1) {
            System.out.print(var1.getCoord().x);
            System.out.print(" ");
            System.out.println(var1.getCoord().y);
            System.out.println(var1.getName());
            System.out.println(var1.getType());
        }

        public void PrintRoads(Road var1) {
            System.out.println(var1.getLength());
            System.out.println(var1.getSpeedLimit());
            System.out.println(var1.getType());
        }
}
