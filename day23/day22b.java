package mahat012.day22;
import java.util.HashMap; 

public class day22b {
    public static void main(String[] args) {
        HashMap<String,Integer>hs=new HashMap<>();
        hs.put("Apple", 50);
        hs.put("Banana",20);
        hs.put("Cherry",30);
        hs.put("Date",15);
        System.out.println("Banana Price: " + hs.get("Banana"));
        hs.remove("Cherry");
        System.out.println("updated List: "+hs);
    }
}
