package com.car_factory.production_units.engine_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.MPE;

public class MediumPowerEngine extends Engine {

    private static String engineModel = MPE.getEngineModel();
    private double engineVolume = MPE.getEngineVolume();
    private int cilindersNumber = MPE.getCilindersNumber();
    private String fuelType = MPE.getFuelType();
    private String fuelMark = MPE.getFuelMark();
    private int enginePower = MPE.getEnginePower();
    private int mediumPowerEngineCounter;

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
        setEngineDescription(mediumPowerEngineCounter,engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        mediumPowerEngineCounter = counter;
    }

    public int getCounter() {
        return mediumPowerEngineCounter;
    }
}
