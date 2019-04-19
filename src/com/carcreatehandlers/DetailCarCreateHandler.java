package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.interfaces.ICreateHandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailCarCreateHandler implements ICreateHandler {

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

    public DetailCarCreateHandler() {
        individualCarProjectCounter++;
    }

    Scanner scanner = new Scanner(System.in);

    List<Object> orderedCar = new ArrayList<>();

    DetailCarCreator detailCarCreator = new DetailCarCreator();


    // Create engine
    public void engineTypeReader() {
        System.out.printf("Select engine type :\n1.Low power engine (LPE)\n2.Medium puwer engine (MPE)\n" +
                "3.High power engine (HPE)\n4.High power diesel engine (HPDE)\n");
        readEngineType = scanner.nextLine().toUpperCase();
        if (readEngineType.equals("LPE") || readEngineType.equals("MPE")
                || readEngineType.equals("HPE") || readEngineType.equals("HPDE")) {
            engineType = readEngineType;
            //orderedCar.add(0,detailCarCreator.changeEngine(engineType));
            detailCarCreator.changeEngine(engineType);

        } else {
            System.out.println("Wrong input,please repeat the input");
            engineTypeReader();
        }
    }

    //Create transmission
    public void transmissionTypeReader() {
        System.out.printf("Select transmission type:\n1.Automatic transmission (AT)\n" +
                "2.Semi-avtomatic transmission(SAT)\n3.Heavy duty manual transmission (HDMT)\n" +
                "4.Standart manual transmission (SMT)\n");
        readTransmissionType = scanner.nextLine().toUpperCase();
        if (readTransmissionType.equals("AT") || readTransmissionType.equals("SAT") || readTransmissionType.equals("HDMT")
                || readTransmissionType.equals("SMT")) {
            transmissionType = readTransmissionType;
            detailCarCreator.changeTransmission(transmissionType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            transmissionTypeReader();
        }
    }

    //Create body

    public void bodyTypeReader() {
        System.out.printf("Select body type:\n1.Coupe (C)\n2.Sedan(S)\n3.SUV(SUV)\n");
        readBodyType = scanner.nextLine().toUpperCase();
        if (readBodyType.equals("C") || readBodyType.equals("S") || readBodyType.equals("SUV")) {
            bodyType = readBodyType;
            detailCarCreator.changeBody(bodyType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            bodyTypeReader();
        }

    }
    //Create suspension

    public void suspensionTypeReader() {
        System.out.printf("Select suspension type:\n1.Standart suspension (STDS)\n2.Comphort suspensio (CTS)\n" +
                "3.Sport suspension (STS)\n4.Off-road suspension (ORS)\n");
        readSuspensionType = scanner.nextLine().toUpperCase();
        if (readSuspensionType.equals("STDS") || readSuspensionType.equals("CTS") || readSuspensionType.equals("STS")
                || readSuspensionType.equals("ORS")) {
            suspensionType = readSuspensionType;
            detailCarCreator.changeSuspension(suspensionType);
        } else {
            System.out.println("Wrong input,please repeat the input");
            suspensionTypeReader();
        }
    }
    //Create interior

    public void interiorTypeReader() {
        System.out.printf("Select interior type:\n1.Standart interior (STDI)\n2.Sport interior (STI)\n" +
                "3.Wear resistant interior (WRI)\n");
        readInteriorType = scanner.nextLine().toUpperCase();
        if (readInteriorType.equals("STDI") || readInteriorType.equals("STI") || readInteriorType.equals("WRI")) {
            interiorType = readInteriorType;
            detailCarCreator.changeInterior(interiorType);

        } else {
            System.out.println("Wrong input,please repeat the input");
            interiorTypeReader();
        }
    }

    @Override
    public void runCreator() throws IOException {
        engineTypeReader();
        bodyTypeReader();
        transmissionTypeReader();
        suspensionTypeReader();
        interiorTypeReader();
        saveCreatedCarToCollection();
        writeInfoToFile();
    }

    @Override
    public void saveCreatedCarToCollection() {
        orderedCar.add((individualCarProjectCounter - 1), detailCarCreator);
    }

    @Override
    public void getInfoAboutCarDetails(int index) {

        detailCarCreator.getDetailsType(index);
    }

    @Override
    public void getInfoAboutCreatedCar() {
        System.out.println(orderedCar.get((individualCarProjectCounter - 1)).toString());
    }

    public static int getCreatedCarCaunter() {
        return individualCarProjectCounter;
    }

    public void writeInfoToFile() throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DetailsCreatedCars.bin"));
            out.writeObject(orderedCar);
            out.write(individualCarProjectCounter);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("Something went wrong");
            io.printStackTrace();
        }
        System.out.printf("\nCar saved\n");
    }

}
