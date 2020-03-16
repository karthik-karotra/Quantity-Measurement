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

    //TestCases for feet
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.FEET_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
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
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for inch
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    @Test
    public void givenReferenceObjectOfInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    @Test
    public void givenSameClassObjectOfInch_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenZeroInchAndZeroFeet_WhenZero_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndTwelveInch_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwelveFeetAndOneInch_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for yard
    @Test
    public void givenZeroYardAndZeroYardValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentYardValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullYardValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.YARD_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInchAndOneYard_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThirtySixInchAndOneYard_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for
    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentCentimeterValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.CM_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for addition of values in different units to inches
    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        Assert.assertEquals(4,value1+value2, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        Assert.assertEquals(14,value1+value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(24,value1+value2, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 2.5);
        Assert.assertEquals(3,value1+value2, 0.0);
    }
}
