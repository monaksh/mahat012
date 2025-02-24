package mahat012.day20;
import java.util.LinkedHashSet;

public class day20e {
    public static void main(String[] args) {
        LinkedHashSet<String>list = new LinkedHashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Avocado");
        list.add("PineApple");

        System.out.println("original "+list);

        list.remove("Apple");

        System.out.println("Updated List "+list);
    }  
}
