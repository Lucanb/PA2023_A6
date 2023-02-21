import java.util.Scanner;
class Compulsory {
    public static void main (String[] args){
            System.out.println("Hello world!");
            Display();
        }
    private static void array (String[] args){
        String[] array = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
    }

    private static void random(String[] args){
        int n=(int)(Math.random()*1_000_000);
        System.out.println(n);
    }

    public static void toBinary(int decimal,String binary){
        int index = 0;
        while(decimal > 0){
            binary += decimal%2;
            decimal = decimal/2;
        }
    }
    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
    public static void ComputeOp(int k){
        Scanner keyboard = new Scanner(System.in);
        int n= keyboard.nextInt();
        n=n*3;
        String binary="";
        toBinary(n,binary);
        String s = add( binary,"10101");
          k= Integer.parseInt(s,2);
          k=k+Integer.parseInt("FF",16);
        System.out.println(k);
    }

    public static void Display()
    {
        int k=0;
        String[] language = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        ComputeOp(k);
        String s = "Willy-nilly, this semester I will learn "+language[k];
        System.out.println(k);
    }
}