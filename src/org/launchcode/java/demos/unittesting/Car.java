package org.launchcode.java.demos.unittesting;

public class Car {
    private int gasTankLevel;
    private int mpg;


    private int gasTankLevel;
    public Car(int initialGasTankLevel) {
        gasTankLevel = initialGasTankLevel;
        this.mpg = mpg;
    }

    public int getGasTankLevel() {
        return gasTankLevel;
    }

    public void drive(int milesToDrive) {
        gasTankLevel -= milesToDrive * mpg);
    }
}
