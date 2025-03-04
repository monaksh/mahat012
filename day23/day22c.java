package mahat012.day22;
import java.util.TreeMap;
public class day22c{
    public static void main(String[] args) {

        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");
        System.out.println("TreeMap in ascending order of keys:");
        for (var entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}