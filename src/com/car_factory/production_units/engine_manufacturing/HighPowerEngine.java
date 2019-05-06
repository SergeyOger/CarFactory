package com.car_factory.production_units.engine_manufacturing;


import java.io.Serializable;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPE;

public class HighPowerEngine extends Engine {

    private static String engineModel = HPE.getEngineModel();
    private double engineVolume = HPE.getEngineVolume();
    private int cilindersNumber = HPE.getCilindersNumber();
    private String fuelType = HPE.getFuelType();
    private String fuelMark = HPE.getFuelMark();
    private int enginePower = HPE.getEnginePower();
    private int highPowerEngineCounter;

    @Override
    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public int getCilindersNumber() {
        return cilindersNumber;
    }

    @Override
    public String getFuelMark() {
        return fuelMark;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return engineModel;
    }

    @Override
    public void getSpecification() {
        setEngineDescription(highPowerEngineCounter,engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        highPowerEngineCounter = counter;
    }

    public int getCounter() {
        return highPowerEngineCounter;
    }
}
