package mahat012.day19;
import java.util.ArrayList;
import java.util.Scanner;

public class day19c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Item: ");
        String s1 = sc.nextLine();
        
        ArrayList<String>list= new ArrayList<>();
        list.add("box");
        list.add("guitar");
        list.add("Phone");
        list.add("Cover");
        list.add("Glass");
        list.add("Pen");

        if(list.contains(s1)){
            System.out.println(s1+" is available in the list");
        }else{
            System.out.println(s1 + " not available in the list");
        }


    }
    
}
