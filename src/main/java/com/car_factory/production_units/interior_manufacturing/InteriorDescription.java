package com.car_factory.production_units.interior_manufacturing;


public enum InteriorDescription {
    INTERIOR_SERIAL_NUMBER("Interior s/n"),
    INTERIOR_MODEL("Interior model"),
    SEATS_MATERIAL("Seats material"),
    UPHOLSTERY_MATERIAL("Upholstery material"),
    DASHDOARD_TYPE("Dashboard type");
    private String name;

    InteriorDescription(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
