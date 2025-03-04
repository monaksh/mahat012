package mahat012.day20;
import java.util.Vector;

public class day20c {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add(0,"Box"); 
        v1.add(1,"Pen");
        v1.add(2,"Tree");
        v1.add(3,"Chai");
        v1.add(4,"Tape");

        System.out.println(v1);

        v1.set(2,"Phone");

        System.out.println(v1);
    }
}
