import javax.print.attribute.standard.PrinterLocation;

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
        public void PrintLocation(String a)
        {
            System.out.println(a);
        }

         public void PrintRoads(String a)
         {
           System.out.println(a);
         }
}
