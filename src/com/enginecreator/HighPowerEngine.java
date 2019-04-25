package com.enginecreator;

import static com.infomodule.InfoHandler.*;


public class HighPowerEngine extends Engine {

    private static String engineModel = EnginesE.HPE.getEngineModel();
    private double engineVolume = EnginesE.HPE.getEngineVolume();
    private int cilindersNumber = EnginesE.HPE.getCilindersNumber();
    private String fuelType = Fuel.HIGH_OCTAN_PETROL.getFuelType();
    private String fuelMark = Fuel.HIGH_OCTAN_PETROL.getFuelMark();
    private int enginePower = EnginesE.HPE.getEnginePower();
    private static int highPowerEngineCounter;

    public HighPowerEngine() {
        highPowerEngineCounter++;
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

    @Override
    public void getDetailDescription() {
        setEngineDescription(engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public static void setCounter(int counter) {
        highPowerEngineCounter = counter;
    }

    public static int getCounter() {
        return highPowerEngineCounter;
    }
}
