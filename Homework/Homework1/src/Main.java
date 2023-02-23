import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pleas enter an integer bigger that 0");
        int myint = keyboard.nextInt();
          if(myint <=0 )
          {
              System.out.println("Not a valide number");
          }
              else
        {
              TransformareMatrice.Write();
        }
    }
}

class TransformareMatrice{
    public static void Write()
    {
        System.out.println("I like apples");
    }
}