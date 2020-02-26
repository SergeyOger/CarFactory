package com.car_factory.production_units.engine_manufacturing;

import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPDE;


public class HighPowerDieselEngine extends Engine {

    private static String engineModel = HPDE.getEngineModel();
    private static double engineVolume = HPDE.getEngineVolume();
    private static int cylindersNumber = HPDE.getCilindersNumber();
    private static String fuelType = HPDE.getFuelType();
    private static String fuelMark = HPDE.getFuelMark();
    private static int enginePower = HPDE.getEnginePower();
    private int highPowerDieselEngineCounter;

    @Override
    public String toString() {
        return engineModel;
    }

    public void getSpecification() {
        setEngineDescription(highPowerDieselEngineCounter,engineModel, engineVolume, cylindersNumber, fuelType, fuelMark, enginePower);
    }

    public void setCounter(int counter) {
        highPowerDieselEngineCounter = counter;
    }

    public int getCounter() {
        return highPowerDieselEngineCounter;
    }

}
