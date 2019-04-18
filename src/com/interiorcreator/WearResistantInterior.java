package com.interiorcreator;

public class WearResistantInterior extends Interior {
    private String seatsMaterial = "The cloth";
    private String upholsteryMaterial = "AcLcantara";
    private String dashboardType = "Digital";
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

    public static int getWearResistantInteriorCounter() {
        return wearResistantInteriorCounter;
    }

    @Override
    public String toString() {
        return "Interior model: WRI/-CL-ANT-D";
    }
}