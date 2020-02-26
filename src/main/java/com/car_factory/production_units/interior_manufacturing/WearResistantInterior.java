package com.car_factory.production_units.interior_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.WRI;

public class WearResistantInterior extends Interior {

    private static String interiorModel = WRI.getInteriorModel();
    private static String seatsMaterial = WRI.getSeatsMaterial();
    private static String upholsteryMaterial = WRI.getUpholsteryMaterial();
    private static String dashboardType = WRI.getDashboardType();
    private int wearResistantInteriorCounter;

    @Override
    public String toString() {
        return interiorModel;
    }

    @Override
    public void getSpecification() {
        setInteriorsDescription(wearResistantInteriorCounter,interiorModel, seatsMaterial, upholsteryMaterial, dashboardType);
    }

    public void setCounter(int counter) {
        wearResistantInteriorCounter = counter;
    }

    public int getCounter() {
        return wearResistantInteriorCounter;
    }
}
