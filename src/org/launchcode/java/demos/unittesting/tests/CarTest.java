package org.launchcode.java.demos.unittesting.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.java.demos.unittesting.Car;

public class CarTest {
    Car testCar;

    @Before
    public void createCar() {
        int initialGasTankLevel = 18;
        int mpg = 10;
        testCar = new Car(initialGasTankLevel, mpg)
    }

    @Test
    public void testCarConstructor() {
        int initialGasThankLevel = 18;
        assertEquals(initialGasTankLevel, testCar.getGasTankLevel());
    }

    @Test
    public void testDrive() {
        int milesDriven = 180;
        testCar.drive(milesToDrive);
        assertEquals(0, testCar.getGasTankLevel());
        assertTrue("gasTankLevel is not correct"

    }
}
