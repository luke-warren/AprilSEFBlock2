package org.bank;

public class ATM {
    public String location;
    public String managedBy;

    public ATM(String location, String managedBy) {
        this.location = location;
        this.managedBy = managedBy;
    }

    // Different method signature,  doesn't implement Transaction
    public Double withdraw(Account account, Double amount){
        return 0.0;
    }
}
