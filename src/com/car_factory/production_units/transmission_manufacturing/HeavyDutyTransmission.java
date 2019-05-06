package com.car_factory.production_units.transmission_manufacturing;

import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.HDMT;

public class HeavyDutyTransmission extends Transmission {
    private static String transmissionModel = HDMT.getTransmissionModel();
    private static String transmissionType = HDMT.getTransmissionType();
    private static int numberOfGears = HDMT.getNumberOfGears();
    private static String typeOfDrive = HDMT.getTypeOfDrive();
    private int heavyDutyTransmissionCounter;

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public int getNumberOfGears() {
        return numberOfGears;
    }

    @Override
    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    @Override
    public String toString() {
        return transmissionModel;
    }

    @Override
    public void getSpecification() {
        setTransmissionDescription(heavyDutyTransmissionCounter, transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public void setCounter(int counter) {
        heavyDutyTransmissionCounter = counter;
    }

    public int getCounter() {
        return heavyDutyTransmissionCounter;
    }
}
