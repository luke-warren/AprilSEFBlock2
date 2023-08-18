package org.bank;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    public String code;
    public String address;

    private HashMap<String, Account> customerNameToAccount;
    private ArrayList<Customer> customers;
    private ArrayList<ATM> atms;

//    May need a list of accounts
//    public ArrayList<Accounts> accounts;
//
    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
    }

    public ArrayList<Account> getAccounts(){
        //Temporary return of null
        //TODO: Fill in this method
        return null;
    }
}
