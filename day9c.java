class Calculator{
    
    int multiply(int a,int b){
        return a*b;
    }

    double multiply(double a,double b){
        return a*b;
    }
    
}
public class Day9c{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.multiply(5,6));
        System.out.println(c.multiply(1.23,3.22));
    }
} 