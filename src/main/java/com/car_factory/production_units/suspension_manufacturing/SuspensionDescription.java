package com.car_factory.production_units.suspension_manufacturing;

public enum SuspensionDescription {

    SUSPENSION_SERIAL_NUMBER("Suspension s/n"),
    SUSPENSION_MODEL("Suspension model"),
    COMFORT_LEVEL("Comfort level"),
    CLEARANCE("Clearance"),
    SUSPENSION_TRAVEL("Suspension travel");

    private String name;

    SuspensionDescription(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
