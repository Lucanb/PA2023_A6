import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        List<Node> nodes = new ArrayList<Node>();
        List<Comparable> comp = new ArrayList<Comparable>();
       // Comparator<Node> comparator = new Comparator<Node>();

        Person p1 = new Person("Ionel");
        Person p2 = new Person("Andi");
        Person p3 = new Person("Marian");

        Company c1 = new Company("Bitdefender");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Bytex");

        nodes.add(p1);
        nodes.add(p2);
        nodes.add(p3);
        nodes.add(c1);
        nodes.add(c2);
        nodes.add(c3);

       // comp.sort(nodes,comparator)

        for(Node i:nodes){
            System.out.println(i.getName());
        }



    }
}