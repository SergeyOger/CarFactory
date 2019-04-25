package com.transmissioncreator;

import static com.infomodule.InfoHandler.TransmissionsE;
import static com.infomodule.InfoHandler.setTransmissionDescription;

public class SemiAutomaticTransmission extends Transmission {
    private static String transmissionModel = TransmissionsE.SAT.getTransmissionModel();
    private static String transmissionType = TransmissionsE.SAT.getTransmissionType();
    private static int numberOfGears = TransmissionsE.SAT.getNumberOfGears();
    private static String typeOfDrive = TransmissionsE.SAT.getTypeOfDrive();
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
        return transmissionModel;
    }

    @Override
    public void getDetailDescription() {
        setTransmissionDescription(transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public static void setCounter(int counter) {
        semiAutomaticTransmissionCounter = counter;
    }

    public static int getCounter() {
        return semiAutomaticTransmissionCounter;
    }
}
