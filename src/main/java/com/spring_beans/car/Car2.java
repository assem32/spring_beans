package com.spring_beans.car;

public class Car2 {
    private Spacifications spacifications;

    public void setSpacifications(Spacifications spacifications){
        this.spacifications = spacifications;
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + spacifications.getMake());
        System.out.println("Car Model: " + spacifications.getModel());
    }
}
