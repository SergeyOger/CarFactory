package com.car_factory.production_units.engine_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPDE;


public class HighPowerDieselEngine extends Engine {

    private static String engineModel = HPDE.getEngineModel();
    private static double engineVolume = HPDE.getEngineVolume();
    private static int cilindersNumber = HPDE.getCilindersNumber();
    private static String fuelType = HPDE.getFuelType();
    private static String fuelMark = HPDE.getFuelMark();
    private static int enginePower = HPDE.getEnginePower();
    private int highPowerDieselEngineCounter;

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

    public void getSpecification() {
        setEngineDescription(highPowerDieselEngineCounter,engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        highPowerDieselEngineCounter = counter;
    }

    public int getCounter() {
        return highPowerDieselEngineCounter;
    }

}
