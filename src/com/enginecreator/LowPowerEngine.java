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
