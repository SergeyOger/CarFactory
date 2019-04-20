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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Interior model:") + String.format("%15s", "SI/-C-C-D"));
        System.out.println(String.format("%-17s", "Seats materil:") + String.format("%15s", seatsMaterial));
        System.out.println(String.format("%-17s", "Upholstery material:") + String.format("%12s", upholsteryMaterial));
        System.out.println(String.format("%-17s", "Dashboard type:") + String.format("%15s", dashboardType));
        System.out.println();
    }
}
