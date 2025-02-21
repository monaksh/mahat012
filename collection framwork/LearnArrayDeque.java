// ArrayDeque = in this we can manage and update and modify the elements in a different ways like 
// we can set priority of element 

import java.util.ArrayDeque;

public class LearnArrayDeque{

    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10); 
        adq.offerFirst(20); // add element in the first
        adq.offerLast(30); // add element in the Last
        adq.offer(40);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() "+adq);



    }
}