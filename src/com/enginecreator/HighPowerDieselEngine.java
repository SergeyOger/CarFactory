package com.enginecreator;

public class HighPowerDieselEngine extends Engine {

    private double engineVolume = 6.8;
    private int cilindersNumber = 6;
    private String engineType = "Diesel";
    private String fuelType = "Diesel";
    private int enginePower = 560;
    private static int highPowerDieselEngineCounter = 0;
    
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
        return "Engine model: HPD/-6-560-6.8";
    }

    public static int getHighPowerDieselEngineCounter() {
        return highPowerDieselEngineCounter;
    }
}
