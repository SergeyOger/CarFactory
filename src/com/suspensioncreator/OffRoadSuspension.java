package com.suspensioncreator;

import static com.infomodule.InfoHandler.SuspensionsE;
import static com.infomodule.InfoHandler.setSuspensionsDescription;

public class OffRoadSuspension extends Suspension {

    private static String suspensionModel = SuspensionsE.ORS.getSuspensionModel();
    private static String comphortLevel = SuspensionsE.ORS.getComphortLevel();
    private static int clearense = SuspensionsE.ORS.getClearense();
    private static int suspensionTreavel = SuspensionsE.ORS.getSuspensionTreavel();
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

    @Override
    public String toString() {
        return suspensionModel;
    }

    @Override
    public void getDetailDescription() {
        setSuspensionsDescription(suspensionModel, comphortLevel, clearense, suspensionTreavel);
    }

    public static void setCounter(int counter) {
        offRoadSuspensionCounter = counter;
    }

    public static int getCounter() {
        return offRoadSuspensionCounter;
    }
}
