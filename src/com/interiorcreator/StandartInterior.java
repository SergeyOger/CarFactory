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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Interior model:") + String.format("%15s", "SI/-C-C-D"));
        System.out.println(String.format("%-17s", "Seats materil:") + String.format("%15s", seatsMaterial));
        System.out.println(String.format("%-17s", "Upholstery material:") + String.format("%12s", upholsteryMaterial));
        System.out.println(String.format("%-17s", "Dashboard type:") + String.format("%15s", dashboardType));
        System.out.println();
    }
}
