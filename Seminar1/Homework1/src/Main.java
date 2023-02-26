import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pleas enter an integer bigger that 0");
        int n = keyboard.nextInt();
        if (n <= 0) {
            System.out.println("Not a valide number");
        } else if (n < 30000) {
            int M[][] = new int[n][n];
            ;
            TransformareMatrice.CreeateMatrix(M, n);
            TransformareMatrice.Afisare(M, n);
        } else {
            //Aici este necesar numai timpul rularii aplicatiei;
            int M[][] = new int[n][n];
            TransformareMatrice T = new TransformareMatrice();
            T.CreeateMatrix(M, n);
            T.AfisareTimp();
        }

    }
}

class TransformareMatrice {
    //Clar ca matricea o vom creea pe baza permutariilor unei linii(fac o matrice circulara)

    //  static const time = Date;
    static Clock clock = Clock.systemDefaultZone();
    static long time;

    public TransformareMatrice() {
        long time = clock.millis();
    }

    public static void CreeateMatrix(int M[][], int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if ((i + j + 1) % n != 0)
                    M[i][j] = (i + j + 1) % n;
                else
                    M[i][j] = n;
            }
        time = clock.millis() - time;
    }

    public static void Afisare(int M[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void AfisareTimp() {
        System.out.print(time);

    }
}
