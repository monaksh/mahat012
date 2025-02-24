package mahat012.day20;
import java.util.HashSet;

public class day20d {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("ram");
        hs.add("Sita");
        System.out.println(hs);

        hs.add("Sita");  // duplicate value
        System.out.println(hs);
    }
    
}
// doubt = which value can considered as duplicate value in hashset ??