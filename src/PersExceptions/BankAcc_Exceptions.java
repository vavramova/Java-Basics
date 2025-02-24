package PersExceptions;

import com.sun.jdi.InvalidLineNumberException;

public class BankAcc_Exceptions {
    private double balance;

    public BankAcc_Exceptions(double balance){
        this.balance = balance;

    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit can not be negative");
        }

        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new NegativeBalanceException("Insufficient balance");
        }
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

}
