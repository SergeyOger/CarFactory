package com.enginecreator;

import static com.infomodule.InfoHandler.*;

public class LowPowerEngine extends Engine {
    private static String engineModel = EnginesE.LPE.getEngineModel();
    private static double engineVolume = EnginesE.LPE.getEngineVolume();
    private static int cilindersNumber = EnginesE.LPE.getCilindersNumber();
    private static String fuelType = Fuel.PETROL.getFuelType();
    private static String fuelMark = Fuel.PETROL.getFuelMark();
    private static int enginePower = EnginesE.LPE.getEnginePower();
    private static int lowPowerEngineCounter;

    public LowPowerEngine() {
        lowPowerEngineCounter++;
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
    public void getDetailDescription() {
        setEngineDescription(engineModel, engineVolume, cilindersNumber, fuelType, fuelMark, enginePower);
    }

    public static void setCounter(int counter) {
        lowPowerEngineCounter = counter;
    }

    public static int getCounter() {
        return lowPowerEngineCounter;
    }
}
