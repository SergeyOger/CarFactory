package com.interiorcreator;

public class SportInterior extends Interior {
    private String seatsMaterial = "Carbon";
    private String upholsteryMaterial = "Carbon";
    private String dashboardType = "Digital";
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

    public static int getSportInteriorCounter() {
        return sportInteriorCounter;
    }

    @Override
    public String toString() {
        return "Interior model: SI/-C-C-D";
    }
}
