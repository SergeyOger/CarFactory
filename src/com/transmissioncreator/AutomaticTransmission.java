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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Transmission model:") + String.format("%13s", "AUT/-5-2WDTR"));
        System.out.println(String.format("%-17s", "Transmission type:") + String.format("%14s", transmissionType));
        System.out.println(String.format("%-17s", "Number of gears:") + String.format("%15d", numberOfGears));
        System.out.println(String.format("%-17s", "Type of drives:") + String.format("%15s", typeOfDrive));
        System.out.println();
    }
}
