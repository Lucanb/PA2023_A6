package org.example;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Compulsory();
        //Homework();

        Bonus();
    }

    public static void Bonus()
    {
        var startWatch = System.currentTimeMillis();

        Instance instance = GetBigInstnace();

        Map<Student, Project> greedy_result = instance.SolveGreedy();

        System.out.println("Greedy solution found in " + (System.currentTimeMillis() - startWatch) + " ms");
        System.out.println("Solution found: ");
        System.out.println(greedy_result);

        Map<Student, Project> graph4j_result = instance.SolveProblemWithGraph4j();
        System.out.println("Graph4j solution found in " + (System.currentTimeMillis() - startWatch) + " ms");
        System.out.println("Solution found: ");
        System.out.println(graph4j_result);
    }

    public static Instance GetBigInstnace()
    {
        List<Project> projects = GetProjects(1000);
        List<Student> students = GetStudents(1000, projects);

        return new Instance(students, projects);
    }

    public static void Homework()
    {
        List<Project> projects = GetProjects(10);
        List<Student> students = GetStudents(10, projects);

        Instance instance = new Instance(students, projects);

        List<Student> queryStudents = LowerThanAverageQuery(students);

        System.out.println("Average accepted projects: " + GetAverageNumberOfAcceptedProjects(students ));
        System.out.println("Students with less than average accepted projects: ");

        for (Student student : queryStudents) {
            System.out.println(student.getName() + " has " + student.getProjects().size() + " projects");
        }

        Map<Student, Project> result = instance.SolveGreedy();

        if(result == null)
        {
            System.out.println("No solution found");
        }
        else
        {
            System.out.println("Solution found: ");
            for (Map.Entry<Student, Project> entry : result.entrySet()) {
                System.out.println(entry.getKey().getName() + " -> " + entry.getValue().getName());
            }
        }
    }

    public static List<Student> LowerThanAverageQuery(List<Student> students)
    {
        int averageAcceptedProjects = GetAverageNumberOfAcceptedProjects(students);

        return students.stream()
                .filter(s -> s.getProjects().size() < averageAcceptedProjects)
                .toList();
    }

    public static int GetAverageNumberOfAcceptedProjects(List<Student> students)
    {
        return (int)students.stream()
                .mapToInt(s -> s.getProjects().size())
                .average()
                .orElse(0);
    }

    public static void Compulsory()
    {
        /* create 3 Projects */
        var projects = IntStream.rangeClosed(0,3)
                .mapToObj(i -> new Project("Project - " + (char)((int)'Z'-i)))
                .toArray(Project[]::new);

        /* create 3 students */
        Student s0 = new Student("Lohn", new ArrayList<>(List.of(projects[0], projects[1], projects[2])));
        Student s1 = new Student("Zane", new ArrayList<>(List.of(projects[0], projects[1])));
        Student s2 = new Student("Aoe", new ArrayList<>(List.of(projects[0])));

        List<Student> students = new LinkedList<>(List.of(s0, s1, s2));
        List<Student> orderedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        System.out.println("Students: " + orderedStudents);

        Set<Project> projectsSet = new TreeSet<>(Arrays.stream(projects).toList());

        System.out.println("Projects: " + projectsSet);
    }

    public static List<Project> GetProjects(int n)
    {
        return IntStream.rangeClosed(0,n)
                .mapToObj(i -> new Project("Project - " + (char)((int)'Z'-i)))
                .toList();
    }

    public static List<Student> GetStudents(int n, List<Project> projects)
    {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        Faker faker = new Faker();

        for(int i = 0; i < n; i++)
        {
            int randomNumberOfAcceptedProjects = random.nextInt(projects.size()) + 1;
            Set<Project> acceptedProjects = new HashSet<>();
            for (int j = 0; j < randomNumberOfAcceptedProjects; j++)
            {
                int randomProjectIndex = random.nextInt(projects.size());
                acceptedProjects.add(projects.get(randomProjectIndex));
            }

            Student s = new Student("[Student] " + faker.name().fullName(),acceptedProjects.stream().toList());
            students.add(s);
        }

        return students;
    }
}