public class day4{
    public static void main(String[] args) {
        int a =10;
        int b =10;
        System.out.println(addition(a,b));
        System.out.println(subtraction(a,b));
        System.out.println(multiplication(a,b));
        System.out.println(division(a,b));
        
    }
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;  
    }
    public static int division(int a,int b){
        return a/b;
    }

}