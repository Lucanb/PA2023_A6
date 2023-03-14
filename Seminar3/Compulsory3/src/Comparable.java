import java.util.List;

public interface Comparable<T> {
   // default void sort(List<T> list)
  //  {

  //  }

//    default void sort(List<T> list,Comparator<? super T> c)
 //   {

  //  }

    int compareTo(Person other);

    int compareTo(Company obj);
}
