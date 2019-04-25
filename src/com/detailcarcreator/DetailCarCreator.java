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
import com.interiorcreator.Interior;
import com.interiorcreator.SportInterior;
import com.interiorcreator.StandartInterior;
import com.interiorcreator.WearResistantInterior;
import com.suspensioncreator.*;
import com.transmissioncreator.*;

import java.io.Serializable;
import java.util.ArrayList;

import static com.infomodule.InfoHandler.*;


public class DetailCarCreator implements Serializable {

    private int carCounter;         // counter index in otherCounters 0
    public String orderNumber;
    private int orderCounter;       // counter index in otherCounters 1
    public ArrayList<Engine> createdEngines;
    public ArrayList<Transmission> createdTransmissions;
    public ArrayList<Body> createdBodys;
    public ArrayList<Suspension> createdSuspensions;
    public ArrayList<Interior> createdInteriors;

    public ArrayList<ArrayList<Integer>> counters;
    public ArrayList<Integer> enginesCounter;                   // Index in counters 0
    public ArrayList<Integer> transmissionsCounter;             // Index in counters 1
    public ArrayList<Integer> bodiesCounterCounter;             // Index in counters 2
    public ArrayList<Integer> suspensionsCounter;               // Index in counters 3
    public ArrayList<Integer> interiorsCounter;                 // Index in counters 4
    public ArrayList<Integer> otherCounters;                    // Index in counters 5

    public DetailCarCreator() {
        carCounter = readCounterForInfoModule(5, 0);

        if (carCounter == 0) {
            carCounter++;
            orderCounter = 0;
            createNewArrays();

        } else {
            carCounter++;
            orderCounter = readCounterForInfoModule(5, 1);
            orderCounter++;
            readArraysFromFile();
        }
        orderNumber = String.valueOf(carCounter);

    }

    private void createNewArrays() {
        this.createdEngines = new ArrayList<>(40);
        objectArrayInit(createdEngines,4);

        this.createdTransmissions = new ArrayList<>(40);
        objectArrayInit(createdTransmissions,4);

        this.createdBodys = new ArrayList<>(40);
        objectArrayInit(createdBodys,3);

        this.createdSuspensions = new ArrayList<>(40);
        objectArrayInit(createdSuspensions,4);

        this.createdInteriors = new ArrayList<>(40);
        objectArrayInit(createdInteriors,3);

        this.counters = new ArrayList<ArrayList<Integer>>(6);
        objectArrayInit(counters,6);

        this.enginesCounter = new ArrayList<>(4);
        arrayInit(enginesCounter, 4);

        this.transmissionsCounter = new ArrayList<>(4);
        arrayInit(transmissionsCounter, 4);

        this.bodiesCounterCounter = new ArrayList<>(3);
        arrayInit(bodiesCounterCounter, 3);

        this.suspensionsCounter = new ArrayList<>(4);
        arrayInit(suspensionsCounter, 4);

        this.interiorsCounter = new ArrayList<>(3);
        arrayInit(interiorsCounter, 3);

        this.otherCounters = new ArrayList<>(4);
        arrayInit(otherCounters, 4);

    }

    private void readArraysFromFile() {
        createdEngines = readSavedObject(createdEngines, ENGINES);
        createdTransmissions = readSavedObject(createdTransmissions, TRANSMISSIONS);
        createdBodys = readSavedObject(createdBodys, BODIES);
        createdSuspensions = readSavedObject(createdSuspensions, SUSPENSIONS);
        createdInteriors = readSavedObject(createdInteriors, INTERIORS);

        counters = readSavedObject(counters, COUNTERS);
        enginesCounter = readArrayLIstFromArrayList(counters, 0, COUNTERS);
        transmissionsCounter = readArrayLIstFromArrayList(counters, 1, COUNTERS);
        bodiesCounterCounter = readArrayLIstFromArrayList(counters, 2, COUNTERS);
        suspensionsCounter = readArrayLIstFromArrayList(counters, 3, COUNTERS);
        interiorsCounter = readArrayLIstFromArrayList(counters, 4, COUNTERS);
        otherCounters = readArrayLIstFromArrayList(counters,5,COUNTERS);
    }

