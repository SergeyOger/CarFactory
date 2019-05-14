package com.car_factory.production_units.transmission_manufacturing;

public enum TransmissionDescription {
    TRANSMISSION_SERIAL_NUMBER("Transmission s/n"),
    TRANSMISSION_MODEL("Transmission model"),
    TRANSMISSION_TYPE("Transmission type"),
    NUMBER_OF_GEARS("Number of gears"),
    TYPE_OF_DRIVE("Type of drive");

    private String value;

    TransmissionDescription(String value) {
        this.value = value;
    }

    public String getName() {
        return value;
    }
}
