/**
 * Company class
 */
package classes;

import utils.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company extends Entity implements Comparable<Entity>, Node {

    Map<Node, String> employees = new HashMap<>();

    public Company(String name) {
        this.name = name;
    }

    public void addEmployee(Node node, String position){
        employees.put(node, position);
    }

    @Override
    public int compareTo(Entity o) {
        return this.name.compareTo(o.name); //name can't be null
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getImportance() {
        return employees.size();
    }

    @Override
    public boolean hasRelation(String name) {
        for(Map.Entry<Node, String> entry : employees.entrySet()){
            if(entry.getKey().getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                ", name='" + name + '\'' +
                '}';
    }
}
