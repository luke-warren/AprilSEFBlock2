package org.bank;

public abstract class Account implements Transaction {
    public Long number;
    public Double balance;

    public Account(Long number, Double balance) {
        this.number = number;
        this.balance = balance;
    }

    public abstract Double deposit(Double amount);

    public abstract Double withdraw(Double amount);
}
