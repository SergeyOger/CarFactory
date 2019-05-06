package com.car_factory.production_units.engine_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.LPE;

public class LowPowerEngine extends Engine {

    private static String engineModel = LPE.getEngineModel();
    private static double engineVolume = LPE.getEngineVolume();
    private static int cilindersNumber = LPE.getCilindersNumber();
    private static String fuelType = LPE.getFuelType();
    private static String fuelMark = LPE.getFuelMark();
    private static int enginePower = LPE.getEnginePower();
    private int lowPowerEngineCounter;

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
        return fuelMark;
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
        setEngineDescription(lowPowerEngineCounter,engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        lowPowerEngineCounter = counter;
    }

    public int getCounter() {
        return lowPowerEngineCounter;
    }
}
