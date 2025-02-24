package mahat012.day18;

import java.util.*;
public class day18a {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number: ");
        double a = sc.nextDouble();
        System.out.println("enter a second number: ");
        double b = sc.nextDouble();

        double max = Math.max(a, b);
        double min = Math.min(a,b);

        double diff = Math.abs(a-b);
        double sqrt = Math.sqrt(diff);

        double pow = Math.pow(a,b);

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Square: "+sqrt);
        System.out.println("pow: "+pow);

        

        
    }
    
}
