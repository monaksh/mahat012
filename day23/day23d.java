package mahat012.day22;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class day23d {
    public static void main(String[] args) {
       ArrayList<Integer>a=new ArrayList<>();
       a.add(20);
       a.add(50); 
       a.add(10); 
       a.add(40); 
       a.add(30);
       
       System.out.println("Array List: "+a);
       Collections.sort(a);
       System.out.println("sorted array: "+a);
    }
    
}
