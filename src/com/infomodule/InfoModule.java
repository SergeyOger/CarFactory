package com.infomodule;

import com.bodycreator.CoupeBody;
import com.bodycreator.SUVBody;
import com.bodycreator.SedanBody;
import com.carcreatehandlers.DetailCarCreateHandler;
import com.carcreatehandlers.FastCarCreateHandler;
import com.detailcarcreator.DetailCarCreator;
import com.enginecreator.HighPowerDieselEngine;
import com.enginecreator.HighPowerEngine;
import com.enginecreator.LowPowerEngine;
import com.enginecreator.MediumPowerEngine;
import com.interiorcreator.SportInterior;
import com.interiorcreator.StandartInterior;
import com.interiorcreator.WearResistantInterior;
import com.suspensioncreator.ComphortSuspension;
import com.suspensioncreator.OffRoadSuspension;
import com.suspensioncreator.SportSuspension;
import com.suspensioncreator.StandartSuspension;
import com.transmissioncreator.AutomaticTransmission;
import com.transmissioncreator.HeavyDutyTransmission;
import com.transmissioncreator.SemiAutomaticTransmission;
import com.transmissioncreator.StandartTransmission;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InfoModule {
    private static String standartCarList = "FastCreatedCars.bin";

    public static Object readFile() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(standartCarList))) {
            Object readedObject = ois.readObject();
            ois.close();
            return readedObject;

        } catch (Exception e) {
            System.out.println("File not readed" + e);
            return null;
        }

    }

    public static void getReadedFile() {

    }


    public InfoModule() throws IOException {

    }

    public static void getDetailCarCounter() {
        if (DetailCarCreateHandler.getCreatedCarCaunter() == 0) {
            System.out.println("None car was created this way");
        } else if (DetailCarCreateHandler.getCreatedCarCaunter() == 1) {
            System.out.println("Only one car was created this way");
        } else {
            System.out.println("For idividual order created " + DetailCarCreateHandler.getCreatedCarCaunter() + "cars");
        }
    }

    public static void getFastCarCounter() {
        if (FastCarCreateHandler.getCreatedCarCaunter() == 0) {
            System.out.println("None car was created this way");
        } else if (FastCarCreateHandler.getCreatedCarCaunter() == 1) {
            System.out.println("Only one car was created this way");
        } else {
            System.out.println("For standart order created " + FastCarCreateHandler.getCreatedCarCaunter() + "cars");
        }
    }

    public static void getAllCarCounter() {
        System.out.println("All created casrs: " + DetailCarCreator.carCounter);
    }

    public static void getEngineStatistics() {
        System.out.println("Produced low power engines: " + LowPowerEngine.getLowPowerEngineCounter());
        System.out.println("Produced medium power engines: " + MediumPowerEngine.getMediumPowerEngineCounter());
        System.out.println("Produced high power engines: " + HighPowerEngine.getHighEngineCounter());
        System.out.println("Produced high power diesel engines: " + HighPowerDieselEngine.getHighPowerDieselEngineCounter());

    }

    public static void getTranssissionStatistics() {
        System.out.println("Prodused standart transmissions: " + StandartTransmission.getStandartTransmissionCounter());
        System.out.println("Prodused automatic transmissions: " + AutomaticTransmission.getAutomaticTransmissionCounter());
        System.out.println("Prodused semi-automatic transmissions: " + SemiAutomaticTransmission.getSemiAutomaticTransmissionCounter());
        System.out.println("Prodused heavy - duty transmissions: " + HeavyDutyTransmission.getHeavyDutyTransmissionCounter());
    }

    public static void getBodyStatistics() {
        System.out.println("Prodused sedan body: " + SedanBody.getSedanBodyCoubter());
        System.out.println("Prodused coupe body: " + CoupeBody.getCoupeBodyCounter());
        System.out.println("Prodused SUV body: " + SUVBody.getSuvBodyCounter());
    }

    public static void getSuspensionStatistics() {
        System.out.println("Prodused standart suspesons: " + StandartSuspension.getStandartSuspensionCounter());
        System.out.println("Prodused comphort suspesons: " + ComphortSuspension.getComphortSuspensionCounter());
        System.out.println("Prodused sport suspesons: " + SportSuspension.getSportSuspensionCounter());
        System.out.println("Prodused off-road suspesons: " + OffRoadSuspension.getOffRoadSuspensionCounter());
    }

    public static void getInteriorStatistics() {
        System.out.println("Prodused standart interiors: " + StandartInterior.getStandartInteriorCounter());
        System.out.println("Prodused sport interiors: " + SportInterior.getSportInteriorCounter());
        System.out.println("Prodused wear resistant interiors: " + WearResistantInterior.getWearResistantInteriorCounter());
    }


}
