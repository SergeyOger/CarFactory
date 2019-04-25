package com.infomodule;

import com.mainhandler.MainHandler;

import java.io.IOException;
import java.util.Scanner;

import static com.infomodule.InfoHandler.*;

public class InfoModule {

    private static String comandReader;

    public static void runInfoModule() throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        getMenuItemSeparator();
        setTextFormater("Production statistics: ", "");
        getTextSeparator();
        setTextFormater("1.Number of cars created by individual order", "(IODR)");
        setTextFormater("2.Number of cars created by standart order", "(SODR)");
        setTextFormater("3.Number of all created cars ", "(AC)");
        setTextFormater("4.Number and type of created engines", "(CE)");
        setTextFormater("5.Number and type of created transmissions", "(CT)");
        setTextFormater("6.Number and type of created bodys", "(CB)");
        setTextFormater("7.Number and type of created suspensions", "(CS)");
        setTextFormater("8.Number and type of created interiors", "(CI)");
        setTextFormater("For close statistics insert", "(CLOSE)");
        getMenuItemSeparator();

        comandReader = scanner.nextLine().toUpperCase().trim();

        switch (comandReader) {
            case "IODR":
                getIndividualProjectCounter();
                break;
            case "SODR":
                getStandartProjectCounter();
                break;
            case "AC":
                getAllCreatedCarsCounter();
                break;
            case "CE":
                getEngineStatistics();
                break;
            case "CB":
                getBodyStatistics();
                break;
            case "CS":
                getSuspensionStatistics();
                break;
            case "CI":
                getInteriorStatistics();
                break;
            case "CT":
                getTransmissionStatistics();
                break;
            case "CLOSE":
                MainHandler.runHandler();
                break;
            default:
                System.out.println(InfoMassage.WRONG_INPUT.getMassage());


        }
        handler();
    }

    private static void handler() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        System.out.println("See next paragraph (NEXT) or return to menu (RET)");
        getMenuItemSeparator();

        Scanner scanner = new Scanner(System.in);

        comandReader = scanner.nextLine().toUpperCase().trim();

        if (comandReader.equals("NEXT")) {
            runInfoModule();
        } else if (comandReader.equals("RET")) {
            runInfoModule();
        } else {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            handler();
        }

    }

    private static void getEngineStatistics() {
        getMenuItemSeparator();
        setTextFormater("Prodused low power engines :",
                InfoHandler.readCounterForInfoModule(0, 0));
        getTextSeparator();

        setTextFormater("Prodused medium power engines :",
                InfoHandler.readCounterForInfoModule(0, 1));
        getTextSeparator();

        setTextFormater("Prodused high power engines :",
                InfoHandler.readCounterForInfoModule(0, 2));
        getTextSeparator();

        setTextFormater("Prodused high power diesel engines :",
                InfoHandler.readCounterForInfoModule(0, 3));
        getMenuItemSeparator();
    }

    private static void getBodyStatistics() {
        getMenuItemSeparator();
        setTextFormater("Prodused sedan bodies :",
                InfoHandler.readCounterForInfoModule(2, 0));
        getTextSeparator();

        setTextFormater("Prodused coupe bodies :",
                InfoHandler.readCounterForInfoModule(2, 1));
        getTextSeparator();

        setTextFormater("Prodused SUV bodies :",
                InfoHandler.readCounterForInfoModule(2, 2));
        getMenuItemSeparator();
    }

    private static void getTransmissionStatistics() {
        getMenuItemSeparator();
        setTextFormater("Prodused standart transmissions :",
                InfoHandler.readCounterForInfoModule(1, 0));
        getTextSeparator();

        setTextFormater("Prodused automatic transmissions :",
                InfoHandler.readCounterForInfoModule(1, 1));
        getTextSeparator();

        setTextFormater("Prodused semi-automatic transmissions :",
                InfoHandler.readCounterForInfoModule(1, 2));
        getTextSeparator();

        setTextFormater("Prodused heavy-duty transmissions :",
                InfoHandler.readCounterForInfoModule(1, 3));
        getMenuItemSeparator();
    }

    private static void getSuspensionStatistics() {
        getMenuItemSeparator();
        setTextFormater("Prodused standart suspensions :",
                InfoHandler.readCounterForInfoModule(3, 0));
        getTextSeparator();

        setTextFormater("Prodused comphort suspensions :",
                InfoHandler.readCounterForInfoModule(3, 1));
        getTextSeparator();

        setTextFormater("Prodused sport suspensions :",
                InfoHandler.readCounterForInfoModule(3, 2));
        getTextSeparator();

        setTextFormater("Prodused off-road suspensions :",
                InfoHandler.readCounterForInfoModule(3, 3));
        getMenuItemSeparator();
    }

    private static void getInteriorStatistics() {
        getMenuItemSeparator();
        setTextFormater("Prodused standart interiors :",
                InfoHandler.readCounterForInfoModule(4, 0));
        getTextSeparator();

        setTextFormater("Prodused sport interiors :",
                InfoHandler.readCounterForInfoModule(4, 1));
        getTextSeparator();

        setTextFormater("Prodused wear resistant interiors :",
                InfoHandler.readCounterForInfoModule(4, 2));
        getMenuItemSeparator();
    }

    private static void getIndividualProjectCounter() {
        getMenuItemSeparator();
        setTextFormater("Number of individual orders :",
                InfoHandler.readCounterForInfoModule(5, 2));
        getMenuItemSeparator();

    }

    private static void getStandartProjectCounter() {
        getMenuItemSeparator();
        setTextFormater("Number of standart orders :",
                InfoHandler.readCounterForInfoModule(5, 3));
        getMenuItemSeparator();
    }

    private static void getAllCreatedCarsCounter() {
        getMenuItemSeparator();
        setTextFormater("Number of all orders :",
                InfoHandler.readCounterForInfoModule(5, 0));
        getMenuItemSeparator();
    }

}
