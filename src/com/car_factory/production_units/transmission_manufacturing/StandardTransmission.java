package com.car_factory.production_units.transmission_manufacturing;

import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.SMT;

public class StandardTransmission extends Transmission {

    private static String transmissionModel = SMT.getTransmissionModel();
    private static String transmissionType = SMT.getTransmissionType();
    private static int numberOfGears = SMT.getNumberOfGears();
    private static String typeOfDrive = SMT.getTypeOfDrive();
    private int standartTransmissionCounter;

    @Override
    public String toString() {
        return transmissionModel;
    }

    @Override
    public void getSpecification() {
        setTransmissionDescription(standartTransmissionCounter, transmissionModel, transmissionType, numberOfGears, typeOfDrive);
    }

    public void setCounter(int counter) {
        standartTransmissionCounter = counter;
    }

    public int getCounter() {
        return standartTransmissionCounter;
    }
}
