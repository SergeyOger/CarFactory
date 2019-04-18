package com.suspensioncreator;

public class OffRoadSuspension extends Suspension {
    private String comphortLevel = "Medium";
    private int clearense = 350;
    private  int suspensionTreavel = 180;
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
}
