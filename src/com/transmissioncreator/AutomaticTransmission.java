package com.transmissioncreator;

public class AutomaticTransmission extends Transmission {
    private String transmissionType = "Automatic";
    private int numberOfGears = 5;
    private String typeOfDrive = "2 wheel drive";
    private static int automaticTransmissionCounter;

    public AutomaticTransmission() {
        automaticTransmissionCounter++;
    }

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
        return "Transmission model: AUT/-5-2WDTR";
    }

    public static int getAutomaticTransmissionCounter() {
        return automaticTransmissionCounter;
    }
}
