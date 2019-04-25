package com.enginecreator;

import static com.infomodule.InfoHandler.*;

public class MediumPowerEngine extends Engine {

    private static String engineModel = EnginesE.MPE.getEngineModel();
    private double engineVolume = EnginesE.MPE.getEngineVolume();
    private int cilindersNumber = EnginesE.MPE.getCilindersNumber();
    private String fuelType = Fuel.PETROL.getFuelType();
    private String fuelMark = Fuel.PETROL.getFuelMark();
    private int enginePower = EnginesE.MPE.getEnginePower();
    private static int mediumPowerEngineCounter = 0;

    public MediumPowerEngine() {
        mediumPowerEngineCounter++;
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
        mediumPowerEngineCounter = counter;
    }

    public static int getCounter() {
        return mediumPowerEngineCounter;
    }
}
