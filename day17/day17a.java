package mahat012.day17;

class day17{
    int num1 , num2;

public int divideNum(int num1 ,int num2){
                return num1/num2;
            }
        }
public class day17a{
  public static void main(String[] args) {
    day17 div = new day17();
    try{
        div.divideNum(2,3);
    }catch(ArithmeticException e){
        System.out.println(e);;
    }finally{
        System.out.println("Operation Completed");
    }
    }
}