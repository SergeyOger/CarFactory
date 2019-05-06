package com.car_factory.production_units.engine_manufacturing;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.MPE;

public class MediumPowerEngine extends Engine {

    private static String engineModel = MPE.getEngineModel();
    private double engineVolume = MPE.getEngineVolume();
    private int cylindersNumber = MPE.getCilindersNumber();
    private String fuelType = MPE.getFuelType();
    private String fuelMark = MPE.getFuelMark();
    private int enginePower = MPE.getEnginePower();
    private int mediumPowerEngineCounter;

    @Override
    public String toString() {
        return engineModel;
    }

    @Override
    public void getSpecification() {
        setEngineDescription(mediumPowerEngineCounter, engineModel, engineVolume, cylindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        mediumPowerEngineCounter = counter;
    }

    public int getCounter() {
        return mediumPowerEngineCounter;
    }
}
