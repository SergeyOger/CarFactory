package com.transmissioncreator;

public class HeavyDutyTransmission extends Transmission {
    private String transmissionType = "Manual";
    private int numberOfGears = 6;
    private String typeOfDrive = "4 wheel drive";
    private static int heavyDutyTransmissionCounter;

    public HeavyDutyTransmission() {
        heavyDutyTransmissionCounter++;
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
        return "Transmission model: HDT/-6-4WDTR";
    }

    public static int getHeavyDutyTransmissionCounter() {
        return heavyDutyTransmissionCounter;
    }
}
