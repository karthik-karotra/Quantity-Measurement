package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuantityMeasurement {
    static QuantityMeasurement quantityMeasurement;

    @BeforeClass
    public static void beforeClass() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectOfFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    @Test
    public void givenSameClassObjectOfFeet_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(1.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getInch(0.0);
        double value2 = quantityMeasurement.getInch(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getInch(0.0);
        double value2 = quantityMeasurement.getInch(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectOfInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getInch(1.0);
        double value2 = quantityMeasurement.getInch(1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenSameClassObjectOfInch_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }
}
