package com.transmissioncreator;

public class SemiAutomaticTransmission extends Transmission {
    private String transmissionType = "Semi - automatic";
    private int numberOfGears = 6;
    private String typeOfDrive = "2 wheel drive";
    private static int semiAutomaticTransmissionCounter;

    public SemiAutomaticTransmission() {
        semiAutomaticTransmissionCounter++;
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
        return "Transmission model: SAT/-6-4WDTR";
    }

    public static int getSemiAutomaticTransmissionCounter() {
        return semiAutomaticTransmissionCounter;
    }

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Transmission model:") + String.format("%13s", "SAT/-6-4WDTR"));
        System.out.println(String.format("%-17s", "Transmission type:") + String.format("%14s", transmissionType));
        System.out.println(String.format("%-17s", "Number of gears:") + String.format("%15d", numberOfGears));
        System.out.println(String.format("%-17s", "Type of drives:") + String.format("%15s", typeOfDrive));
        System.out.println();
    }
}
