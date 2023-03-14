import java.util.Collection;

public interface Comparator<compareByValue> {
    int code=0;
    default void sort(int items,this::compareByValue){
         ///
    }
    public default int compareTo(Object other)
    {
        if (other == null ) throw new NullPointerException();
        if (!( other instanceof Person ))
            throw new ClassCastException ("Uncomparable objects!");
        Person pers = (Person) other;
        return (this.code - pers.code);
    }

}

