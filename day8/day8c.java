class Account{

    private int accountNumber;
    public String accountHolderName;
    protected double balance;

    private Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    


}