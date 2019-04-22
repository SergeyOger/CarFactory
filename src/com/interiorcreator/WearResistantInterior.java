package com.interiorcreator;

public class WearResistantInterior extends Interior {
    private String seatsMaterial = "The cloth";
    private String upholsteryMaterial = "Alcantara";
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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Interior model:") + String.format("%15s", "SI/-C-C-D"));
        System.out.println(String.format("%-17s", "Seats materil:") + String.format("%15s", seatsMaterial));
        System.out.println(String.format("%-17s", "Upholstery material:") + String.format("%12s", upholsteryMaterial));
        System.out.println(String.format("%-17s", "Dashboard type:") + String.format("%15s", dashboardType));
        System.out.println();
    }
}
