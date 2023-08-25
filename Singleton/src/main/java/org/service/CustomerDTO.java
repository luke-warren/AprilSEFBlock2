package org.service;

public class CustomerDTO {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int rewardsNumber;
    private int totalPoints;

    public CustomerDTO(int idNumber, String firstName, String lastName, int rewardsNumber, int totalPoints) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rewardsNumber = rewardsNumber;
        this.totalPoints = totalPoints;
    }

    public int getRewardsNumber(){
        return -1;
    }
    public void setRewardsNumber(int rewardsNumber){}

    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}
