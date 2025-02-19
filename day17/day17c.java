package mahat012.day17;

class NegativeAmountException extends Exception{
    public NegativeAmountException(String NegativeAmountException){
        super("You don't have money");
    }
}
public class day17c{

    public static void processPayment(double amount) throws NegativeAmountException{
        if(amount <= 0){
            throw new NegativeAmountException("don,t have balance");
        }else{
            System.out.println("withdrawled");
        }
    }
    public static void main(String[] args) {
        double []amountArr = {100,-350,1000};
        for(double amount : amountArr){
            try{
                processPayment(amount);
            }catch(NegativeAmountException e){
                System.out.println("Exception found");
            }finally{
                System.out.println("Operation Completed");
            }
        }  
    }
}