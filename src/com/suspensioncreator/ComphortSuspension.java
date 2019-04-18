package com.suspensioncreator;

public class ComphortSuspension extends Suspension {
    private String comphortLevel = "High";
    private int clearense = 250;
    private  int suspensionTreavel = 100;
    private static int comphortSuspensionCounter;

    public ComphortSuspension() {
        comphortSuspensionCounter++;
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

    public static int getComphortSuspensionCounter() {
        return comphortSuspensionCounter;
    }

    @Override
    public String toString() {
        return "Suspension model: CS/-H250-100";
    }
}
