package com.suspensioncreator;

import static com.infomodule.InfoHandler.SuspensionsE;
import static com.infomodule.InfoHandler.setSuspensionsDescription;

public class ComphortSuspension extends Suspension {

    private static String suspensionModel = SuspensionsE.CTS.getSuspensionModel();
    private static String comphortLevel = SuspensionsE.CTS.getComphortLevel();
    private static int clearense = SuspensionsE.CTS.getClearense();
    private static int suspensionTreavel = SuspensionsE.CTS.getSuspensionTreavel();
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

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getDetailDescription() {
        setSuspensionsDescription(suspensionModel, comphortLevel, clearense, suspensionTreavel);
    }

    public static void setCounter(int counter) {
        comphortSuspensionCounter = counter;
    }

    public static int getCounter() {
        return comphortSuspensionCounter;
    }
}
