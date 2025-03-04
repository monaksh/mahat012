//Sorted set

//child interface of Set interface 
//preserve insertion order
//duplicate are nor allowed 
//elements are sorted  in a sorted order
//sortedSet interface introduces (6) new methods 
//sorted set includes logical order

//in (set) order is important 
//in (sorted set) order os important
import java.util.*;
import java.util.TreeSet;

class SortedSET{
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add("D");
        t.add("B");         // when we store value randomlly it aumatically
        t.add("C");              // store in a sorted mannar always stores data in sorted form 
        t.add("A");

        System.out.println(t.first()); // first() functions is use to get 0  index value
        System.out.println(t.last());  // last() this function used to get last value but in a sorted way
        System.out.println(t.headSet("C")); // return a view portion of this set whose elements are strictily less then element
        System.out.println(t.tailSet("C")); // return a view of the portion of this set whose elements are greater than or equal to from element
        System.out.println(t.subSet("B","D"));// return a view of the portionof this set whose element range from from element
                                                                             // inclusive to toelement .exclusive
        System.out.println(t.comparator());// return the comparitor  used to order  the element un this set or null if ths set uses the natural ordering if its elements                                                                    

    }
}
