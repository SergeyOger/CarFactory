package com.transmissioncreator;

import static com.infomodule.InfoHandler.*;

public class HeavyDutyTransmission extends Transmission {
    private static String transmissionModel = TransmissionsE.HDMT.getTransmissionModel();
    private static String transmissionType = TransmissionsE.HDMT.getTransmissionType();
    private static int numberOfGears = TransmissionsE.HDMT.getNumberOfGears();
    private static String typeOfDrive = TransmissionsE.HDMT.getTypeOfDrive();
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
        return transmissionModel;
    }

    @Override
    public void getDetailDescription() {
        setTransmissionDescription(transmissionModel,transmissionType,numberOfGears,typeOfDrive);
    }

    public static void setCounter(int counter) {
        heavyDutyTransmissionCounter = counter;
    }

    public static int getCounter() {
        return heavyDutyTransmissionCounter;
    }
}
