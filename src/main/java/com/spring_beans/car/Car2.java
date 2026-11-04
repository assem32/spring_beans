package com.spring_beans.car;

public class Car2 {
    private Spacifications spacifications1;

    public void setSpacifications1(Spacifications spacifications1) {
        this.spacifications1 = spacifications1;
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + spacifications1.getMake());
        System.out.println("Car Model: " + spacifications1.getModel());
    }
}
