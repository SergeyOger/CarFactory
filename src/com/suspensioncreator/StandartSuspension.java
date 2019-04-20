package com.suspensioncreator;

public class StandartSuspension extends Suspension {
    private String comphortLevel = "Medium";
    private int clearense = 200;
    private int suspensionTreavel = 80;
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

    @Override
    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Suspension model:") + String.format("%15s", "STS/-M200-80"));
        System.out.println(String.format("%-17s", "Comphort level:") + String.format("%15s", comphortLevel));
        System.out.println(String.format("%-17s", "Suspension clearense:") + String.format("%11d", clearense));
        System.out.println(String.format("%-17s", "Suspension treavel:") + String.format("%13d", suspensionTreavel));
        System.out.println();
    }
}
