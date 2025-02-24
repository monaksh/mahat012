// cursor = sequensially accessing ,elements,objects of collection etc
// thet are  use to retrieve data from collection object one by 
// three cursors in java are-
//1. Enumeration = it is an interface in java it generates a series of elements one at a time
//2. Iterator = 
//3. Listiterator

import java.util.*;
import java.util.Vector;

import javax.swing.text.html.StyleSheet.ListPainter;

// public class cursor{
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         Vector v = new Vector();
//         v.addElement("one");
//         v.addElement("Two");
//         v.addElement("Three");
//         v.addElement("Four");

//     Enumeration e = v.elements();
//     while(e.hasMoreElements()){
//         String s = (String)e.nextElement();
//         System.out.println(s);
//     }
//     }
// 

//Iterator = all collection implemented classes provide a method called iterator  { public iterator iterator() }
// syntax iterator it = obj.iterator();

// public class cursorIterat{
//     public static void main(String[] args) {
//         ArrayList a1 = new ArrayList<>();
//         for(int i = 1; i<=10; i++){
//             a1.add(i);
//         }
//         System.out.println(a1);
//         Iterator it = a1.iterator();
//         while(it.hasNext()){
//             Integer I =(Integer)it.next();
//             if(I>3 && I<8){
//                 it.remove();
//             }
//             System.out.println(a1);
//         }
//     }
// }
public class cursorLinkedlist{
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("C");
        l1.add("CPP");
        l1.add("Java");
        l1.add("PHP");
    
        System.out.println(l1);

        ListIterator lit = l1.listIterator();
        while(lit.hasNext()){
            String s = (String)lit.next();
            if(s.equals("Java")){
                lit.set("Java se");
            }else if(s.equals("C")){
                lit.add("DSA");
            }else if(s.equals("PHP")){
                lit.remove();
            }
            System.out.println(l1);

        }

    }
}
