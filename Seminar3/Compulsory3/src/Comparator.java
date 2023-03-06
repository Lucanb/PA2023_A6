import java.util.Collection;

public interface Comparator<compareByValue> {
    default void sort(int items,this::compareByValue){

    }
}
