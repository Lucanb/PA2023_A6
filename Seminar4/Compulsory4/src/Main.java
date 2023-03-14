import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i));
        var projects = IntStream.rangeClosed(0,3).mapToObj(i -> new Student("P" + i));
        List<Student> linkedList = new ArrayList<Student>();
        linkedList.addAll((Collection<? extends Student>) Arrays.asList(students));
        List<Project> projectLists = new ArrayList<Project>();
        projectLists.addAll(Arrays.asList());
        TreeMap<Student, List<List<Project>>> TreeSet = new TreeMap();
        List<List<Project>> list = new ArrayList<List<Project>>();
        for(int i=0;i<=3;i++)
           TreeSet.put(linkedList.get(i), list);


      System.out.println(linkedList);
     System.out.println(TreeSet);
    }
}