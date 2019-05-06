package com.car_factory.production_units.engine_manufacturing;


public enum EngineDescription {
    ENGINE_SERIAL_NUMBER("Engine s/n"),
    ENGINE_MODEL("Engine model"),
    ENGINE_VOLUME("Engine volume, L"),
    CILINDERS_NUMBER("Cilinders number"),
    ENGINE_POWER("Engine power"),
    FUEL_TYPE("Fuel type"),
    FUEL_MARK("Fuel mark");

    private String value;

    EngineDescription(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

