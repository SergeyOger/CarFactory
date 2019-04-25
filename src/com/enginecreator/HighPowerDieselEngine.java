package com.enginecreator;

import static com.infomodule.InfoHandler.*;

public class HighPowerDieselEngine extends Engine {

    private static String engineModel = EnginesE.HPDE.getEngineModel();
    private static double engineVolume = EnginesE.HPDE.getEngineVolume();
    private static int cilindersNumber = EnginesE.HPDE.getCilindersNumber();
    private static String fuelType = Fuel.DIESEL.getFuelType();
    private static String fuelMark = Fuel.DIESEL.getFuelMark();
    private static int enginePower = EnginesE.HPDE.getEnginePower();
    private static int highPowerDieselEngineCounter;

    public HighPowerDieselEngine() {
        highPowerDieselEngineCounter++;
    }

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

    public void getDetailDescription() {
        setEngineDescription(engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public static void setCounter(int counter) {
        highPowerDieselEngineCounter = counter;
    }

    public static int getCounter() {
        return highPowerDieselEngineCounter;
    }
}
