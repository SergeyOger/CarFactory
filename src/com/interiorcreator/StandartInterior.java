package com.interiorcreator;

import static com.infomodule.InfoHandler.InteriorsE;
import static com.infomodule.InfoHandler.setInteriorsDescription;

public class StandartInterior extends Interior {

    private static String interiorModel = InteriorsE.STDI.getInteriorModel();
    private static String seatsMaterial = InteriorsE.STDI.getSeatsMaterial();
    private static String upholsteryMaterial = InteriorsE.STDI.getUpholsteryMaterial();
    private static String dashboardType = InteriorsE.STDI.getDashboardType();
    private static int standartInteriorCounter;

    public StandartInterior() {
        standartInteriorCounter++;
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
        standartInteriorCounter = counter;
    }

    public static int getCounter() {
        return standartInteriorCounter;
    }
}
