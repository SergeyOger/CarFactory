package com.car_factory.factory_office.statistics_department;

import java.io.IOException;
import java.util.Scanner;

import static com.car_factory.assembled_cars.UniqueCarsStorage.showNotShippedOrders;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.order_department.IndividualOrder.SOLD_UNIQUE_CAR_KEY;
import static com.car_factory.factory_office.order_department.IndividualOrder.UNIQUE_CAR_KEY;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.getArchiveData;
import static com.car_factory.factory_office.statistics_department.TextFormatting.*;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.*;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.*;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.*;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.*;
import static com.car_showroom.InfoMassage.WRONG_INPUT;
import static com.car_showroom.MainHandler.runHandler;
import static com.car_showroom.TextFormatter.*;

public abstract class ProductionStatistics {

    public static void openStatisticsDepartment() {
        getMenuItemSeparator();
        System.out.println("Statistics department");
        getTextSeparator();
        setMenuTextFormatter("To view not shipped orders", "(NSO)");
        setMenuTextFormatter("To view statistics on the produced cars", "(CARS)");
        setMenuTextFormatter("To view statistics on the produced engines", "(ENG)");
        setMenuTextFormatter("To view statistics on the produced suspensions", "(SUS)");
        setMenuTextFormatter("To view statistics on the produced bodies", "(BOD)");
        setMenuTextFormatter("To view statistics on the produced transmissions", "(TRAN)");
        setMenuTextFormatter("To view statistics on the produced interiors", "(INT)");
        setMenuTextFormatter("To return to menu", "(MENU)");
        getMenuItemSeparator();
        try (Scanner scanner = new Scanner(System.in)) {
            String commandReader = scanner.nextLine().toUpperCase().trim();
            switch (commandReader) {
                case "NSO":
                    viewNotShippedOrders();
                    changeProgramDirection();
                    break;
                case "CARS":
                    showVehicleStatistics();
                    changeProgramDirection();
                    break;
                case "ENG":
                    showProducedEnginesStatistics();
                    changeProgramDirection();
                    break;
                case "SUS":
                    showProducedSuspensionsStatistics();
                    changeProgramDirection();
                    break;
                case "BOD":
                    showProducedBodiesStatistics();
                    changeProgramDirection();
                    break;
                case "TRAN":
                    showProducedTransmissionsStatistics();
                    changeProgramDirection();
                    break;
                case "INT":
                    showProducedInteriorsStatistics();
                    changeProgramDirection();
                    break;
                case "MENU":
                    runHandler();
                    break;
                default:
                    System.out.println(WRONG_INPUT.getMassage());
                    openStatisticsDepartment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void changeProgramDirection() {
        getMenuItemSeparator();
        setMenuTextFormatter("To continue insert ", "(CON)");
        setMenuTextFormatter("To return to menu", "(MENU)");
        getMenuItemSeparator();
        try(Scanner scanner = new Scanner(System.in)){
            String commandReader = scanner.nextLine().toUpperCase().trim();
            if(commandReader.equals("CON")) {
                openStatisticsDepartment();
            }else if (commandReader.equals("MENU")) {
                runHandler();
            } else {
                System.out.println(WRONG_INPUT.getMassage());
                changeProgramDirection();
            }
        }
    }

    private static void viewNotShippedOrders() throws IOException {
        getMenuItemSeparator();
        showNotShippedOrders();
        getMenuItemSeparator();
    }

    public static void showVehicleStatistics() throws IOException {
        int[] producedCars = getArchiveData(CITY_CAR.getKey(), SUV_CAR.getKey(), SPORT_CAR.getKey(), WAGON_CAR.getKey(),
               CITY_CAR.getSoldCarKey(),SPORT_CAR.getSoldCarKey(),SUV_CAR.getSoldCarKey(),WAGON_CAR.getSoldCarKey(),
                UNIQUE_CAR_KEY,SOLD_UNIQUE_CAR_KEY);
        setTheTableLine();
        configureTableColumnsTitle("Produced cars","Sold cars");
        setTheTableLine();
        configureTableColumns(CITY_CAR.getCarModel(), producedCars[0], CITY_CAR.getCarModel(), producedCars[4]);
        configureTableColumns(SPORT_CAR.getCarModel(), producedCars[2], SPORT_CAR.getCarModel(), producedCars[5]);
        configureTableColumns(SUV_CAR.getCarModel(), producedCars[1],SUV_CAR.getCarModel(), producedCars[6] );
        configureTableColumns(WAGON_CAR.getCarModel(),producedCars[3], WAGON_CAR.getCarModel(),producedCars[7]);
        configureTableColumns("Unique car : ",producedCars[8],"Unique car : ",producedCars[9]);

        setTheTableLine();
    }

    private static void showProducedEnginesStatistics() throws IOException {
        int[] producedEngines = getArchiveData(LPE.getArchiveKey(), MPE.getArchiveKey(), HPE.getArchiveKey(),
                HPDE.getArchiveKey());
        setTheTableLine();
        System.out.println("Produced engines");
        setTheTableLine();
        configureTableColumns(LPE.getName(), producedEngines[0], MPE.getName(), producedEngines[1]);
        configureTableColumns(HPE.getName(), producedEngines[2], HPDE.getName(), producedEngines[3]);
        setTheTableLine();
    }

    private static void showProducedBodiesStatistics() throws IOException {
        int[] producedBodies = getArchiveData(S.getArchiveKey(), C.getArchiveKey(), SUV.getArchiveKey(),SW.getArchiveKey());
        setTheTableLine();
        System.out.println("Produced bodies");
        setTheTableLine();
        configureTableColumns(S.getName(), producedBodies[0], C.getName(), producedBodies[1]);
        configureTableColumns(SUV.getName(), producedBodies[2],SW.getName(),producedBodies[3]);
        setTheTableLine();
    }

    private static void showProducedTransmissionsStatistics() throws IOException {
        int[] producedTransmissions = getArchiveData(SMT.getArchiveKey(), AT.getArchiveKey(), SAT.getArchiveKey(),
                HDMT.getArchiveKey());
        setTheTableLine();
        System.out.println("Produced transmissions");
        setTheTableLine();
        configureTableColumns(SMT.getName(), producedTransmissions[0], AT.getName(), producedTransmissions[1]);
        configureTableColumns(SAT.getName(), producedTransmissions[2], HDMT.getName(), producedTransmissions[3]);
        setTheTableLine();
    }

    private static void showProducedSuspensionsStatistics() throws IOException {
        int[] producedSuspensions = getArchiveData(STDS.getArchiveKey(), CTS.getArchiveKey(), STS.getArchiveKey(),
                ORS.getArchiveKey());
        setTheTableLine();
        System.out.println("Produced suspensions");
        setTheTableLine();
        configureTableColumns(STDS.getName(), producedSuspensions[0], CTS.getName(), producedSuspensions[1]);
        configureTableColumns(STS.getName(), producedSuspensions[2], ORS.getName(), producedSuspensions[3]);
        setTheTableLine();
    }

    private static void showProducedInteriorsStatistics() throws IOException {
        int[] producedInteriors = getArchiveData(STDI.getArchiveKey(), STI.getArchiveKey(), WRI.getArchiveKey());
        setTheTableLine();
        System.out.println("Produced interiors");
        setTheTableLine();
        configureTableColumns(STDI.getName(), producedInteriors[0], STI.getName(), producedInteriors[1]);
        configureTableColumns(WRI.getName(), producedInteriors[2]);
        setTheTableLine();

    }

}
