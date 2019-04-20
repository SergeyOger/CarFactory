package com.suspensioncreator;

public class SportSuspension extends Suspension {
    private String comphortLevel = "Low";
    private int clearense = 120;
    private int suspensionTreavel = 50;
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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Suspension model:") + String.format("%15s", "SP/-L120-50"));
        System.out.println(String.format("%-17s", "Comphort level:") + String.format("%15s", comphortLevel));
        System.out.println(String.format("%-17s", "Suspension clearense:") + String.format("%11d", clearense));
        System.out.println(String.format("%-17s", "Suspension treavel:") + String.format("%13d", suspensionTreavel));
        System.out.println();
    }
}
