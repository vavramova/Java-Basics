package Bank;

public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
       if(amount > 0){
           balance += amount;
           System.out.println("You successfully deposited " + amount + "$ to your account! The new balance is: " + balance + " $");
       }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("New balance: " + balance + " $");
        }else{
            System.out.println("Not enough balance!");
        }
    }

    public void transfer(BankAccount other, double amount){
        if(amount > 0 && amount <= balance){
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println(owner + " successfully transferred " + amount + " $ to " + other);
        }else{
            System.out.println("Invalid operation!");
        }
    }

    public void printInfo(){
        System.out.println(owner + " has " + balance + " $ in his account");
    }
}
