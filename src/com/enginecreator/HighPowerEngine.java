package com.enginecreator;

public class HighPowerEngine extends Engine {

    private double engineVolume = 5.2;
    private int cilindersNumber = 12;
    private String engineType = "Petrol";
    private String fuelType = "A-98";
    private int enginePower = 620;
    private static int highPowerEngineCounter = 0;

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
    public String getEngineType() {
        return engineType;
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
        return "Engine model: HP/-12-620-5.2";
    }

    public static int getHighEngineCounter() {
        return highPowerEngineCounter;
    }
}
