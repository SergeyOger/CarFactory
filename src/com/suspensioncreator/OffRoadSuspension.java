package com.suspensioncreator;

public class OffRoadSuspension extends Suspension {
    private String comphortLevel = "Medium";
    private int clearense = 350;
    private int suspensionTreavel = 180;
    private static int offRoadSuspensionCounter;

    public OffRoadSuspension() {
        offRoadSuspensionCounter++;
    }

    @Override
    public String getComphortLevel() {
        return comphortLevel;
    }

    @Override
    public int getClearense() {
        return clearense;
    }

    @Override
    public int getSuspensionTreavel() {
        return suspensionTreavel;
    }

    public static int getOffRoadSuspensionCounter() {
        return offRoadSuspensionCounter;
    }

    @Override
    public String toString() {
        return "Suspension model: ORS/-M350-180";
    }

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Suspension model:") + String.format("%15s", "ORS/-M350-180"));
        System.out.println(String.format("%-17s", "Comphort level:") + String.format("%15s", comphortLevel));
        System.out.println(String.format("%-17s", "Suspension clearense:") + String.format("%11d", clearense));
        System.out.println(String.format("%-17s", "Suspension treavel:") + String.format("%13d", suspensionTreavel));
        System.out.println();
    }
}
