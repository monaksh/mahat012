import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList {
    
        public static void main(String[] args) {
            String [] StudentsName = new String[30];
            StudentsName[0]="Tikku";
            StudentsName[29]="ajgar";
            StudentsName[30]="Navla";
    

    
            ArrayList<String> studentsName = new ArrayList<>();
            studentsName.add("Tikku");
            System.out.println(studentsName);
    

    
            List<Integer> list =new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);
    
            list.add(1,20);
            System.out.println(list);
    
            List<Integer> newList = new ArrayList<>();
            newList.add(7);
            newList.add(8);
            
            list.addAll(newList);
            System.out.println(list);
    
            System.out.println(list.get(1));
    
    
            List<Integer>list=new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
    
            System.out.println(list);
    


            for (int i = 0; i < list.size(); i++);
            System.out.println("the element is "+ list.get(i));

            for (Integer element : list){
                System.out.println("foreach element is "+ element);
            }

            Iterator<Integer> it = list.iterator();
            
            while (it.hasNext()) {
                System.out.println("iterator "+it.next());
                
            }



        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
    
}
