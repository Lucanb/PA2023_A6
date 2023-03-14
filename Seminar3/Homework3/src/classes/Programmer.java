/**
 * Programmer class. A programmer is a type of person
 */
package classes;

import java.util.Date;

public class Programmer extends Person{
    String favouriteProgrammingLanguage;

    public Programmer(String name, Date birthday, String favouriteProgrammingLanguage) {
        super(name, birthday);
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "favouriteProgrammingLanguage='" + favouriteProgrammingLanguage + '\'' +
                ", relationships=" + relationships +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }
}
