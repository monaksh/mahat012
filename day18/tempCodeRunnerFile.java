package mahat012.day18;
import java.util.ArrayList;

public class day18b {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Mukesh");
        list.add("Ram");
        list.add("Priya");
        list.add("Ramesh");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}