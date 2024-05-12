package model;

import java.util.UUID;

public class Account {
    private UUID userID;
    private UUID accountID;
    private String accountType;
    private int accountNumber;
    private double balance;
    private Status status;

    public Account(UUID userID, String accountType){
        this.userID = userID;
        this.accountType = accountType;
        this.status = Status.ACTIVE;
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
    }

    public Status getStatus() {return this.status;}
    public String getAccountType() {return this.accountType;}
    public int getAccountNumber() {return this.accountNumber;}
    public UUID getUserID() {return this.userID;}

    public double getAvailableBalance() {
        return this.balance;
    }

    public int generateAccountNumber() {
        //TODO
        return 0;
    }

    public void deposit(double amount) {this.balance += amount;}
    public void withdraw(double amount) {this.balance -= amount;}


}
