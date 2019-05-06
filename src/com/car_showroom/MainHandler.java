package com.car_showroom;

import java.io.IOException;
import java.util.Scanner;

import static com.car_showroom.TextFormatter.getTextSeparator;
import static com.car_showroom.TextFormatter.getMenuItemSeparator;
import static com.car_showroom.TextFormatter.setMenuTextFormatter;

public abstract class MainHandler {

    private static String commandReader;

    public static void runTitle() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        System.out.printf(String.format("%42s\n", "The car checkout program"));
        getMenuItemSeparator();
        System.out.printf("\n\n");
        runHandler();
    }

    public static void runHandler() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        getMenuItemSeparator();
        setMenuTextFormatter("To order a car, insert", "(ODR)");
        setMenuTextFormatter("To view statistics on cars produced, insert", "(STAT)");
        setMenuTextFormatter("To exit the programm, insert", "(EXIT)");
        getMenuItemSeparator();
        commandReader = scanner.nextLine().toUpperCase();
        if (commandReader.equals("ODR")) {
            selectCreationMethod();
        } else if (commandReader.equals("STAT")) {


        } else if (commandReader.equals("EXIT")) {
            System.out.println("Program finished");
            scanner.close();
            return;
        } else {
            setMenuTextFormatter("Incorrect input, repeat input", "");
            runHandler();
        }

    }

    public static void selectCreationMethod() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        getMenuItemSeparator();
        setMenuTextFormatter("There are 2 options for creating a car:", "");
        getTextSeparator();
        setMenuTextFormatter("1.The choice of the standard options", "(STD)");
        setMenuTextFormatter("2.Individual selection of the installed nodes", "(IND)");
        setMenuTextFormatter("For return to menu, insert", "(RET)");
        setMenuTextFormatter("Select a creation method", "");
        getMenuItemSeparator();
        commandReader = scanner.nextLine().toUpperCase();
        if (commandReader.equals("STD")) {


        } else if (commandReader.equals("IND")) {
            System.out.println("Insert order name");
            commandReader = scanner.nextLine();
            IndividualOrder individualOrder = new IndividualOrder(commandReader);
            individualOrder.createOrder();
        } else if (commandReader.equals("RET")) {
            returnToMenu();
        } else {
            System.out.println("Incorrect input, repeat input");
            selectCreationMethod();
        }
    }

    public static void returnToMenu() throws IOException, ClassNotFoundException {
        runHandler();
    }

}
