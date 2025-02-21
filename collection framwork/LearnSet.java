// this help to set elements permanently in the memory we can not remove it or replace it
// it will always in memory 
// set it create hash and store the element hash code


import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        set.add(50); // their is no change in collection because 50 is already implemented in the list

        System.out.println(set);

        set.remove(50); // this function remove the desiered element from the list

        System.out.println(set);

        System.out.println(set.contains(100)); // Output true or false 
                                                 // check element in the list and gives a boolean value

        System.out.println(set.isEmpty()); // give boolean show list is empty or not
        
        System.out.println(set.size()); // give the total no. of index

        set.clear(); // help to clear all set collection 
        System.out.println(set);
        
    }
    
}
