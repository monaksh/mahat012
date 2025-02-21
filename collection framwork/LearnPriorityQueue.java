// PriorityQueue = this queue is use to set the priority of the element same as queue

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);  
        pq.offer(12);
        pq.offer(24);
        pq.offer(34);

        System.out.println(pq);

        pq.poll(); // this remove the element which has maximum priority

        System.out.println(pq);

        pq.peek(); // this function show the peek element in the PriorityQueue

        System.out.println(pq);




    }
}
