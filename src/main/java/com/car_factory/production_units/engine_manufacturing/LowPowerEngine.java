package com.car_factory.production_units.engine_manufacturing;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.LPE;

public class LowPowerEngine extends Engine {

    private static String engineModel = LPE.getEngineModel();
    private static double engineVolume = LPE.getEngineVolume();
    private static int cylindersNumber = LPE.getCilindersNumber();
    private static String fuelType = LPE.getFuelType();
    private static String fuelMark = LPE.getFuelMark();
    private static int enginePower = LPE.getEnginePower();
    private int lowPowerEngineCounter;

    @Override
    public String toString() {
        return engineModel;
    }

    @Override
    public void getSpecification() {
        setEngineDescription(lowPowerEngineCounter, engineModel, engineVolume, cylindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        lowPowerEngineCounter = counter;
    }

    public int getCounter() {
        return lowPowerEngineCounter;
    }
}
