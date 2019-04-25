package com.transmissioncreator;

import static com.infomodule.InfoHandler.TransmissionsE;
import static com.infomodule.InfoHandler.setTransmissionDescription;

public class AutomaticTransmission extends Transmission {

    private static String transmissionModel = TransmissionsE.AT.getTransmissionModel();
    private static String transmissionType = TransmissionsE.AT.getTransmissionType();
    private static int numberOfGears = TransmissionsE.AT.getNumberOfGears();
    private static String typeOfDrive = TransmissionsE.AT.getTypeOfDrive();
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
        return transmissionModel;
    }

    @Override
    public void getDetailDescription() {
        setTransmissionDescription(transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public static void setCounter(int counter) {
        automaticTransmissionCounter = counter;
    }

    public static int getCounter() {
        return automaticTransmissionCounter;
    }
}
