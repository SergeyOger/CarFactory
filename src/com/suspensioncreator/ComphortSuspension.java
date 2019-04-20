package com.suspensioncreator;

public class ComphortSuspension extends Suspension {
    private String comphortLevel = "High";
    private int clearense = 250;
    private int suspensionTreavel = 100;
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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Suspension model:") + String.format("%15s", "CS/-H250-100"));
        System.out.println(String.format("%-17s", "Comphort level:") + String.format("%15s", comphortLevel));
        System.out.println(String.format("%-17s", "Suspension clearense:") + String.format("%11d", clearense));
        System.out.println(String.format("%-17s", "Suspension treavel:") + String.format("%13d", suspensionTreavel));
        System.out.println();
    }
}
