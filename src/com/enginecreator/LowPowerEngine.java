package com.enginecreator;

public class LowPowerEngine extends Engine {

    private double engineVolume = 1.6;
    private int cilindersNumber = 4;
    private String engineType = "Petrol";
    private String fuelType = "A-92";
    private int enginePower = 120;
    private static int lowPowerEngineCounter = 0;

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
        return "Engine model: LP/-4-120-1.6";
    }

    public static int getLowPowerEngineCounter() {
        return lowPowerEngineCounter;
    }
}
