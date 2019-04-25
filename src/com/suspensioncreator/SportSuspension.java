package com.suspensioncreator;

import static com.infomodule.InfoHandler.SuspensionsE;
import static com.infomodule.InfoHandler.setSuspensionsDescription;

public class SportSuspension extends Suspension {

    private static String suspensionModel = SuspensionsE.STS.getSuspensionModel();
    private static String comphortLevel = SuspensionsE.STS.getComphortLevel();
    private static int clearense = SuspensionsE.STS.getClearense();
    private static int suspensionTreavel = SuspensionsE.STS.getSuspensionTreavel();
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

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getDetailDescription() {
        setSuspensionsDescription(suspensionModel, comphortLevel, clearense, suspensionTreavel);
    }

    public static void setCounter(int counter) {
        sportSuspensionCounter = counter;
    }

    public static int getCounter() {
        return sportSuspensionCounter;
    }
}
