import java.util.Scanner;

//BONUS:
//Inca din citire vom restriction ca graful ce poate fi citit sa fie ciclu   (pct 1))
//La punctul 2 citim o matrice de adiacenta pentru un graf regular (dupa nr de vf si gradul fiecaruia - vom face verif pe muchii de asemeni.)
public class Main {
    static int Matrix[][] = new int[30][30];
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void ReadP1(int n,int m){

        int v[] = new int[40];
        for(int i=0;i<n;i++)
        {
            Scanner keyboard =new Scanner(System.in);
            System.out.println("Please enter the i-th vertex in graph");
           //Citesc n,m; din main
            //citim fiecare vf
            int x=keyboard.nextInt();
            v[i]=x;

            if(i>=1)
            {
                Matrix[v[i-1]][v[i]] = 1;
                Matrix[v[i]][v[i-1]] = 1;
            }
        }

    }

    public static void ReadP2(int n,int degree){
       // aici  pentru fiecare varf cam trebuie sa stim muchiile (clar gradul fiecarui vf este degree deci dupa ce citesc un vf ,  maxim 3 muchii).
        //Default consider ca vf sunt alese in ordine de la 1 la n.
        for(int i=0;i<n;i++)
        {
            //Linia 0 = vf 1 -> aleg degree muchii adiacente
            for(int j=0;j<degree;j++)
            {
                Scanner keyboard =new Scanner(System.in);
                System.out.println("Please enter the x and y vertexes for a edge");
                //Citesc n,m; din main
                //citim fiecare vf
                int x=keyboard.nextInt();   ///DE GANDIT LA CITIREA ASTA
               //Scanner keyboard =new Scanner(System.in);
                int y=keyboard.nextInt();
                Matrix[x][y]=1;
            }
        }
    }
}

class Mat{
    static int M[][] = new int [100][100];
}

class Proprities{
   //Aici facem 2 functii pentru inmultirea matricilor(o functie se ocupa de calcularea lui A*A iar alta va face A^n in timp log)
     public static Mat Prod(Mat a,Mat b,int dim){
         Mat M = new Mat();
         for(int i=0;i<dim ;i++)
             for(int j=0;j<dim;j++)
               for(int k=1;k<dim;k++)
                M.M[i][j]= M.M[i][j]+a.M[i][k]*a.M[k][j];  //sa modific indicii cu dimensiuni desi matricea oricum e matratica

         return M;
     }

    public static Mat pwr(Mat M,int n,int dim)
    {
         M=new Mat();
         Mat nullMat = new Mat();
         for(int i=0;i<dim;i++)
             nullMat.M[i][i]=1;

         if(n==0)
         {
            return nullMat;
         }
         else
         {
           if( n%2 == 1)
           {
             return Prod(M,pwr(Prod(M,M,dim),n/2,dim),dim);
           }
             return pwr(Prod(M,M,dim),n/2,dim);
         }
    }
}
