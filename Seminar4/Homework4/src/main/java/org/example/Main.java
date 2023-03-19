package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Students("S" + i)).toArray(Students[]::new);
        var projects = IntStream.rangeClosed(0, 3).mapToObj(i -> new Projects("P" + i)).toArray(Projects[]::new);
        List<Students> studentsList = new ArrayList<Students>();
        TreeSet<Projects> setProjects = new TreeSet<Projects>();
        setProjects.addAll(Arrays.asList(projects));
        for (Students s : students) {
            studentsList.add(s);
        }
        //   studentsList.addAll(Arrays.asList(students)); //Sau asa;
        Collections.sort(studentsList, Comparator.comparing(Students::getName));

        for (Students s : students) {
            System.out.println(s.getName());
        }

        System.out.println(setProjects);
    }
}

