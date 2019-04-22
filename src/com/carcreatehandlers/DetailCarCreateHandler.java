package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.infomodule.InfoHandler;
import com.infomodule.InfoModule;
import com.interfaces.ICreateHandler;
import com.mainhandler.MainHandler;

import java.io.*;
import java.util.Scanner;

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
    private static int individualCarProjectCounter;
    private String directionOfTheProgram;
    private String carColour;


    public DetailCarCreateHandler() {
        individualCarProjectCounter++;          //Add file for saving this counter and void for reading it from file
    }

    Scanner scanner = new Scanner(System.in);

    DetailCarCreator detailCarCreator = new DetailCarCreator();

    public void engineTypeReader() {
        System.out.printf("Select engine type :\n1.Low power engine (LPE)\n2.Medium puwer engine (MPE)\n" +
                "3.High power engine (HPE)\n4.High power diesel engine (HPDE)\n");
        readEngineType = scanner.nextLine().toUpperCase().trim();
        if (readEngineType.equals("LPE") || readEngineType.equals("MPE")
                || readEngineType.equals("HPE") || readEngineType.equals("HPDE")) {
            engineType = readEngineType;
            detailCarCreator.changeEngine(engineType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            engineTypeReader();
        }
    }

    public void transmissionTypeReader() {
        System.out.printf("\nSelect transmission type:\n1.Automatic transmission (AT)\n" +
                "2.Semi-avtomatic transmission(SAT)\n3.Heavy duty manual transmission (HDMT)\n" +
                "4.Standart manual transmission (SMT)\n");
        readTransmissionType = scanner.nextLine().toUpperCase().trim();
        if (readTransmissionType.equals("AT") || readTransmissionType.equals("SAT") || readTransmissionType.equals("HDMT")
                || readTransmissionType.equals("SMT")) {
            transmissionType = readTransmissionType;
            detailCarCreator.changeTransmission(transmissionType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            transmissionTypeReader();
        }
    }

    public void bodyTypeReader() {
        System.out.printf("\nSelect body type:\n1.Coupe (C)\n2.Sedan  (S)\n3.SUV  (SUV)\n");
        readBodyType = scanner.nextLine().toUpperCase().trim();
        if (readBodyType.equals("C") || readBodyType.equals("S") || readBodyType.equals("SUV")) {
            bodyType = readBodyType;
            System.out.println("Insert car colour");
            carColour = scanner.nextLine().toUpperCase().trim();
            detailCarCreator.changeBody(bodyType,carColour);
        } else {
            System.out.println("Wrong input,please repeat the input");
            bodyTypeReader();
        }

    }

    public void suspensionTypeReader() {
        System.out.printf("Select suspension type:\n1.Standart suspension (STDS)\n2.Comphort suspensio (CTS)\n" +
                "3.Sport suspension (STS)\n4.Off-road suspension (ORS)\n");
        readSuspensionType = scanner.nextLine().toUpperCase().trim();
        if (readSuspensionType.equals("STDS") || readSuspensionType.equals("CTS") || readSuspensionType.equals("STS")
                || readSuspensionType.equals("ORS")) {
            suspensionType = readSuspensionType;
            detailCarCreator.changeSuspension(suspensionType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            suspensionTypeReader();
        }
    }

    public void interiorTypeReader() {
        System.out.printf("Select interior type:\n1.Standart interior (STDI)\n2.Sport interior (STI)\n" +
                "3.Wear resistant interior (WRI)\n");
        readInteriorType = scanner.nextLine().toUpperCase().trim();
        if (readInteriorType.equals("STDI") || readInteriorType.equals("STI") || readInteriorType.equals("WRI")) {
            interiorType = readInteriorType;
            detailCarCreator.changeInterior(interiorType);

        } else {
            System.out.println("Wrong input,please repeat the input");
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
        System.out.printf("\nGet info about car (INFO)\nFor creating new car insert (NEW)" +
                "\nFor save your car order and return to menu insert (SAVE)\n");
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
        InfoHandler.writeCarCounter(detailCarCreator.getAllCreatedCarCounter(),InfoModule.CAR_COUNTER);
        InfoHandler.writeCarCounter(detailCarCreator.getOrderCounter(),InfoModule.ORDER_COUNTER);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdEngines, InfoModule.ENGINES);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdTransmissions, InfoModule.TRANSMISSIONS);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdBodys, InfoModule.BODIES);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdSuspensions, InfoModule.SUSPENSIONS);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdInteriors, InfoModule.INTERIORS);
    }
}
