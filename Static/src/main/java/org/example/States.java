package org.example;

public enum States {
    AK("Alaska"),
    AL("Alabama"),
    AZ("Arizona");

    final String state;

    private States (String state){
        this.state = state;
    }
}
