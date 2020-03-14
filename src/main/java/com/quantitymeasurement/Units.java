package com.quantitymeasurement;

public enum Units {
    INCH(1 * 12.0), FEET(1 / 12.0);
    final Double unit;

    Units(Double unit) {
        this.unit = unit;
    }
}
