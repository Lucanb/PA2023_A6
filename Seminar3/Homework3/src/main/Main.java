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
        Programmer pers = new Programmer("Matei", new GregorianCalendar(1988,
                Calendar.JANUARY, 30).getTime(),
                "C++");
        Designer pers2 = new Designer("Luca", new GregorianCalendar(1988,
                Calendar.JULY, 13).getTime(), "Green");
        Person pers3 = new Person("Nicoleta", new GregorianCalendar(1988,
                Calendar.FEBRUARY, 4).getTime());
        Company company1 = new Company("Bitdefender");
        Company company2 = new Company("Bytex");
        Company company3 = new Company("OpenAI");

        pers.addRelationship(pers2, "University");
        pers2.addRelationship(pers, "University");
        pers2.addRelationship(pers3, "Internship");
        pers3.addRelationship(pers2, "Internship");

        company1.addEmployee(pers, "Developer");
        company2.addEmployee(pers2, "Manager");
        company3.addEmployee(pers3, "Tester");
        List<Node> nodes = new ArrayList<>();
        nodes.add(pers);
        nodes.add(pers2);
        nodes.add(pers3);
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