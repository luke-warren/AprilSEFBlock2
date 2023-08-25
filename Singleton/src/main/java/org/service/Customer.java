package org.service;

public class Customer {
    private int idNumber;
    private String firstName;
    private String lastName;

    public Customer(){
        this.idNumber = -1;
        this.firstName = "";
        this.lastName = "";
    }

    public Customer(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  int getRewardsNumber(){
        return -1;
    }
    public void setRewardsNumber(int rewardsNumber){
    }

    public String[] getAvailableRewards(){
        return new String[]{};
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
