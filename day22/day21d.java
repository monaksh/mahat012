package mahat012.day21;
import java.util.TreeSet;

public class day21d {
    public static void main(String[] args) {
        TreeSet<Integer>t=new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        t.add(60);
        t.add(70);
        System.out.println(t.subSet(20, 60));
        System.out.println(t);

    }
}
