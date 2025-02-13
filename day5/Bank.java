public class Bank{

    private int balance;
    private int accountNumber;
    private String accountHolderName;

    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        balance=balance-amount;
        if (amount>balance){
            System.out.println( "not enough balance");
        }else {
            balance = balance - amount;
            System.out.println( "successful");
        }
    }
    public void checkBalance(){
        System.out.println("your current balance is: "+balance);
    }    
}
public class bankday5b{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(223946);
        bank.setAccountHolderName("monaksh bhatnagar");
        bank.setBalance(100000);
        bank.deposit(100000);
        bank.withdraw(1000);
        bank.checkBalance();
        
    }
}