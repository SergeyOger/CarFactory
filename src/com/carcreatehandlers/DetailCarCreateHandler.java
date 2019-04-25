package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.interfaces.ICreateHandler;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import static com.infomodule.InfoHandler.*;
import static com.mainhandler.MainHandler.runHandler;

public class DetailCarCreateHandler implements ICreateHandler, Serializable {

    private static String engineType;
    private static String readEngineType;
    private static String suspensionType;
    private static String readSuspensionType;
    private static String interiorType;
    private static String readInteriorType;
    private static String bodyType;
    private static String readBodyType;
    private static String transmissionType;
    private static String readTransmissionType;
    private static int individualCarProjectCounter; // counter index in oterCounters 2
    private String directionOfTheProgram;
    private String carColour;


    public DetailCarCreateHandler() {
        individualCarProjectCounter = readCounterForInfoModule(5, 2);
        individualCarProjectCounter++;          //Add file for saving this counter and void for reading it from file
    }

    Scanner scanner = new Scanner(System.in);

    DetailCarCreator detailCarCreator = new DetailCarCreator();

    public static int getIndividualCarProjectCounter() {
        return individualCarProjectCounter;
    }

    public void engineTypeReader() {
        getMenuItemSeparator();
        setTextFormater("Select engine type :", "");
        getTextSeparator();
        setTextFormater(EnginesE.LPE.getName(), EnginesE.LPE.getShortName());
        setTextFormater(EnginesE.MPE.getName(), EnginesE.MPE.getShortName());
        setTextFormater(EnginesE.HPE.getName(), EnginesE.HPE.getShortName());
        setTextFormater(EnginesE.HPDE.getName(), EnginesE.HPDE.getShortName());
        getMenuItemSeparator();

        readEngineType = scanner.nextLine().toUpperCase().trim();

        if (readEngineType.equals(EnginesE.LPE.getShortName())
                || readEngineType.equals(EnginesE.MPE.getShortName())
                    || readEngineType.equals(EnginesE.HPE.getShortName())
                        || readEngineType.equals(EnginesE.HPDE.getShortName())) {
            engineType = readEngineType;
            detailCarCreator.changeEngine(engineType);
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            engineTypeReader();
        }
    }

    public void transmissionTypeReader() {
        getMenuItemSeparator();
        setTextFormater("Select transmission type :", "");
        getTextSeparator();
        setTextFormater(TransmissionsE.SMT.getName(), TransmissionsE.SMT.getShortName());
        setTextFormater(TransmissionsE.AT.getName(), TransmissionsE.AT.getShortName());
        setTextFormater(TransmissionsE.SAT.getName(), TransmissionsE.SAT.getShortName());
        setTextFormater(TransmissionsE.HDMT.getName(), TransmissionsE.HDMT.getShortName());
        getMenuItemSeparator();

        readTransmissionType = scanner.nextLine().toUpperCase().trim();

        if (readTransmissionType.equals(TransmissionsE.SMT.getShortName())
                || readTransmissionType.equals(TransmissionsE.SAT.getShortName())
                    || readTransmissionType.equals(TransmissionsE.AT.getShortName())
                        || readTransmissionType.equals(TransmissionsE.HDMT.getShortName())) {
            transmissionType = readTransmissionType;
            detailCarCreator.changeTransmission(transmissionType);
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            transmissionTypeReader();
        }
    }

    public void bodyTypeReader() {
        getMenuItemSeparator();
        setTextFormater("Select body type :","");
        getTextSeparator();
        setTextFormater(BodiesE.S.getName(), BodiesE.S.getShortName());
        setTextFormater(BodiesE.C.getName(), BodiesE.C.getShortName());
        setTextFormater(BodiesE.SUV.getName(), BodiesE.SUV.getShortName());
        getMenuItemSeparator();
        readBodyType = scanner.nextLine().toUpperCase().trim();
        if (readBodyType.equals(BodiesE.S.getShortName())
                || readBodyType.equals(BodiesE.C.getShortName())
                    || readBodyType.equals(BodiesE.SUV.getShortName())) {
            bodyType = readBodyType;
            System.out.println("Insert car colour");
            carColour = scanner.nextLine().toUpperCase().trim();
            detailCarCreator.changeBody(bodyType, carColour);
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            bodyTypeReader();
        }

    }

