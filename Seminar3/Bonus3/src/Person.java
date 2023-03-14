import java.util.HashMap;
import java.util.Map;

public class Person implements Node, Comparable<Person> {
    public int code;
    private String name;
    private Map<Node, String> relationships = new HashMap<Node, String>();

    public Person(String name) {
        this.name = name;
    }

    public void addRelationShips(Node node, String value) {
        relationships.put(node, value);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
        //what if the name is null?
    }


}
