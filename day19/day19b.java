import java.util.ArrayList;
import java.util.Scanner;
public class day19b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color: ");
        String colorName = sc.nextLine();
        ArrayList<String>list=new ArrayList<>();
        list.add(0,"red");
        list.add(1,"purple");
        list.add(2,"Blue");
        list.add(3,"Orange");
        list.add(4,"Green");

        int index = list.indexOf(colorName);

        if(list.contains(colorName)){
            System.out.println(colorName + " is available at index " +index);
        }else{
            System.out.println(colorName +" is not available ");
        }
    }
}
