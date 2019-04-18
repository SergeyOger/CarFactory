package com.suspensioncreator;

public class StandartSuspension extends Suspension {
    private String comphortLevel = "Medium";
    private int clearense = 200;
    private  int suspensionTreavel = 80;
    private static int standartSuspensionCounter;

    public StandartSuspension() {
        standartSuspensionCounter++;
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

    public static int getStandartSuspensionCounter() {
        return standartSuspensionCounter;
    }

    @Override
    public String toString() {
        return "Suspension model: STS/-M200-80";
    }
}
