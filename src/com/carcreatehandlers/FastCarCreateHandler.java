// Reed before created car counter
// Create new car
// Save car or create new
// return to menu

package com.carcreatehandlers;

import com.detailcarcreator.DetailCarCreator;
import com.infomodule.InfoHandler;
import com.infomodule.InfoModule;
import com.interfaces.ICreateHandler;

import java.io.IOException;
import java.util.Scanner;

import static com.mainhandler.MainHandler.runHandler;

public class FastCarCreateHandler implements ICreateHandler {

    private String carType;
    private String carColour;
    private String directionOfTheProgram;

    Scanner scanner = new Scanner(System.in);

    DetailCarCreator detailCarCreator = new DetailCarCreator();

    @Override
    public void runCreator() throws IOException, ClassNotFoundException {
        System.out.println("Change standart car model:");
        System.out.printf("\n1.City car (CITY)\n2.Sport car (SPORT)\n3.Off-road car (SUV)\n");
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

    // Void for saving created car to file
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
