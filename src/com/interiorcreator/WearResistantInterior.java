package com.interiorcreator;

import static com.infomodule.InfoHandler.InteriorsE;
import static com.infomodule.InfoHandler.setInteriorsDescription;

public class WearResistantInterior extends Interior {

    private static String interiorModel = InteriorsE.WRI.getInteriorModel();
    private static String seatsMaterial = InteriorsE.WRI.getSeatsMaterial();
    private static String upholsteryMaterial = InteriorsE.WRI.getUpholsteryMaterial();
    private static String dashboardType = InteriorsE.WRI.getDashboardType();
    private static int wearResistantInteriorCounter;

    public WearResistantInterior() {
        wearResistantInteriorCounter++;
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
        wearResistantInteriorCounter = counter;
    }

    public static int getCounter() {
        return wearResistantInteriorCounter;
    }
}
