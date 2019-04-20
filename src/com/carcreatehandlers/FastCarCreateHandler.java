package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.interfaces.ICreateHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FastCarCreateHandler implements ICreateHandler, Serializable {

    private static String carType;
    private static int fastCarsCounter;

    public FastCarCreateHandler() {
        fastCarsCounter++;
    }


    Scanner scanner = new Scanner(System.in);

    DetailCarCreator detailCarCreator = new DetailCarCreator();

    List<DetailCarCreator> orderedStandartCars = new ArrayList<>();

    public void writeInfoToFile() throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FastCreatedCars.bin"));
            out.writeObject(orderedStandartCars);
            out.write(fastCarsCounter);
        } catch (FileNotFoundException e) {
            System.out.printf("\nFile not found\n");
        } catch (IOException io) {
            System.out.printf("\nSomething went wrong\n");
            io.printStackTrace();
            runCreator();
        }
        System.out.printf("\nCar saved\n");

    }

    @Override
    public void runCreator() throws IOException {
        System.out.printf("\nSelect typical car models:\n1.City car (CITY)\n2.Sport car(SPORT)\n3.Off-road car (SUV)");
        carType = scanner.nextLine().toUpperCase();

        if (carType.equals("CITY")) {
            detailCarCreator.changeEngine("LPE");
            detailCarCreator.changeTransmission("SMT");
            detailCarCreator.changeBody("S");
            detailCarCreator.changeSuspension("STDS");
            detailCarCreator.changeInterior("STDI");
        } else if (carType.equals("SPORT")) {
            detailCarCreator.changeEngine("HPE");
            detailCarCreator.changeTransmission("SAT");
            detailCarCreator.changeBody("C");
            detailCarCreator.changeSuspension("STS");
            detailCarCreator.changeInterior("STI");
        } else if (carType.equals("SUV")) {
            detailCarCreator.changeEngine("HPDE");
            detailCarCreator.changeTransmission("HDMT");
            detailCarCreator.changeBody("SUV");
            detailCarCreator.changeSuspension("ORS");
            detailCarCreator.changeInterior("WRI");
        } else {
            System.out.println("Wrong insert, please try again");
            runCreator();
        }
        saveCreatedCarToCollection();
        writeInfoToFile();
        getInfoAboutCreatedCar();
        returnToHandler();
    }

    @Override
    public void saveCreatedCarToCollection() {
        orderedStandartCars.add(fastCarsCounter - 1, detailCarCreator);
    }

    @Override
    public void getInfoAboutCarDetails(int index) {
        detailCarCreator.getDetailsType(index);
    }

    @Override
    public void getInfoAboutCreatedCar() {
        System.out.println(orderedStandartCars.get((fastCarsCounter - 1)).toString());
    }

    public static int getCreatedCarCaunter() {
        return fastCarsCounter;
    }

    public void returnToHandler() throws IOException {
        System.out.printf("For create new car insert (NEW)\nFor return to menu insert (RET)\n");
        String handler = scanner.nextLine();
        if (handler.equals("NEW")) {
            runCreator();
        } else if (handler.equals("RET")){
            return;
        }
    }

}
