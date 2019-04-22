/*
Create new car:
    public void changeEngine();
    public void changeTransmission();
    public void changeBody();
    public void changeSuspension();
    public void changeInterior();

Show info about created car
    public void seeCarDetail();
Save created car to collection

Show order number
    public String toString();
*/

package com.detailcarcreator;

import com.bodycreator.Body;
import com.bodycreator.CoupeBody;
import com.bodycreator.SUVBody;
import com.bodycreator.SedanBody;
import com.enginecreator.*;
import com.infomodule.InfoHandler;
import com.infomodule.InfoModule;
import com.interiorcreator.Interior;
import com.interiorcreator.SportInterior;
import com.interiorcreator.StandartInterior;
import com.interiorcreator.WearResistantInterior;
import com.suspensioncreator.*;
import com.transmissioncreator.*;

import java.io.Serializable;
import java.util.ArrayList;


public class DetailCarCreator implements Serializable {

    private static int carCounter;                  // Number of all created cars
    public static String orderNumber;               // For display order number
    private static int orderCounter;                // Order for writing created car to collection
    public ArrayList<Engine> createdEngines;
    public ArrayList<Transmission> createdTransmissions;
    public ArrayList<Body> createdBodys;
    public ArrayList<Suspension> createdSuspensions;
    public ArrayList<Interior> createdInteriors;

    public DetailCarCreator() {
        carCounter = InfoHandler.readNumber(InfoModule.CAR_COUNTER);
        orderNumber = String.valueOf(carCounter);

        if (carCounter == 0) {
            carCounter++;
            orderCounter = 0;
            this.createdEngines = new ArrayList<>();
            this.createdTransmissions = new ArrayList<>();
            this.createdBodys = new ArrayList<>();
            this.createdSuspensions = new ArrayList<>();
            this.createdInteriors = new ArrayList<>();
        } else {
            carCounter++;
            orderCounter = InfoHandler.readNumber(InfoModule.ORDER_COUNTER);
            orderCounter++;
            createdEngines = InfoHandler.readSavedObject(createdEngines, InfoModule.ENGINES);
            createdTransmissions = InfoHandler.readSavedObject(createdTransmissions, InfoModule.TRANSMISSIONS);
            createdBodys = InfoHandler.readSavedObject(createdBodys, InfoModule.BODIES);
            createdSuspensions = InfoHandler.readSavedObject(createdSuspensions, InfoModule.SUSPENSIONS);
            createdInteriors = InfoHandler.readSavedObject(createdInteriors, InfoModule.INTERIORS);
        }

    }

    public int getAllCreatedCarCounter() {
        return carCounter;
    }

    public int getOrderCounter() {
        return orderCounter;
    }

    public <T> ArrayList<T> getCollectioninfo(ArrayList<T> list) {
        return list;
    }

    public void seeCarDetail() {
        System.out.println(toString());
        orderNumber = String.format("%7d", orderCounter);
        createdEngines.get(orderCounter).getDetailDescription();
        createdTransmissions.get(orderCounter).getDetailDescription();
        createdBodys.get(orderCounter).getDetailDescription();
        createdSuspensions.get(orderCounter).getDetailDescription();
        createdInteriors.get(orderCounter).getDetailDescription();
    }

    public void changeEngine(String engineType) {
        switch (engineType) {
            case "LPE":
                LowPowerEngine lowPowerEngine = new LowPowerEngine();
                createdEngines.add(orderCounter, lowPowerEngine);
                break;
            case "MPE":
                MediumPowerEngine mediumPowerEngine = new MediumPowerEngine();
                createdEngines.add(orderCounter, mediumPowerEngine);
                break;
            case "HPE":
                HighPowerEngine highPowerEngine = new HighPowerEngine();
                createdEngines.add(orderCounter, highPowerEngine);
                break;
            case "HPDE":
                HighPowerDieselEngine highPowerDieselEngine = new HighPowerDieselEngine();
                createdEngines.add(orderCounter, highPowerDieselEngine);
                break;
        }

    }

    public void changeTransmission(String transmissionType) {
        switch (transmissionType) {
            case "SMT":
                StandartTransmission standartTransmission = new StandartTransmission();
                createdTransmissions.add(orderCounter, standartTransmission);
                break;
            case "AT":
                AutomaticTransmission automaticTransmission = new AutomaticTransmission();
                createdTransmissions.add(orderCounter, automaticTransmission);
                break;
            case "SAT":
                SemiAutomaticTransmission semiAutomaticTransmission = new SemiAutomaticTransmission();
                createdTransmissions.add(orderCounter, semiAutomaticTransmission);
                break;
            case "HDMT":
                HeavyDutyTransmission heavyDutyTransmission = new HeavyDutyTransmission();
                createdTransmissions.add(orderCounter, heavyDutyTransmission);
                break;

        }


    }

    public void changeBody(String bodyType, String carColour) {
        switch (bodyType) {
            case "S":
                SedanBody sedanBody = new SedanBody(carColour);
                createdBodys.add(orderCounter, sedanBody);
                break;
            case "C":
                CoupeBody coupeBody = new CoupeBody(carColour);
                createdBodys.add(orderCounter, coupeBody);
                break;
            case "SUV":
                SUVBody suvBody = new SUVBody(carColour);
                createdBodys.add(orderCounter, suvBody);
                break;
        }
    }

    public void changeSuspension(String suspensionType) {
        switch (suspensionType) {
            case "STDS":
                StandartSuspension standartSuspension = new StandartSuspension();
                createdSuspensions.add(orderCounter, standartSuspension);
                break;
            case "CTS":
                ComphortSuspension comphortSuspension = new ComphortSuspension();
                createdSuspensions.add(orderCounter, comphortSuspension);
                break;
            case "STS":
                SportSuspension sportSuspension = new SportSuspension();
                createdSuspensions.add(orderCounter, sportSuspension);
                break;
            case "ORS":
                OffRoadSuspension offRoadSuspension = new OffRoadSuspension();
                createdSuspensions.add(orderCounter, offRoadSuspension);
                break;
        }

    }

    public void changeInterior(String interiorType) {

        switch (interiorType) {
            case "STDI":
                StandartInterior standartInterior = new StandartInterior();
                createdInteriors.add(orderCounter, standartInterior);
                break;
            case "STI":
                SportInterior sportInterior = new SportInterior();
                createdInteriors.add(orderCounter, sportInterior);
                break;
            case "WRI":
                WearResistantInterior wearResistantInterior = new WearResistantInterior();
                createdInteriors.add(orderCounter, wearResistantInterior);
                break;
        }

    }

    @Override
    public String toString() {
        return "Your order number: " + orderNumber;
    }

}
