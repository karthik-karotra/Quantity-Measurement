package com.quantitymeasurement;

public class QuantityMeasurement {

    public double unitConversion(Units units, Double value) {
        return (String.valueOf(units)=="CELSIUS_TO_FAHRENHEIT") ? value * units.unit+32 :value * units.unit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (this.getClass() == o.getClass()) return true;
        return super.equals(o);
    }

    public double addingUnits(double value1, double value2) {
            return value1+value2;
    }
}
