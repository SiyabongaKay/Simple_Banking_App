package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private UUID accountID;
    private TransactionType transactionType;
    private double amount;
    private LocalDateTime timestamp;
    private String description;

    public Transaction(UUID accountID, TransactionType transactionType, double amount, String description) {
        this.accountID = accountID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.description = description;
    }

    public UUID getAccountID() {return accountID;}
    public TransactionType getTransactionType() {return transactionType;}
    public double getAmount() {return amount;}
    public LocalDateTime getTimestamp() {return timestamp;}
    public String getDescription() {return description;}
}