    public void suspensionTypeReader() {

        getMenuItemSeparator();
        setTextFormater("Select suspension type :","");
        getTextSeparator();
        setTextFormater(SuspensionsE.STDS.getName(),SuspensionsE.STDS.getShortName());
        setTextFormater(SuspensionsE.CTS.getName(),SuspensionsE.CTS.getShortName());
        setTextFormater(SuspensionsE.STS.getName(),SuspensionsE.STS.getShortName());
        setTextFormater(SuspensionsE.ORS.getName(),SuspensionsE.ORS.getShortName());
        getMenuItemSeparator();

        readSuspensionType = scanner.nextLine().toUpperCase().trim();

        if (readSuspensionType.equals(SuspensionsE.STDS.getShortName())
                || readSuspensionType.equals(SuspensionsE.CTS.getShortName())
                    || readSuspensionType.equals(SuspensionsE.STS.getShortName())
                        || readSuspensionType.equals(SuspensionsE.ORS.getShortName())) {
            suspensionType = readSuspensionType;
            detailCarCreator.changeSuspension(suspensionType);
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            suspensionTypeReader();
        }
    }

    public void interiorTypeReader() {
        getMenuItemSeparator();
        setTextFormater("Select interior type :","");
        getTextSeparator();
        setTextFormater(InteriorsE.STDI.getName(), InteriorsE.STDI.getShortName());
        setTextFormater(InteriorsE.STI.getName(), InteriorsE.STI.getShortName());
        setTextFormater(InteriorsE.WRI.getName(), InteriorsE.WRI.getShortName());
        getMenuItemSeparator();

        readInteriorType = scanner.nextLine().toUpperCase().trim();

        if (readInteriorType.equals(InteriorsE.STDI.getShortName())
                || readInteriorType.equals(InteriorsE.STI.getShortName())
                        || readInteriorType.equals(InteriorsE.WRI.getShortName())) {
            interiorType = readInteriorType;
            detailCarCreator.changeInterior(interiorType);
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            interiorTypeReader();
        }
    }

    @Override
    public void runCreator() throws IOException, ClassNotFoundException {
        engineTypeReader();
        bodyTypeReader();
        transmissionTypeReader();
        suspensionTypeReader();
        interiorTypeReader();
        changeTheDirectionOfTheProgram();
    }

    @Override
    public void getInfoAboutCreatedCar() {
        detailCarCreator.seeCarDetail();
    }

    @Override
    public void changeTheDirectionOfTheProgram() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        setTextFormater("Get info about car :", "(INFO)");
        setTextFormater("For creating new car insert :","(NEW)");
        setTextFormater("For save your order and return to menu insert :", "(SAVE)");
        getMenuItemSeparator();
        directionOfTheProgram = scanner.nextLine().toUpperCase().trim();
        if (directionOfTheProgram.equals("INFO")) {
            getInfoAboutCreatedCar();
            changeTheDirectionOfTheProgram();
        } else if (directionOfTheProgram.equals("NEW")) {
            runCreator();
        } else if (directionOfTheProgram.equals("SAVE")) {
            saveCreatedCar();
            runHandler(); // Return to main menu
        }
    }

    @Override
    public void saveCreatedCar() {

        detailCarCreator.addCountersToList(2, individualCarProjectCounter);
        saveCreationObjectToFile(detailCarCreator.counters, COUNTERS);
        saveCreationObjectToFile(detailCarCreator.createdEngines, ENGINES);
        saveCreationObjectToFile(detailCarCreator.createdTransmissions, TRANSMISSIONS);
        saveCreationObjectToFile(detailCarCreator.createdBodys, BODIES);
        saveCreationObjectToFile(detailCarCreator.createdSuspensions, SUSPENSIONS);
        saveCreationObjectToFile(detailCarCreator.createdInteriors, INTERIORS);


    }
}
