import java.util.Scanner;

public class java1{
    public static void main(String[] args) {
        // Ans: a
        System.out.println("Hello, World!\n");
        
        // Ans: b
        char var1 ='Z';
        byte var2=99;
        short var3=164;
        int var4=5;
        float var5=2.1f;
        boolean var6=false;;
        double var7=5342.32;
        long var8=6434;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8+"\n");

        // Ans: c
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int avg = (num1+num2)/2;

        System.out.println("Average: "+ avg);
    }
}