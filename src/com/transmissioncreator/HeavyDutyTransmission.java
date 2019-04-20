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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Transmission model:") + String.format("%13s", "HDT/-6-4WDTR"));
        System.out.println(String.format("%-17s", "Transmission type:") + String.format("%14s", transmissionType));
        System.out.println(String.format("%-17s", "Number of gears:") + String.format("%15d", numberOfGears));
        System.out.println(String.format("%-17s", "Type of drives:") + String.format("%15s", typeOfDrive));
        System.out.println();
    }
}
