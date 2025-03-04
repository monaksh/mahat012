// implement the properties of HashSet, linkedHashSet , SortedSet and NavigableSet

// internaly the array is sortted in the memory

//time complexity = big O log n 

//TreeSet() default sorting
//Constructs a new, empty tree set, sorted according to the natural ordering of its elements

//TreeSet(Comparator c) custom sorting
//Constructs a new, empty tree set, sorted according to the specified comparator.

//TreeSet(Collection c) default natural sorting
//Constructs a new tree set containing the elements in the specified collection, sorted according to the natural ordering of its elements

//TreeSet(SortedSet s) custom sorting natrual sorting also possible
//Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set

//default natural sorting = Integers
// not on String
// it workes on = homogeneous objects  annd comparable objects 
//String Buffer objrcts are not comparable
//String class implements comparable

//compareTo() this method is implemented on string interger class but not on String buffer class

//comparable() is implemented on all String class and wrapper class


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        // t.add("A");
        // t.add(null); // exception occure (nullPointerException)
        // System.out.println(t);

        // t.add(10);
        // t.add(15);
        // t.add(5);
        // t.add(20);
        // System.out.println(t); // default natural sorting output 5,10,15,20

        t.add("D");
        t.add("A");
        System.out.println(t.comparator());
    }
}
