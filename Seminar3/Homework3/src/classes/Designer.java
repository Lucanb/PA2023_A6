/**
 * Designer class. A designer is a type of person
 */
package classes;

import java.util.Date;

public class Designer extends Person{
    String favouriteColor;


    public Designer(String name, Date birthday, String favouriteColor) {
        super(name, birthday);
        this.favouriteColor = favouriteColor;
    }
}
