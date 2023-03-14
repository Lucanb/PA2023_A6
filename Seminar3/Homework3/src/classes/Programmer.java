/**
 * Programmer class. A programmer is a type of person
 */
package classes;

import java.util.Date;

public class Programmer extends Person{
    String programmingLanguage;

    public Programmer(String name, Date birthday, String programmingLanguage) {
        super(name, birthday);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", relationships=" + relationships +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                '}';
    }
}
