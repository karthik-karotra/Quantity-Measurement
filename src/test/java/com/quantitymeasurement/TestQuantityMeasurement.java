package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuantityMeasurement {
    static FeetMeasurement feetMeasurement;

    @BeforeClass
    public static void beforeClass() {
        feetMeasurement = new FeetMeasurement();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = feetMeasurement.getFeet(0.0);
        double value2 = feetMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = feetMeasurement.getFeet(0.0);
        double value2 = feetMeasurement.getFeet(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(feetMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        FeetMeasurement feetMeasurement2 = new FeetMeasurement();
        Assert.assertEquals(feetMeasurement, feetMeasurement2);
    }

    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = feetMeasurement.getFeet(1.0);
        double value2 = feetMeasurement.getFeet(1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
