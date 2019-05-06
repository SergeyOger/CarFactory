package com.car_factory.production_units.suspension_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.STS;

public class SportSuspension extends Suspension {

    private static String suspensionModel = STS.getSuspensionModel();
    private static String comfortLevel = STS.getComfortLevel();
    private static int clearance = STS.getClearance();
    private static int suspensionTravel = STS.getSuspensionTravel();
    private int sportSuspensionCounter;

    @Override
    public String getComfortLevel() {
        return comfortLevel;
    }

    @Override
    public int getClearance() {
        return clearance;
    }

    @Override
    public int getSuspensionTravel() {
        return suspensionTravel;
    }

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getSpecification() {
        setSuspensionsDescription(sportSuspensionCounter,suspensionModel, comfortLevel, clearance, suspensionTravel);
    }

    public void setCounter(int counter) {
        sportSuspensionCounter = counter;
    }

    public int getCounter() {
        return sportSuspensionCounter;
    }
}
