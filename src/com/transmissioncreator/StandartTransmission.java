package com.transmissioncreator;

import static com.infomodule.InfoHandler.*;

public class StandartTransmission extends Transmission {

    private static String transmissionModel = TransmissionsE.SMT.getTransmissionModel();
    private static String transmissionType = TransmissionsE.SMT.getTransmissionType();
    private static int numberOfGears = TransmissionsE.SMT.getNumberOfGears();
    private static String typeOfDrive = TransmissionsE.SMT.getTypeOfDrive();
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
        return transmissionModel;
    }

    @Override
    public void getDetailDescription() {
        setTransmissionDescription(transmissionModel,transmissionType,numberOfGears,typeOfDrive);
    }

    public static void setCounter(int counter) {
        standartTransmissionCounter = counter;
    }

    public static int getCounter() {
        return standartTransmissionCounter;
    }
}
