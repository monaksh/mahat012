
import java.util.Scanner;

public class MathExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name = ");
        String MyName=sc.nextLine();
        System.out.println("Enter your lover name = ");
        String LoverName=sc.next();
        int per = (int)(Math.random()*100);
        System.out.println(LoverName + " loves"+" "+per+"% to "+MyName);
    }
}
