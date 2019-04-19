package com.mainhandler;

import com.carcreatehandlers.DetailCarCreateHandler;
import com.carcreatehandlers.FastCarCreateHandler;
import com.infomodule.InfoModule;

import java.io.IOException;
import java.util.Scanner;

public class MainHandler {

    Scanner scanner = new Scanner(System.in);

    private String comandReader;

    public void runTitle() throws IOException {
        System.out.printf("The car checkout program\n\n");
        runHandler();
    }

    public void runHandler() throws IOException {
        System.out.println("To order a car, insert (ODR)");
        System.out.println("To view statistics on cars produced, insert(STAT)");
        System.out.println("To exit the programm, insert (EXIT)");
        comandReader = scanner.nextLine().toUpperCase();
        if (comandReader.equals("ODR")) {
            selectCreationMethod();
        } else if (comandReader.equals("STAT")) {
            runInfoModule();
        } else if (comandReader.equals("EXIT")) {
            System.out.println("Programm finished");
            scanner.close();
            return;
        } else {
            System.out.println("Incorrect input, repeat input");
            runHandler();
        }

    }

    public void selectCreationMethod() throws IOException {
        System.out.printf("There are 2 options for creating a car:\n " +
                "1.The choice of the standard options (STD)\n" +
                "2.Individual selection of the installed nodes (IND)\n" +
                "For return to menu, insert (RETURN)\n");
        System.out.println("Select a creation method");
        comandReader = scanner.nextLine().toUpperCase();
        if (comandReader.equals("STD")) {
            FastCarCreateHandler fastCarCreateHandler = new FastCarCreateHandler();
            fastCarCreateHandler.runCreator();
        } else if (comandReader.equals("IND")) {
            DetailCarCreateHandler detailCarCreateHandler = new DetailCarCreateHandler();
            detailCarCreateHandler.runCreator();
        } else if (comandReader.equals("RETURN")) {
            returnToMenu();
        } else {
            System.out.println("Incorrect input, repeat input");
            selectCreationMethod();
        }
    }

    public void runInfoModule() throws IOException {
        System.out.printf("Production statistics: \n\n"+
                "1.Number of cars created by individual order (IO)\n" +
                "2.Number of cars created by standart order (SO)\n" +
                "3.Number of all created cars (AC)\n" +
                "4.Number and type of created engines (CE)\n" +
                "5.Number and type of created bodys (CB)\n" +
                "6.Number and type of created suspensions (CS)\n" +
                "7.Number and type of created interiors (CI)\n" +
                "8.Read  object from file (RF)\n");
        System.out.println("For close statistics insert (CLOSE)");

        comandReader = scanner.nextLine().toUpperCase();

        switch (comandReader) {
            case "IO":
                InfoModule.getDetailCarCounter();
                break;
            case "SO":
                InfoModule.getFastCarCounter();
                break;
            case "AC":
                InfoModule.getAllCarCounter();
                break;
            case "CE":
                InfoModule.getEngineStatistics();
                break;
            case "CB":
                InfoModule.getBodyStatistics();
                break;
            case "CS":
                InfoModule.getSuspensionStatistics();
                break;
            case "CI":
                InfoModule.getInteriorStatistics();
                break;
            case "RF":
                InfoModule.getReadedFile();
                break;
            case "CLOSE":
                runHandler();
                break;
            default:
                System.out.println("Incorrect input, repeat input");


        }
        changeTheDirectionOfTheProgram();
    }

    public void changeTheDirectionOfTheProgram() throws IOException {
        System.out.println("Continue viewing (CON) or return to the menu (RET)");
        comandReader = scanner.nextLine().toUpperCase();
        if (comandReader.equals("CON")) {
            runInfoModule();
        } else if (comandReader.equals("RET")) {
            runHandler();
        } else {
            System.out.println("Incorrect input, repeat input");
            changeTheDirectionOfTheProgram();
        }
    }

    public void returnToMenu() throws IOException {
        runHandler();
    }
}
