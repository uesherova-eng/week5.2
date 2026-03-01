package encapsulation;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;

    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }else {
            System.out.println("Invalid");
        }
    }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid");
            }
    }
}
