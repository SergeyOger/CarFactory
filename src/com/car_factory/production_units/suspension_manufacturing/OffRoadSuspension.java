package com.car_factory.production_units.suspension_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.ORS;

public class OffRoadSuspension extends Suspension {

    private static String suspensionModel = ORS.getSuspensionModel();
    private static String comfortLevel = ORS.getComfortLevel();
    private static int clearance = ORS.getClearance();
    private static int suspensionTravel = ORS.getSuspensionTravel();
    private int offRoadSuspensionCounter;

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
        setSuspensionsDescription(offRoadSuspensionCounter,suspensionModel, comfortLevel, clearance, suspensionTravel);
    }

    public void setCounter(int counter) {
        offRoadSuspensionCounter = counter;
    }

    public int getCounter() {
        return offRoadSuspensionCounter;
    }
}
