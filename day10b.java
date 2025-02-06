interface  Payment{
    void makePayment(double amount);
    void refundPayment(double amount);
}
class creditCardPayment implements Payment{
 public void makePayment(double amount){
    System.out.println("the payment using credit card is: "+amount);
 }
  public void refundPayment(double amount){
     System.out.println("payment refunded to your credit card is: "+amount);
  }
}
class payPalPayment implements Payment{
    public void makePayment(double amount){
        System.out.println("payment using paypal is: "+amount);
    }
    public void refundPayment(double amount){
        System.out.println("payment refunded to  your paypal account is: "+amount);
    }
}
public class day10b{
    public static void main(String[] args){
        Payment payment = new creditCardPayment();
        payment.makePayment(1000);
        payment.refundPayment(500);
        Payment payment1 = new payPalPayment();
        payment1.makePayment(5000);
        payment.refundPayment(1000);
    }
    
}