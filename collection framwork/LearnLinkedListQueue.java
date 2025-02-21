// queue = this data collection use the principle of first in first out(FIFO)
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);    // offer = it is used to add element is the queue
        queue.offer(24);
        queue.offer(34);

        System.out.println(queue);

        System.out.println(queue.poll()); // pop = this fuction is use to delete the element form the front end of the queue "12"
                                          // if there is no element in the queue it returns Null.

        System.out.println(queue.peek()); // peek = function tells about top most element in the queue

        //All function that can be used in queue are - 
        // offer() - commanlly use to add element                     "add()"can be use but throws exception
        // peek() - return the head of the queue return null if empty "element()"can be use but throws exception
        // poll () - remove the top most element in the queue         "remove()"can be use but throws exception
    }
    
}
