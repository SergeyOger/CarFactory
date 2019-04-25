package com.suspensioncreator;

import static com.infomodule.InfoHandler.SuspensionsE;
import static com.infomodule.InfoHandler.setSuspensionsDescription;

public class StandartSuspension extends Suspension {
    private static String suspensionModel = SuspensionsE.STDS.getSuspensionModel();
    private static String comphortLevel = SuspensionsE.STDS.getComphortLevel();
    private static int clearense = SuspensionsE.STDS.getClearense();
    private static int suspensionTreavel = SuspensionsE.STDS.getSuspensionTreavel();
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

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getDetailDescription() {
        setSuspensionsDescription(suspensionModel, comphortLevel, clearense, suspensionTreavel);
    }

    public static void setCounter(int counter) {
        standartSuspensionCounter = counter;
    }

    public static int getCounter() {
        return standartSuspensionCounter;
    }
}
