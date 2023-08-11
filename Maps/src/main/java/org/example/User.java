package org.example;

import java.util.Objects;

public class User {
    private String name;
    private String userName;
    private int id;

    private String subscriptionLevel;

    public User(String name, String userName, int id, String subscriptionLevel) {
        this.name = name;
        this.userName = userName;
        this.id = id;
        this.subscriptionLevel = subscriptionLevel;
    }

    public User(String name, String userName, int id) {
        this.name = name;
        this.userName = userName;
        this.id = id;
        this.subscriptionLevel = "WITH_ADS";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubscriptionLevel() {
        return subscriptionLevel;
    }

    public void setSubscriptionLevel(String subscriptionLevel) {
        this.subscriptionLevel = subscriptionLevel;
    }

    @Override
    public boolean equals(Object other){
        //First conditional compares the current self (this) to something passed in (other)
        if(this == other){
            return true;
        }
        //Type check and null check that matches the readings.
//        if(other == null || !(other instanceof User)){
//            return false;
//        }
        //Is doing the same check in a different way.
        if(other == null || this.getClass() != other.getClass()){
            return false;
        }
        User that = (User) other;

        return (this.id == that.getId()
                && this.name.equals(that.getName())
                && this.userName.equals(that.getUserName()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.userName);
    }
}
