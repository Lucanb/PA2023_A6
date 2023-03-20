package org.example;

import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class Problem {

    private Map<Students, List<Projects>> myMap;

    public double getAvg() {
        double average;
        average = myMap.values().stream().mapToInt(List::size).average().orElse(0);
        return average;
    }

    public Map<Students, List<Projects>> getMyMap() {
        return this.myMap;
    }

    public void setMyMap(Map<Students, List<Projects>> myMap) {
        this.myMap = myMap;
    }

    public void printStudentsLess() {
        System.out.println("Students with a media less than average:");
        myMap.keySet().stream().filter(students -> myMap.get(students).size() < getAvg()).forEach(System.out::println);
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        for (Map.Entry<Students, List<Projects>> entry : myMap.entrySet()) {
            myString.append("Student :" + entry.getKey()).append(",Projects Chosen:").append(entry.getValue()).append("\n");
        }
        return myString.toString();
    }

    public void Greedy() {
        {
            List<Students> students = new ArrayList<>(myMap.keySet()); // All students from my may I took.
            students.sort(Comparator.comparingInt(s -> myMap.get(s).size())); // Now I'm gona sort after their preferences
            Set<Projects> assignedProjects = new HashSet<>(); // Now we take our Projects from te map.
            Map<Students, Projects> assignmentMap = new TreeMap<>(); // Now we will sort with the tree map.
            for (Students student : students) {
                boolean assigned = false;
                for (Projects project : myMap.get(student)) {
                    if (!assignedProjects.contains(project)) { // If the project is not already in assignedProjects,
                        assignmentMap.put(student, project); // put the pair in assignmentMap
                        assignedProjects.add(project); // Mark the project as 'assigned'
                        assigned = true;
                        break;
                    }
                }
                if (!assigned) { // If the student was not assigned a project, add them to the assignment map
                    assignmentMap.put(student, null); // with a null project to indicate that they were not assigned any project
                }
            }
            // Print the map obtained
            System.out.println("\n" + "Assignment map:");
            for (Map.Entry<Students, Projects> entry : assignmentMap.entrySet()) {
                System.out.println(entry.getKey().getName() + " -> " + entry.getValue().getName());
            }
        }
    }
    Problem(int numStudents, int min, int max) {
        Faker faker = new Faker();
        Map<Students, List<Projects>> myMap = IntStream.rangeClosed(0, numStudents).mapToObj(i -> {
                    String student = faker.name().name();
                    List<Projects> projects = IntStream.rangeClosed(0, (int) (Math.random() * (max - min) + min)).
                            mapToObj(j -> new Projects(faker.company().name())).collect(Collectors.toCollection(LinkedList::new));
                    return Map.entry(new Students(student), projects);
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (s1, s2) -> s1, LinkedHashMap::new));
        this.myMap = myMap;
    }
}