package mahat012.day20;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class day20a {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        

        ListIterator<Integer>it=list.listIterator(list.size());{
            while(it.hasPrevious()){
                System.out.println(it.previous());
            }
        };


    }
    
}
