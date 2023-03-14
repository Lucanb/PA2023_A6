/**
 * Main class
 */
package main;

import classes.*;
import utils.Node;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Programmer person1 = new Programmer(
                "John",
                new GregorianCalendar(1988, Calendar.JANUARY, 30).getTime(),
                "Java"
        );
        Designer person2 = new Designer(
                "Mike",
                new GregorianCalendar(1988, Calendar.JULY, 13).getTime(),
                "Blue"
        );
        Person person3 = new Person(
                "Jilly",
                new GregorianCalendar(1988, Calendar.FEBRUARY, 4).getTime()
        );

        Company company1 = new Company("Google");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Tesla");

        person1.addRelationship(person2, "University");
        person2.addRelationship(person1, "University");
        person2.addRelationship(person3, "Internship");
        person3.addRelationship(person2, "Internship");

        company1.addEmployee(person1, "Developer");
        company2.addEmployee(person2, "Project Manager");
        company3.addEmployee(person3, "HR");

        List<Node> nodes = new ArrayList<>();
        nodes.add(person1);
        nodes.add(person2);
        nodes.add(person3);
        nodes.add(company1);
        nodes.add(company2);
        nodes.add(company3);

        Network network = new Network();

        for (Node node : nodes) {
            network.addNode(node);
        }

       // network.printNodes();

        Set<String> articulationPoints = network.findArticulationPoints();
        System.out.println(articulationPoints);
    }
}