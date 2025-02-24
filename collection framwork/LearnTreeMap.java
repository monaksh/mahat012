import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap{
    public static void main(String[] args) {
        
        Map <String,Integer> numbers = new TreeMap<>();
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);

        System.out.println(numbers);

        numbers.remove("three");
        System.out.println(numbers);

        System.out.println(numbers.containsValue(3));
    }
}