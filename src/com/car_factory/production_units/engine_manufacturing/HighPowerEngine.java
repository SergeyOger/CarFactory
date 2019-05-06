package com.car_factory.production_units.engine_manufacturing;


import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPE;

public class HighPowerEngine extends Engine {

    private static String engineModel = HPE.getEngineModel();
    private double engineVolume = HPE.getEngineVolume();
    private int cylindersNumber = HPE.getCilindersNumber();
    private String fuelType = HPE.getFuelType();
    private String fuelMark = HPE.getFuelMark();
    private int enginePower = HPE.getEnginePower();
    private int highPowerEngineCounter;

    @Override
    public String toString() {
        return engineModel;
    }

    @Override
    public void getSpecification() {
        setEngineDescription(highPowerEngineCounter, engineModel, engineVolume, cylindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        highPowerEngineCounter = counter;
    }

    public int getCounter() {
        return highPowerEngineCounter;
    }
}
