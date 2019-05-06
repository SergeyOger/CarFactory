package com.car_factory.production_units.interior_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STI;

public class SportInterior extends Interior {

    private static String interiorModel = STI.getInteriorModel();
    private static String seatsMaterial = STI.getSeatsMaterial();
    private static String upholsteryMaterial = STI.getUpholsteryMaterial();
    private static String dashboardType = STI.getDashboardType();
    private int sportInteriorCounter;

    @Override
    public String getSeatsMaterial() {
        return seatsMaterial;
    }

    @Override
    public String getUpholsteriMaterial() {
        return upholsteryMaterial;
    }

    @Override
    public String getDashboardtype() {
        return dashboardType;
    }

    @Override
    public String toString() {
        return interiorModel;
    }

    @Override
    public void getSpecification() {
        setInteriorsDescription(sportInteriorCounter, interiorModel, seatsMaterial, upholsteryMaterial, dashboardType);
    }

    public void setCounter(int counter) {
        sportInteriorCounter = counter;
    }

    public int getCounter() {
        return sportInteriorCounter;
    }
}
