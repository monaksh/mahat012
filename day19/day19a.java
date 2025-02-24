package mahat012.day19;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class day19a {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r1 = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = r1.nextInt(100) + 1;
            list.add(randomNum);    
    }
    System.out.println(list);

    int max = Collections.max(list);
    int min = Collections.min(list);

    System.out.println("the maximum number is: "+max);
    System.out.println("the minimum number is: "+min);
  }
}
