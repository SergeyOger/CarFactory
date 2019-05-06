package com.car_factory.production_units.transmission_manufacturing;

public class SemiAutomaticTransmission extends Transmission {
    private static String transmissionModel = TransmissionSpecification.SAT.getTransmissionModel();
    private static String transmissionType = TransmissionSpecification.SAT.getTransmissionType();
    private static int numberOfGears = TransmissionSpecification.SAT.getNumberOfGears();
    private static String typeOfDrive = TransmissionSpecification.SAT.getTypeOfDrive();
    private int semiAutomaticTransmissionCounter;

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
    public void getSpecification() {
        setTransmissionDescription(semiAutomaticTransmissionCounter, transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public void setCounter(int counter) {
        semiAutomaticTransmissionCounter = counter;
    }

    public int getCounter() {
        return semiAutomaticTransmissionCounter;
    }
}
