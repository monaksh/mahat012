public class java3B {
    public static void main(String[] args) {
        int num1=20; 
        int num2=30;
        int num3=40;

        if(num1>num2 && num1>num3){
            System.out.println("Largest number is: "+ num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Largest number is: "+ num2);
        }else{
            System.out.println("Largest number is: "+ num3);
        }
    }
}
