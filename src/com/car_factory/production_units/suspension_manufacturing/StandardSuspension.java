package com.car_factory.production_units.suspension_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.STDS;

public class StandardSuspension extends Suspension {
    private static String suspensionModel = STDS.getSuspensionModel();
    private static String comfortLevel = STDS.getComfortLevel();
    private static int clearance = STDS.getClearance();
    private static int suspensionTravel = STDS.getSuspensionTravel();
    private int standardSuspensionCounter;

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getSpecification() {
        setSuspensionsDescription(standardSuspensionCounter, suspensionModel, comfortLevel, clearance, suspensionTravel);
    }

    public void setCounter(int counter) {
        standardSuspensionCounter = counter;
    }

    public int getCounter() {
        return standardSuspensionCounter;
    }
}
