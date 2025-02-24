package mahat012.day19;
import java.util.ArrayList;
import java.util.Scanner;
public class day19d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter the elements: ");
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Enter divisor");
        int divisor = sc.nextInt();

        for(int i = 0 ; i < list.size(); i ++){
            if (list.get(i)%divisor==0){
                list.remove(i);
                i--;
            }
        }

        System.out.println("Updated List is "+list);
    }
}