    public void addCountersToList(int index, int value) {
        otherCounters.set(0, carCounter);
        otherCounters.set(1, orderCounter);
        otherCounters.set(2, 0);
        otherCounters.set(3, 0);
        otherCounters.set(index, value);

        counters.set(0, enginesCounter);
        counters.set(1, transmissionsCounter);
        counters.set(2, bodiesCounterCounter);
        counters.set(3, suspensionsCounter);
        counters.set(4, interiorsCounter);
        counters.set(5, otherCounters);
    }

    public void seeCarDetail() {
        getSeparator();
        orderNumber = String.format("%07d", orderCounter + 1);
        System.out.println("Order number: " + orderNumber);
        getSeparator();
        createdEngines.get(orderCounter).getDetailDescription();
        getSeparator();
        createdTransmissions.get(orderCounter).getDetailDescription();
        getSeparator();
        createdBodys.get(orderCounter).getDetailDescription();
        getSeparator();
        createdSuspensions.get(orderCounter).getDetailDescription();
        getSeparator();
        createdInteriors.get(orderCounter).getDetailDescription();
        getSeparator();
    }

    // counter index 0
    public void changeEngine(String engineType) {
        switch (engineType) {
            case "LPE":
                LowPowerEngine.setCounter(readCounterForInfoModule(0, 0));
                LowPowerEngine lowPowerEngine = new LowPowerEngine(); // Inlet ArrayLIst index 0
                createdEngines.add(orderCounter, lowPowerEngine);
                enginesCounter.set(0, LowPowerEngine.getCounter());
                break;
            case "MPE":
                MediumPowerEngine.setCounter(readCounterForInfoModule(0, 1));
                MediumPowerEngine mediumPowerEngine = new MediumPowerEngine();// Inlet ArrayLIst index 1
                createdEngines.add(orderCounter, mediumPowerEngine);
                enginesCounter.set(1, MediumPowerEngine.getCounter());
                break;
            case "HPE":
                HighPowerEngine.setCounter(readCounterForInfoModule(0, 2));
                HighPowerEngine highPowerEngine = new HighPowerEngine();// Inlet ArrayLIst index 2
                createdEngines.add(orderCounter, highPowerEngine);
                enginesCounter.set(2, HighPowerEngine.getCounter());
                break;
            case "HPDE":
                HighPowerDieselEngine.setCounter(readCounterForInfoModule(0, 3));
                HighPowerDieselEngine highPowerDieselEngine = new HighPowerDieselEngine();// Inlet ArrayLIst index 3
                createdEngines.add(orderCounter, highPowerDieselEngine);
                enginesCounter.set(3, HighPowerDieselEngine.getCounter());
                break;
        }

    }

    // counter index 1
    public void changeTransmission(String transmissionType) {
        switch (transmissionType) {
            case "SMT":
                StandartTransmission.setCounter(readCounterForInfoModule(1, 0));
                StandartTransmission standartTransmission = new StandartTransmission();// Inlet ArrayLIst index 0
                createdTransmissions.add(orderCounter, standartTransmission);
                transmissionsCounter.set(0, StandartTransmission.getCounter());
                break;
            case "AT":
                AutomaticTransmission.setCounter(readCounterForInfoModule(1, 1));
                AutomaticTransmission automaticTransmission = new AutomaticTransmission();// Inlet ArrayLIst index 1
                createdTransmissions.add(orderCounter, automaticTransmission);
                transmissionsCounter.set(1, StandartTransmission.getCounter());
                break;
            case "SAT":
                SemiAutomaticTransmission.setCounter(readCounterForInfoModule(1, 2));
                SemiAutomaticTransmission semiAutomaticTransmission = new SemiAutomaticTransmission();// Inlet ArrayLIst index 2
                createdTransmissions.add(orderCounter, semiAutomaticTransmission);
                transmissionsCounter.set(2, SemiAutomaticTransmission.getCounter());
                break;
            case "HDMT":
                HeavyDutyTransmission.setCounter(readCounterForInfoModule(1, 3));
                HeavyDutyTransmission heavyDutyTransmission = new HeavyDutyTransmission();// Inlet ArrayLIst index 3
                createdTransmissions.add(orderCounter, heavyDutyTransmission);
                transmissionsCounter.set(3, HeavyDutyTransmission.getCounter());
                break;

        }


    }

