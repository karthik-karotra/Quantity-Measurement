package com.quantitymeasurement;

public class QuantityMeasurement {

    public double unitConversion(Units units, Double value) {
        return value*units.unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() == o.getClass()) return true;
        return super.equals(o) ;
    }
}
