import java.util.ArrayList;

public interface Comparable<T> {
    default void sort(ArrayList<T> list)
    {

    }
    default void sort(ArrayList<T> list,Comparator<? super T> c)
    {

    }
}