    // counter index 2
    public void changeBody(String bodyType, String carColour) {
        switch (bodyType) {
            case "S":
                SedanBody.setCounter(readCounterForInfoModule(2, 0));
                SedanBody sedanBody = new SedanBody(carColour); //Inlet ArrayLIst index 0
                createdBodys.add(orderCounter, sedanBody);
                bodiesCounterCounter.set(0, SedanBody.getCounter());
                break;
            case "C":
                CoupeBody.setCounter(readCounterForInfoModule(2, 1));
                CoupeBody coupeBody = new CoupeBody(carColour); //Inlet ArrayLIst index 1
                createdBodys.add(orderCounter, coupeBody);
                bodiesCounterCounter.set(1, CoupeBody.getCounter());
                break;
            case "SUV":
                SUVBody.setCounter(readCounterForInfoModule(2, 2));
                SUVBody suvBody = new SUVBody(carColour); //Inlet ArrayLIst index 2
                createdBodys.add(orderCounter, suvBody);
                bodiesCounterCounter.set(2, SUVBody.getCounter());
                break;
        }
    }

    // counter index 3
    public void changeSuspension(String suspensionType) {
        switch (suspensionType) {
            case "STDS":
                StandartSuspension.setCounter(readCounterForInfoModule(3, 0));
                StandartSuspension standartSuspension = new StandartSuspension(); //Inlet ArrayLIst index 0
                createdSuspensions.add(orderCounter, standartSuspension);
                suspensionsCounter.set(0, StandartSuspension.getCounter());
                break;
            case "CTS":
                ComphortSuspension.setCounter(readCounterForInfoModule(3, 1));
                ComphortSuspension comphortSuspension = new ComphortSuspension(); //Inlet ArrayLIst index 1
                createdSuspensions.add(orderCounter, comphortSuspension);
                suspensionsCounter.set(1, ComphortSuspension.getCounter());
                break;
            case "STS":
                SportSuspension.setCounter(readCounterForInfoModule(3, 2));
                SportSuspension sportSuspension = new SportSuspension(); //Inlet ArrayLIst index 2
                createdSuspensions.add(orderCounter, sportSuspension);
                suspensionsCounter.set(2, SportSuspension.getCounter());
                break;
            case "ORS":
                OffRoadSuspension.setCounter(readCounterForInfoModule(3, 3));
                OffRoadSuspension offRoadSuspension = new OffRoadSuspension(); //Inlet ArrayLIst index 3
                createdSuspensions.add(orderCounter, offRoadSuspension);
                suspensionsCounter.set(3, OffRoadSuspension.getCounter());

                break;
        }

    }

    // counter index 4
    public void changeInterior(String interiorType) {

        switch (interiorType) {
            case "STDI":
                StandartInterior.setCounter(readCounterForInfoModule(4, 0));
                StandartInterior standartInterior = new StandartInterior();//Inlet ArrayLIst index 0
                createdInteriors.add(orderCounter, standartInterior);
                interiorsCounter.set(0, StandartInterior.getCounter());
                break;
            case "STI":
                SportInterior.setCounter(readCounterForInfoModule(4, 1));
                SportInterior sportInterior = new SportInterior();
                createdInteriors.add(orderCounter, sportInterior);
                interiorsCounter.set(1, SportInterior.getCounter());//Inlet ArrayLIst index 1
                break;
            case "WRI":
                WearResistantInterior.setCounter(readCounterForInfoModule(4, 2));
                WearResistantInterior wearResistantInterior = new WearResistantInterior();//Inlet ArrayLIst index 2
                createdInteriors.add(orderCounter, wearResistantInterior);
                interiorsCounter.set(2, WearResistantInterior.getCounter());
                break;
        }

    }

    @Override
    public String toString() {
        return "Your order number: " + carCounter;
    }

}
