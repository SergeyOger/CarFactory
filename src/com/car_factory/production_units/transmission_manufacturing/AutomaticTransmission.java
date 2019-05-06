package com.car_factory.production_units.transmission_manufacturing;

public class AutomaticTransmission extends Transmission {

    private static String transmissionModel = TransmissionSpecification.AT.getTransmissionModel();
    private static String transmissionType = TransmissionSpecification.AT.getTransmissionType();
    private static int numberOfGears = TransmissionSpecification.AT.getNumberOfGears();
    private static String typeOfDrive = TransmissionSpecification.AT.getTypeOfDrive();
    private int automaticTransmissionCounter;

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
        setTransmissionDescription(automaticTransmissionCounter,transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public void setCounter(int counter) {
        automaticTransmissionCounter = counter;
    }

    public int getCounter() {
        return automaticTransmissionCounter;
    }
}
