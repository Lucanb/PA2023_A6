/**
 * Person class
 */
package classes;

import utils.Node;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

public class Person extends Entity implements Comparable<Entity>, Node {
    Map<Node, String> relationships = new HashMap<>();
    Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void addRelationship(Node node, String value){
        relationships.put(node, value);
    }

    public Map<Node, String> getRelationships(){
        return this.relationships;
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
        return relationships.size();
    }

    @Override
    public boolean hasRelation(String name) {
        for(Map.Entry<Node, String> entry : relationships.entrySet()){
            if(entry.getKey().getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "relationships=" + relationships +
                ", name='" + name + '\'' +
                '}';
    }
}
