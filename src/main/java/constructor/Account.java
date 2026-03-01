package constructor;

public class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber,double balance){
        if(accountNumber==null|| accountNumber.isEmpty()){
            System.out.println("Error: Account number cannot be empty or null!");
            this.accountNumber="Invalid";
        }else{
            this.accountNumber=accountNumber;

        }
        if(balance<0){
            System.out.println("Error: Balance cannot be negative");
            this.balance=0.0;
        }else{
            this.balance=balance;

        }
    }
    public void printInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }
}
