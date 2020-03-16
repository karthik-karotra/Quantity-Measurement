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

    //TestCases for equality check on feet
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

    //TestCases for equality check on inch
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

    //TestCases for equality check on feet and inch
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

    //TestCases for equality check on yard
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

    //TestCases for equality check on Feet,Inch and Yard
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

    //TestCases for equality check on Centimeter
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

    //TestCases for equality check on Centimeter and Inch
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
        Assert.assertEquals(4, value1 + value2, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        Assert.assertEquals(14, value1 + value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(24, value1 + value2, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 2.5);
        Assert.assertEquals(3, value1 + value2, 0.0);
    }

    //TestCases for equality check on Gallon
    @Test
    public void givenZeroGallonAndZeroGallonValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentGallonValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullGallonValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Litre
    @Test
    public void givenZeroLitreAndZeroLitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentLitreValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullLitreValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on MilliLitre
    @Test
    public void givenZeroMillilitreAndZeroMillilitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentMillilitreValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullMillilitreValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Litre,MilliLitre and Gallon
    @Test
    public void givenVolumeInGallonAndLitre_WhenEqualInVolume_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 3.78);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneLitreAndOneThousandMillilitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for addition of volumes in different units to litres
    @Test
    public void givenVolumesInDifferentUnits_WhenAdded_ShouldReturnVolumeInLitre() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 3.78);
        Assert.assertEquals(7.56, value1 + value2, 0.0);
    }

    @Test
    public void givenOneLitreAndOneThousandMillilitre_WhenAdded_ShouldReturnTwoLitres() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1000.0);
        Assert.assertEquals(2, value1 + value2, 0.0);
    }

    //TestCases for equality check on Kilogram
    @Test
    public void givenZeroKilogramAndZeroKilogramValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentKilogramValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullKilogramValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Grams
    @Test
    public void givenZeroGramAndZeroGramValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentGramValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullGramValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Tonne
    @Test
    public void givenZeroTonneAndZeroTonneValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentTonneValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullTonneValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Tonne,Kilogram and gram
    @Test
    public void givenOneKilogramAndOneThousandGrams_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneTonneAndOneThousandKilograms_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for addition of weights in different units to litres
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_ShouldReturnOneThousandOneKilograms() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1000.0);
        Assert.assertEquals(1001, value1 + value2, 0.0);
    }

    //TestCases for equality check on Celsius
    @Test
    public void givenZeroCelsiusAndZeroCelsius_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentCelsiusValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullCelsiusValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.CELSIUS, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Fahrenheit
    @Test
    public void givenZeroFahrenheitAndZeroFahrenheitValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentFahrenheitValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFahrenheitValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Fahrenheit and Celsius
    @Test
    public void givenTwoHundredAndTwelveFahrenheitAndHundredCelsiusValue_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 212.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 100.0);
        Assert.assertEquals(value1,value2, 0.0);
    }

}
