package com.car_factory.production_units.interior_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STDI;

public class StandartInterior extends Interior {

    private static String interiorModel = STDI.getInteriorModel();
    private static String seatsMaterial = STDI.getSeatsMaterial();
    private static String upholsteryMaterial = STDI.getUpholsteryMaterial();
    private static String dashboardType = STDI.getDashboardType();
    private int standardInteriorCounter;

    @Override
    public String toString() {
        return interiorModel;
    }

    @Override
    public void getSpecification() {
        setInteriorsDescription(standardInteriorCounter,interiorModel, seatsMaterial, upholsteryMaterial, dashboardType);
    }

    public void setCounter(int counter) {
        standardInteriorCounter = counter;
    }

    public int getCounter() {
        return standardInteriorCounter;
    }
}
