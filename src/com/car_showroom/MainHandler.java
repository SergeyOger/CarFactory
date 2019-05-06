package com.car_showroom;

import com.car_factory.car_assembly_line.standart_cars.StandardCars;
import com.car_factory.factory_office.order_department.IndividualOrder;

import java.io.IOException;
import java.util.Scanner;

import static com.car_factory.assembled_cars.UniqueCarsStorage.checkTheOrderNameUniqueness;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.order_department.StandardOrder.getStandardCar;
import static com.car_showroom.MessageFormatting.InfoMassage.WRONG_INPUT;
import static com.car_showroom.TextFormatter.*;

public abstract class MainHandler {

    private static String commandReader;

    public static void runTitle() {
        getMenuItemSeparator();
        System.out.printf(String.format("%42s\n", "The car checkout program"));
        getMenuItemSeparator();
        System.out.printf("\n");
        runHandler();
    }

    public static void runHandler() {
        try (Scanner scanner = new Scanner(System.in)) {
            getMenuItemSeparator();
            setMenuTextFormatter("To order a car, insert", "(ODR)");
            setMenuTextFormatter("To view statistics on cars produced, insert", "(STAT)");
            setMenuTextFormatter("To exit the program, insert", "(EXIT)");
            getMenuItemSeparator();
            commandReader = scanner.nextLine().toUpperCase();
            if (commandReader.equals("ODR")) {
                selectCreationMethod();
            } else if (commandReader.equals("STAT")) {
                System.out.println("In developing ..... ");
                runHandler();
            } else if (commandReader.equals("EXIT")) {
                System.out.println("Program finished");
                scanner.close();
                return;
            } else {
                setMenuTextFormatter(WRONG_INPUT.getMassage(), "");
                runHandler();
            }
        }
    }

    public static void selectCreationMethod() {
        try (Scanner scanner = new Scanner(System.in)) {
            getMenuItemSeparator();
            setMenuTextFormatter("There are 2 options for order a car:", "");
            getTextSeparator();
            setMenuTextFormatter("1.The choice of the standard cars", "(STD)");
            setMenuTextFormatter("2.Individual selection of the installed nodes", "(IND)");
            setMenuTextFormatter("For return to menu, insert", "(RET)");
            getMenuItemSeparator();
            commandReader = scanner.nextLine().toUpperCase();
            if (commandReader.equals("STD")) {
                orderStandardCar();
                runHandler();
            } else if (commandReader.equals("IND")) {
                orderUniqueCar();
            } else if (commandReader.equals("RET")) {
                runHandler();
            } else {
                System.out.println(WRONG_INPUT.getMassage());
                selectCreationMethod();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void orderStandardCar() {
        try (Scanner scanner = new Scanner(System.in)) {
            getMenuItemSeparator();
            System.out.println("Choice car model : ");
            getMenuItemSeparator();
            setMenuTextFormatter(CITY_CAR.getCarModel(), CITY_CAR.getKey());
            setMenuTextFormatter(SPORT_CAR.getCarModel(), SPORT_CAR.getKey());
            setMenuTextFormatter(SUV_CAR.getCarModel(), SUV_CAR.getKey());
            getMenuItemSeparator();
            StandardCars standardCars;
            commandReader = scanner.nextLine().toUpperCase();
            standardCars = StandardCars.valueOf(commandReader);
            getStandardCar(standardCars);
            runHandler();
        } catch (IllegalArgumentException e) {
            System.out.println(WRONG_INPUT.getMassage());
            orderStandardCar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void orderUniqueCar() throws IOException, ClassNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            getTextSeparator();
            System.out.println("Insert order name");
            getTextSeparator();
            commandReader = scanner.nextLine();
            if (checkTheOrderNameUniqueness(commandReader)) {
                IndividualOrder individualOrder = new IndividualOrder(commandReader);
                individualOrder.createOrder();
            } else {
                System.out.println("Order name is not unique, enter another name");
                orderUniqueCar();
            }
        }
    }
}
