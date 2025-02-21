import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

    Map<String,Integer>numbers=new HashMap<>();


    numbers.put("one",1);
    numbers.put("Two",2);
    numbers.put("Three",3);

//     if(!numbers.containsKey("Two"))
// {
//     numbers.put("Two",23);
// }

// numbers.putIfAbsent("Two",10);
System.out.println(numbers);

    //  for(Map.Entry<String,Integer> e : numbers.entrySet()){
    //     System.out.println(e);
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    //  }

     for(Integer value : numbers.values()){
        System.out.println(value);
     }
     System.out.println(numbers.containsValue(1));

    }
}
