package inheritance;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposit: "+amount);
    }
    public void withdraw(double amount){
        if(amount <=balance){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }else{
            System.out.println("No money");
        }
    }
    public double getBalance(){
        return balance;
    }
}

class SavingAccount extends BankAccount{
    public SavingAccount(double balance){
        super(balance);

    }
    public void withdraw(double amount){
        if(balance-amount<100){
            System.out.println("Cannot withdraw. Balance cannot fall below 100som");
        } else {
            super.withdraw(amount);

        }
    }
}