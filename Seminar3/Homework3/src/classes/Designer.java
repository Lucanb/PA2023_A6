/**
 * Designer class. A designer is a type of person
 */
package classes;

import java.util.Date;

public class Designer extends Person{
    String Color;


    public Designer(String name, Date birthday, String Color) {
        super(name, birthday);
        this.Color = Color;
    }
}
