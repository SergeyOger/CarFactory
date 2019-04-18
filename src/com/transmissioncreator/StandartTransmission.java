package com.transmissioncreator;

public class StandartTransmission extends Transmission {
    private String transmissionType = "Manual";
    private int numberOfGears = 5;
    private String typeOfDrive = "2 wheel drive";
    private static int standartTransmissionCounter;

    public StandartTransmission() {
        standartTransmissionCounter++;
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
        return "Transmission model: STD/-5-2WDTR";
    }

    public static int getStandartTransmissionCounter() {
        return standartTransmissionCounter;
    }
}
