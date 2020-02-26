package com.car_factory.production_units.body_manufacturing;

public enum BodyDescription {
    BODY_SERIAL_NUMBER("Body s/n"),
    BODY_MODEL("Body model"),
    BODY_TYPE("Body type"),
    BODY_MATRIAL("Body material"),
    BODY_COLOUR("Body colour"),
    NUMBER_OF_SEATS("Number of seats"),
    NUMBER_OF_DOORS("Number of doors");

    private String name;

    BodyDescription(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
