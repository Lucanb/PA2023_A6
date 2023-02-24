import java.util.Scanner;

//BONUS:
//Inca din citire vom restriction ca graful ce poate fi citit sa fie ciclu   (pct 1))
//La punctul 2 citim o matrice de adiacenta pentru un graf regular (dupa nr de vf si gradul fiecaruia - vom face verif pe muchii de asemeni.)
public class Main {
    static Mat M;
    static Mat M2;
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Please enter the x and y for a degree");
        //Citesc n,m; din main
        //citim fiecare vf
        int n=keyboard.nextInt();
        int degree=keyboard.nextInt();

        //Punctul 1:
        ReadP1(n);
        //Aceasta este matricea de inceput:
        Afisare(M,n);
        System.out.println("Va rog cititi k putere la care doriti sa ridicati amtricea");
        int k = keyboard.nextInt();
         Proprities.pwr(M,k,n);
        //Aceasta este matricea finala M^n:
        Afisare(M,n);
        //Punctul 2:
        ReadP2(n,degree);
        //Aceasta este ,matricea finala:
        Afisare(M2,n);
    }

    public static void Afisare(Mat M,int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(M.M[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void ReadP1(int n){

        int v[] = new int[40];
        Scanner keyboard =new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print("Print the ");
            System.out.print(i+1);
            System.out.println("-th element");
           //Citesc n,m; din main
            //citim fiecare vf
            int x=keyboard.nextInt();
            v[i]=x;

            if(i>=1)
            {
                M.M[v[i-1]-1][v[i]-1] = 1;
                M.M[v[i]-1][v[i-1]-1] = 1;
            }
        }

    }

    public static void ReadP2(int n,int degree){
       // aici  pentru fiecare varf cam trebuie sa stim muchiile (clar gradul fiecarui vf este degree deci dupa ce citesc un vf ,  maxim 3 muchii).
        //Default consider ca vf sunt alese in ordine de la 1 la n.
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Please enter the x and y vertexes for a edge");
        for(int i=0;i<n;i++)
        {
            //Linia 0 = vf 1 -> aleg degree muchii adiacente
            for(int j=0;j<degree;j++)
            {

                //Citesc n,m; din main
                //citim fiecare vf
                int x=keyboard.nextInt();   ///DE GANDIT LA CITIREA ASTA
               //Scanner keyboard =new Scanner(System.in);
                int y=keyboard.nextInt();
                M2.M[x][y]=1;
            }
        }
    }


}

class Mat{
    static int M[][] = new int [100][100];
}

class Proprities{
   //Aici facem 2 functii pentru inmultirea matricilor(o functie se ocupa de calcularea lui A*A iar alta va face A^n in timp log)
     public static Mat Prod(Mat a,Mat b,int dim){ //////////PROBLEMA
         Mat Ma = new Mat();
        /* for(int i=0;i<dim;i++)
         {
             for (int j = 0; j < dim; j++)
                 Ma.M[i][j]=0;
         }
        */
         for(int i=0;i<dim ;i++)
             for(int j=0;j<dim;j++) {
                 for (int k = 0; k < dim; k++)
                     Ma.M[i][j] = Ma.M[i][j] + a.M[i][k] * b.M[k][j];  //sa modific indicii cu dimensiuni desi matricea oricum e matratica
             }

         for(int i=0;i<dim;i++)
         {
             for (int j = 0; j < dim; j++) {
                 System.out.print(Ma.M[i][j]);
                 System.out.print(" ");
             }
             System.out.println("");
         }

         return Ma;
     }

    public static Mat pwr(Mat Matrix,int n,int dim)
    {
         Matrix=new Mat();
         Mat nullMat = new Mat();
         for(int i=0;i<dim;i++)
             for(int j=0;j<dim;j++)
                if(i == j) {
                    nullMat.M[i][j] = 1;
                }
                  else
                {
                   nullMat.M[i][j]=0;
                }

         if(n==0)
         {
            return nullMat;
         }
         else
         {
           if( n%2 == 1)
           {
             return Prod(Matrix,pwr(Prod(Matrix,Matrix,dim),n/2,dim),dim);
           }
           else {
               return pwr(Prod(Matrix, Matrix, dim), n / 2, dim);
           }
         }
    }
}
