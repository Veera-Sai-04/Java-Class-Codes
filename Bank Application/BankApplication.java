// step -2 creating a class
abstract class BankAccount{
    private   String AccountHolderName;
    private double Balance;

    // step-3 creating constructor
    public BankAccount(String AccountHolderName, double Balance){
        this.AccountHolderName=AccountHolderName;
        this.Balance=Balance;
    }

    public abstract void displayDetails();

    // step-4 encapsulation

    public String getAccountHolderName(){
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }
    public double getBalance(){
        return Balance;
    }

    public void setBalance(double Balance){
        this.Balance = Balance;
    }

    // step-5 polymorphism

    public void deposit(double amount){
        if(amount>0){
            Balance += amount;
            System.out.println("Deposited amount:" + amount);
        }
        else{
            System.out.println("Deposit properly");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -=amount;
            System.out.println("Withdraw amount:" + amount);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
}

// step-6 inheritation
class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance){
        super(AccountHolderName, Balance);
    }
    @Override
    public void displayDetails(){
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
    }

}

public class BankApplication {
    public static void main(String[] args) {
        BankAccount savings = new savingsAccount("veera", 1000.00);

        savings.displayDetails();

        savings.deposit(2000.00);
        savings.withdraw(500.00);

        savings.displayDetails();

    }
}