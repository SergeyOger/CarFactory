package com.createhandler;

import com.carcreator.DetailCarCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FastCarCreateHandler {
    //Created car counter
    private static String carType;


    Scanner scanner = new Scanner(System.in);
    DetailCarCreator detailCarCreator = new DetailCarCreator();
    List<Object> oderedStandartCars = new ArrayList<>();

    public void createCar() {

        System.out.printf("Select typical car models:\n1.City car (CITY)\n2.Sport car(SPORT)\n3.Off-road car (SUV)");
        carType = scanner.nextLine().toUpperCase();

        if (carType.equals("CITI")) {
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
            createCar();
        }
    }
    // Get info for car
    public void getCarDetailsInfo(int index) {
        System.out.println(detailCarCreator);
    }
    // For repeated run console insert
    public void insertGandler() {

    }
}
