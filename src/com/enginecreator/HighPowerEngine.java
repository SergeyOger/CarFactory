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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Engine model:") + String.format("%15s", "MP/-6-350-2.5"));
        System.out.println(String.format("%-17s", "Engine volume, L:") + String.format("%15.2f", engineVolume));
        System.out.println(String.format("%-17s", "Engine type:") + String.format("%15s", engineType));
        System.out.println(String.format("%-17s", "Fuel type:") + String.format("%15s", fuelType));
        System.out.println(String.format("%-17s", "Engine power, HP:") + String.format("%15d", enginePower));
        System.out.println();
    }
}
