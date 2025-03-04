package mahat012.day21;
import java.util.TreeSet;
import java.util.Set;

public class day22a {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add(10);
        t.add(5);
        t.add(30);
        t.add(15);
        t.add(20);

        System.out.println(t);

        t.remove(10);
        System.out.println(t);
        if(t.contains(30)){
            System.out.println("element is in the set");
        }else{
            System.out.println("element does not exist");
        }
        System.out.println(t);
    }
    
}
