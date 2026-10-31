package com.spring_beans.car;

public class Car {
    private Spacifications spacifications;

    public Car(Spacifications spacifications) {
        this.spacifications = spacifications;
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + spacifications.getMake());
        System.out.println("Car Model: " + spacifications.getModel());
    }
}
