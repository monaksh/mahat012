package mahat012.day21;
import java.util.TreeSet;

public class day22b {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add(50);
        t.add(20);
        t.add(70);
        t.add(10);
        t.add(40);
        t.add(60);
        t.add(30);
        System.out.println(t);
        System.out.println(t.subSet(20,70));

    }
    
}
