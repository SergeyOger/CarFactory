// Reed before created car counter
// Create new car
// Save car or create new
// return to menu

package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.infomodule.InfoHandler;
import com.interfaces.ICreateHandler;

import java.io.IOException;
import java.util.Scanner;

import static com.infomodule.InfoHandler.*;
import static com.mainhandler.MainHandler.runHandler;

public class FastCarCreateHandler implements ICreateHandler {

    private String carType;
    private String carColour;
    private String directionOfTheProgram;
    private static int fastCarCreateHandlerCounter; // // counter index in oterCounters 3

    public FastCarCreateHandler() {
        fastCarCreateHandlerCounter = InfoHandler.readCounterForInfoModule(5,3);
        fastCarCreateHandlerCounter++;
    }

    Scanner scanner = new Scanner(System.in);

    DetailCarCreator detailCarCreator = new DetailCarCreator();

    public static int getFastCarCreateHandlerCounter() {
        return fastCarCreateHandlerCounter;
    }

    // Void for creating standart models cars
    @Override
    public void runCreator() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        setTextFormater("Change standart car model :", "");
        getTextSeparator();
        setTextFormater("1.City car :", "(CITY)");
        setTextFormater("2.Sport car :","(SPORT)");
        setTextFormater("3.Off-road car :", "(SUV)");
        getMenuItemSeparator();
        carType = scanner.nextLine().toUpperCase().trim();
        switch (carType) {
            case "CITY":
                System.out.println("Insert car colour");
                carColour = scanner.nextLine().toUpperCase().trim();
                createCityCar(carColour);
                break;
            case "SPORT":
                System.out.println("Insert car colour");
                carColour = scanner.nextLine().toUpperCase().trim();
                createSportCar(carColour);
                break;
            case "SUV":
                System.out.println("Insert car colour");
                carColour = scanner.nextLine().toUpperCase().trim();
                createSUV(carColour);
                break;
            default:
                System.out.println("Incorrect input, try again");
                runCreator();

        }
        changeTheDirectionOfTheProgram();
    }

    // Display detail info about created car
    @Override
    public void getInfoAboutCreatedCar() {
        detailCarCreator.seeCarDetail();
    }

    // Void for change direction of the program
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
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            changeTheDirectionOfTheProgram();
        }
    }

    // Void for saving created car to file
    @Override
    public void saveCreatedCar() {
        detailCarCreator.addCountersToList(3,fastCarCreateHandlerCounter);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.counters, InfoHandler.COUNTERS);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdEngines, InfoHandler.ENGINES);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdTransmissions, InfoHandler.TRANSMISSIONS);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdBodys, InfoHandler.BODIES);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdSuspensions, InfoHandler.SUSPENSIONS);
        InfoHandler.saveCreationObjectToFile(detailCarCreator.createdInteriors, InfoHandler.INTERIORS);
    }

    // Void for creating typical city car
    private void createCityCar(String carColour) {
        detailCarCreator.changeEngine("LPE");
        detailCarCreator.changeTransmission("SMT");
        detailCarCreator.changeBody("S", carColour);
        detailCarCreator.changeSuspension("STDS");
        detailCarCreator.changeInterior("STDI");
    }

    // Void for creating typical sport car
    private void createSportCar(String carColour) {
        detailCarCreator.changeEngine("HPE");
        detailCarCreator.changeTransmission("SAT");
        detailCarCreator.changeBody("C", carColour);
        detailCarCreator.changeSuspension("STS");
        detailCarCreator.changeInterior("STI");
    }

    // Void for creating typical SUV car
    private void createSUV(String carColour) {
        detailCarCreator.changeEngine("HPDE");
        detailCarCreator.changeTransmission("HDMT");
        detailCarCreator.changeBody("SUV", carColour);
        detailCarCreator.changeSuspension("ORS");
        detailCarCreator.changeInterior("WRI");
    }

}
