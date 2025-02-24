// in collection class we can use basic funcion to manage , retrieve the data 
// eg  min max etc

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // System.out.println("min element is: "+Collections.min(list));
        // System.out.println("max element is: "+Collections.max(list));
        // System.out.println(Collections.frequency(list,2));

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        
    }
}
