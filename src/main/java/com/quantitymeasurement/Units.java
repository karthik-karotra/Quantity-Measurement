package com.quantitymeasurement;

public enum Units {
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0);
    final Double unit;

    Units(Double unit) {
        this.unit = unit;
    }
}
