package com.mainhandler;

import com.carcreatehandlers.DetailCarCreateHandler;
import com.carcreatehandlers.FastCarCreateHandler;
import com.infomodule.InfoModule;

import java.io.IOException;
import java.util.Scanner;

import static com.infomodule.InfoHandler.*;

public class MainHandler {

    private static String comandReader;

    public static void runTitle() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        System.out.printf(String.format("%42s\n","The car checkout program"));
        getMenuItemSeparator();
        System.out.printf("\n\n");
        runHandler();
    }

    public static void runHandler() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        getMenuItemSeparator();
        setTextFormater("To order a car, insert", "(ODR)");
        setTextFormater("To view statistics on cars produced, insert", "(STAT)");
        setTextFormater("To exit the programm, insert", "(EXIT)");
        getMenuItemSeparator();
        comandReader = scanner.nextLine().toUpperCase();
        if (comandReader.equals("ODR")) {
            selectCreationMethod();
        } else if (comandReader.equals("STAT")) {
            InfoModule.runInfoModule();
        } else if (comandReader.equals("EXIT")) {
            System.out.println("Programm finished");
            scanner.close();
            return;
        } else {
            setTextFormater("Incorrect input, repeat input", "");
            runHandler();
        }

    }

    public static void selectCreationMethod() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        getMenuItemSeparator();
        setTextFormater("There are 2 options for creating a car:", "");
        getTextSeparator();
        setTextFormater("1.The choice of the standard options", "(STD)");
        setTextFormater("2.Individual selection of the installed nodes", "(IND)");
        setTextFormater("For return to menu, insert", "(RET)");
        setTextFormater("Select a creation method", "");
        getMenuItemSeparator();
        comandReader = scanner.nextLine().toUpperCase();
        if (comandReader.equals("STD")) {
            FastCarCreateHandler fastCarCreateHandler = new FastCarCreateHandler();
            fastCarCreateHandler.runCreator();
        } else if (comandReader.equals("IND")) {
            DetailCarCreateHandler detailCarCreateHandler = new DetailCarCreateHandler();
            detailCarCreateHandler.runCreator();
        } else if (comandReader.equals("RET")) {
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
