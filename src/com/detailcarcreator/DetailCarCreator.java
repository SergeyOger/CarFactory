package com.detailcarcreator;

import com.bodycreator.CoupeBody;
import com.bodycreator.SUVBody;
import com.bodycreator.SedanBody;
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

import java.io.Serializable;

/*
    Main car creator
    carDetail contains created object for car
    inddex 0 contains engine type
    inddex 1 contains transmission type
    inddex 2 contains body type
    inddex 3 contains suspension type
    inddex 4 contains interior type

    To display all car info use "seeCarDetail()" void
    To display a specific detail info use "getDetailsType()" void
 */

public class DetailCarCreator implements Serializable {

    public static int carCounter;

    public DetailCarCreator() {
        carCounter++;
    }

    public int getAllCreatedCarCounter() {
        return carCounter;
    }

    public void seeCarDetail() {
        for (int i = 0; i < carDetails.length; i++) {
            System.out.println(carDetails[i]);
        }
    }

    public void getDetailsType(int index) {
        System.out.println(carDetails[index].toString());
    }

    Object[] carDetails = new Object[5];

    public void changeEngine(String engineType) {
        switch (engineType) {
            case "LPE":
                LowPowerEngine lowPowerEngine = new LowPowerEngine();
                carDetails[0] = lowPowerEngine;
                break;
            case "MPE":
                MediumPowerEngine mediumPowerEngine = new MediumPowerEngine();
                carDetails[0] = mediumPowerEngine;
                break;
            case "HPE":
                HighPowerEngine highPowerEngine = new HighPowerEngine();
                carDetails[0] = highPowerEngine;
                break;
            case "HPDE":
                HighPowerDieselEngine highPowerDieselEngine = new HighPowerDieselEngine();
                carDetails[0] = highPowerDieselEngine;
                break;
        }
    }

    public void changeTransmission(String transmissionType) {
        switch (transmissionType) {
            case "SMT":
                StandartTransmission standartTransmission = new StandartTransmission();
                carDetails[1] = standartTransmission;
                break;
            case "AT":
                AutomaticTransmission automaticTransmission = new AutomaticTransmission();
                carDetails[1] = automaticTransmission;
                break;
            case "SAT":
                SemiAutomaticTransmission semiAutomaticTransmission = new SemiAutomaticTransmission();
                carDetails[1] = semiAutomaticTransmission;
                break;
            case "HDMT":
                HeavyDutyTransmission heavyDutyTransmission = new HeavyDutyTransmission();
                carDetails[1] = heavyDutyTransmission;
                break;

        }


    }

    public void changeBody(String bodyType) {
        switch (bodyType) {
            case "S":
                SedanBody sedanBody = new SedanBody();
                carDetails[2] = sedanBody;
                break;
            case "C":
                CoupeBody coupeBody = new CoupeBody();
                carDetails[2] = coupeBody;
                break;
            case "SUV":
                SUVBody suvBody = new SUVBody();
                carDetails[2] = suvBody;
                break;
        }
    }

    public void changeSuspension(String suspensionType) {
        switch (suspensionType) {
            case "STDS":
                StandartSuspension standartSuspension = new StandartSuspension();
                carDetails[3] = standartSuspension;
                break;
            case "CTS":
                ComphortSuspension comphortSuspension = new ComphortSuspension();
                carDetails[3] = comphortSuspension;
                break;
            case "STS":
                SportSuspension sportSuspension = new SportSuspension();
                carDetails[3] = sportSuspension;
                break;
            case "ORS":
                OffRoadSuspension offRoadSuspension = new OffRoadSuspension();
                carDetails[3] = offRoadSuspension;
                break;
        }

    }

    public void changeInterior(String interiorType) {

        switch (interiorType) {
            case "STDI":
                StandartInterior standartInterior = new StandartInterior();
                carDetails[4] = standartInterior;
                break;
            case "STI":
                SportInterior sportInterior = new SportInterior();
                carDetails[4] = sportInterior;
                break;
            case "WRI":
                WearResistantInterior wearResistantInterior = new WearResistantInterior();
                carDetails[4] = wearResistantInterior;
                break;
        }

    }

    @Override
    public String toString() {

        return "Car specification:\n" + carDetails[0].toString() + "\n" + carDetails[1].toString() + "\n"
                + carDetails[2].toString() + "\n" + carDetails[3].toString() + "\n"
                + carDetails[4].toString() + "\n";
    }
}
