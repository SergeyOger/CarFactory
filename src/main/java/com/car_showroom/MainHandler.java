package com.car_showroom;

import com.car_factory.car_assembly_line.standart_cars.StandardCars;
import com.car_factory.factory_office.order_department.IndividualOrder;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static com.car_factory.assembled_cars.UniqueCarsStorage.checkTheOrderNameUniqueness;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.car_shipment_department.CarShipment.shipUniqueCar;
import static com.car_factory.factory_office.order_department.StandardOrder.getStandardCar;
import static com.car_factory.factory_office.statistics_department.ProductionStatistics.openStatisticsDepartment;
import static com.car_showroom.InfoMassage.WRONG_INPUT;
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
            setMenuTextFormatter("Pick up a previously placed order", "(PPO)");
            setMenuTextFormatter("To view statistics on cars produced, insert", "(STAT)");
            setMenuTextFormatter("To exit the program, insert", "(EXIT)");
            getMenuItemSeparator();
            commandReader = scanner.nextLine().toUpperCase();
            if (commandReader.equals("ODR")) {
                selectCreationMethod();
            } else if (commandReader.equals("STAT")) {
                openStatisticsDepartment();
            } else if (commandReader.equals("PPO")) {
                getPreviouslyCreatedOrder();
            } else if (commandReader.equals("EXIT")) {
                System.out.println("Program finished");
                scanner.close();
                return;
            } else {
                setMenuTextFormatter(WRONG_INPUT.getMassage(), "");
                runHandler();
            }
        } catch (NoSuchElementException e) {

        } catch (IOException e) {
            e.printStackTrace();
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
        try (Scanner scanner = new Scanner(System.in);) {
            getMenuItemSeparator();
            System.out.println("Choice car model : ");
            getMenuItemSeparator();
            setMenuTextFormatter(CITY_CAR.getCarModel(), CITY_CAR.getKey());
            setMenuTextFormatter(SPORT_CAR.getCarModel(), SPORT_CAR.getKey());
            setMenuTextFormatter(SUV_CAR.getCarModel(), SUV_CAR.getKey());
            setMenuTextFormatter(WAGON_CAR.getCarModel(), WAGON_CAR.getKey());
            getMenuItemSeparator();
            StandardCars standardCars;
            commandReader = scanner.nextLine().toUpperCase();
            try {
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

    }

    public static void orderUniqueCar() throws IOException, ClassNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            getTextSeparator();
            System.out.println("Insert order name(not more than 25 characters)");
            getTextSeparator();
            commandReader = scanner.nextLine().trim();
            if(commandReader.length() > 25) {
                System.out.println(WRONG_INPUT.getMassage());
                orderUniqueCar();
            } else if (commandReader.isEmpty()) {
                System.out.println(WRONG_INPUT.getMassage());
                orderUniqueCar();
            } else if (checkTheOrderNameUniqueness(commandReader)) {
                IndividualOrder individualOrder = new IndividualOrder(commandReader);
                individualOrder.createOrder();
            } else {
                System.out.println("Order name is not unique, enter another name");
                orderUniqueCar();
            }
        }
    }

    public static void getPreviouslyCreatedOrder() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            getMenuItemSeparator();
            System.out.println("Insert order name");
            getTextSeparator();
            commandReader = scanner.nextLine();
            try {
                shipUniqueCar(commandReader).getCarSpecification();
                runHandler();
            } catch (NullPointerException e) {
                getTextSeparator();
                System.out.println("Check another number ? Y/N");
                getMenuItemSeparator();
                commandReader = scanner.nextLine().trim().toUpperCase();
                if (commandReader.equals("Y")) {
                    getPreviouslyCreatedOrder();
                } else {
                    runHandler();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
