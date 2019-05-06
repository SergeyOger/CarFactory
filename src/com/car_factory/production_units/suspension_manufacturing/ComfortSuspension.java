package com.car_factory.production_units.suspension_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.CTS;

public class ComfortSuspension extends Suspension {

    private static String suspensionModel = CTS.getSuspensionModel();
    private static String comfortLevel = CTS.getComfortLevel();
    private static int clearance = CTS.getClearance();
    private static int suspensionTravel = CTS.getSuspensionTravel();
    private int comfortSuspensionCounter;

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getSpecification() {
        setSuspensionsDescription(comfortSuspensionCounter,suspensionModel, comfortLevel, clearance, suspensionTravel);
    }

    public void setCounter(int counter) {
        comfortSuspensionCounter = counter;
    }

    public int getCounter() {
        return comfortSuspensionCounter;
    }
}
