package mahat012.day22;
import java.util.PriorityQueue;

public class day23a {
    public static void main(String[] args) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        q.add(90);
        q.add(60);
        q.add(80);
        q.add(100);
        q.add(70);
        System.out.println("Priority Queue: "+q);
        System.out.println("element polled: " + q.poll());
        System.out.println("After  polling: "+q);

    }
    
}
