package com.suspensioncreator;

public class SportSuspension extends Suspension {
    private String comphortLevel = "Low";
    private int clearense = 120;
    private  int suspensionTreavel = 50;
    private static int sportSuspensionCounter;

    public SportSuspension() {
        sportSuspensionCounter++;
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

    public static int getSportSuspensionCounter() {
        return sportSuspensionCounter;
    }

    @Override
    public String toString() {
        return "Suspension model: SP/-L120-50";
    }
}
