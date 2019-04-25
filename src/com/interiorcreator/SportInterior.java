package com.interiorcreator;

import static com.infomodule.InfoHandler.InteriorsE;
import static com.infomodule.InfoHandler.setInteriorsDescription;

public class SportInterior extends Interior {

    private static String interiorModel = InteriorsE.STI.getInteriorModel();
    private static String seatsMaterial = InteriorsE.STI.getSeatsMaterial();
    private static String upholsteryMaterial = InteriorsE.STI.getUpholsteryMaterial();
    private static String dashboardType = InteriorsE.STI.getDashboardType();
    private static int sportInteriorCounter;

    public SportInterior() {
        sportInteriorCounter++;
    }

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
    public void getDetailDescription() {
        setInteriorsDescription(interiorModel, seatsMaterial, upholsteryMaterial, dashboardType);
    }

    public static void setCounter(int counter) {
        sportInteriorCounter = counter;
    }

    public static int getCounter() {
        return sportInteriorCounter;
    }
}
