package com.interiorcreator;

public class StandartInterior extends Interior {

    private String seatsMaterial = "The cloth";
    private String upholsteryMaterial = "The cloth";
    private String dashboardType = "Analog";
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

    public static int getStandartInteriorCounter() {
        return standartInteriorCounter;
    }

    @Override
    public String toString() {
        return "Interior model: STDI/-CL-CL-A";
    }
}
