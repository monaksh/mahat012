import java.util.Scanner;
public class day3c {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = sc.nextInt();
        switch(a){
            case 1:
            System.out.println("spring");
            break;
            case 2:
            System.out.println("summer");
            break;
            case 3:
            System.out.println("winter");
            break;
            case 4:
            System.out.println("autumn");
            break;
            default:
            System.out.println("invalid input");
        }
    }
}