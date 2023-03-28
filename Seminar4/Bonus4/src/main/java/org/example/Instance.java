package org.example;

import org.graph4j.GraphBuilder;
import org.graph4j.alg.matching.HopcroftKarpMaximumMatching;
import java.util.*;

public class Instance {
    private List<Student> students;
    private List<Project> projects;

    public Instance(List<Student> students, List<Project> projects) {
        this.students = students;
        this.projects = projects;
    }

    public Map<Student, Project> SolveGreedy()
    {
        Map<Student, Project> result = new HashMap<>(students.size());
        Set<Project> availableProjects = new HashSet<>(projects);

        for (Student student: students) {
            List<Project> acceptedProjects = student.getProjects();
            if(projects.contains(acceptedProjects.get(0)))
            {
                result.put(student, acceptedProjects.get(0));
                availableProjects.remove(acceptedProjects.get(0));
            }
            else
            {
                return null;
            }
        }


        return result;
    }

    public Map<Student, Project> SolveProblemWithGraph4j() {

        var graphBuilder = GraphBuilder.numVertices(students.size() + projects.size());

        Map<Student, Integer> studentMap = new HashMap<>(students.size());
        Map<Project, Integer> projectMap = new HashMap<>(projects.size());

        int cnt = 0;
        for (Student item : students) {
            studentMap.put(item, cnt);
            cnt++;
        }

        for (Project value : projects) {
            projectMap.put(value, cnt);
            cnt++;
        }

        Map<Integer, Student> reverseStudentMap = new HashMap<>(students.size());
        Map<Integer, Project> reverseProjectMap = new HashMap<>(projects.size());

        for (var student: studentMap.keySet()) {
            reverseStudentMap.put(studentMap.get(student), student);
        }

        for (var project: projectMap.keySet()) {
            reverseProjectMap.put(projectMap.get(project), project);
        }

        for (var student: students) {
            var projects = student.getProjects();
            for (var project: projects) {
                if(projectMap.containsKey(project) && studentMap.containsKey(student))
                    graphBuilder.addEdge((int)studentMap.get(student), (int)projectMap.get(project));
            }
        }

        var graph = graphBuilder.buildGraph();

        var hopcroftKarpMaximumMatching = new HopcroftKarpMaximumMatching(graph);

        var matching = hopcroftKarpMaximumMatching.getMatching();

        var edges = matching.edges();

        Map<Student, Project> answer = new HashMap<>(students.size());

        for (int[] edge : edges) {

            if(reverseStudentMap.containsKey(edge[0]) && reverseProjectMap.containsKey(edge[1]))
            {
                answer.put(reverseStudentMap.get(edge[0]), reverseProjectMap.get(edge[1]));
            }
        }

        return  answer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
