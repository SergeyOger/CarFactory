package com.car_factory.factory_office.order_department;

import com.car_factory.car_assembly_line.unique_car.UniqueCar;
import com.car_factory.production_units.body_manufacturing.BodyColour;
import com.car_factory.production_units.body_manufacturing.BodySpecification;
import com.car_factory.production_units.engine_manufacturing.EngineSpecification;
import com.car_factory.production_units.interior_manufacturing.InteriorSpecification;
import com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification;
import com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification;
import com.car_showroom.InfoMassage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import static com.car_factory.assembled_cars.UniqueCarsStorage.saveUniqueCar;
import static com.car_factory.factory_office.car_shipment_department.CarShipment.shipUniqueCar;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.getArchiveData;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.body_manufacturing.BodyDescription.BODY_COLOUR;
import static com.car_factory.production_units.body_manufacturing.BodyDescription.BODY_MODEL;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.*;
import static com.car_factory.production_units.engine_manufacturing.EngineDescription.ENGINE_MODEL;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorDescription.INTERIOR_MODEL;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.*;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionDescription.SUSPENSION_MODEL;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.*;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionDescription.TRANSMISSION_MODEL;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.*;
import static com.car_showroom.MainHandler.orderUniqueCar;
import static com.car_showroom.MainHandler.runHandler;
import static com.car_showroom.TextFormatter.*;


public class IndividualOrder implements Serializable {

    public static final String UNIQUE_CAR_KEY = "UK";
    public static final String SOLD_UNIQUE_CAR_KEY = "UKS";
    private EngineSpecification engineType;
    private static String readEngineType;
    private SuspensionSpecification suspensionType;
    private String readSuspensionType;
    private InteriorSpecification interiorType;
    private String readInteriorType;
    private BodySpecification bodyType;
    private String readBodyType;
    private String readCarColour;
    private BodyColour bodyColour;
    private TransmissionSpecification transmissionType;
    private String readTransmissionType;
    private int individualCarProjectCounter;
    private String directionOfTheProgram;
    private String orderName;

    public IndividualOrder(String orderName) throws IOException {
        if (getArchiveData("IPC") != null) {
            individualCarProjectCounter = getArchiveData("IPC")[0];
        } else {
            individualCarProjectCounter = 0;
        }
        individualCarProjectCounter++;
        updateStatisticsArchive("IPC", individualCarProjectCounter);
        this.orderName = orderName;
    }

    Scanner scanner = new Scanner(System.in);

    private void engineTypeSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Select engine type :", "");
        getTextSeparator();
        setMenuTextFormatter(LPE.getName(), LPE.getShortName());
        setMenuTextFormatter(MPE.getName(), MPE.getShortName());
        setMenuTextFormatter(HPE.getName(), HPE.getShortName());
        setMenuTextFormatter(HPDE.getName(), HPDE.getShortName());
        getMenuItemSeparator();
        readEngineType = scanner.nextLine().toUpperCase().trim();
        try {
            engineType = EngineSpecification.valueOf(readEngineType);
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            engineTypeSelection();
        }

    }

    private void transmissionTypeSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Select transmission type :", "");
        getTextSeparator();
        setMenuTextFormatter(SMT.getName(), SMT.getShortName());
        setMenuTextFormatter(AT.getName(), AT.getShortName());
        setMenuTextFormatter(SAT.getName(), SAT.getShortName());
        setMenuTextFormatter(HDMT.getName(), HDMT.getShortName());
        getMenuItemSeparator();
        readTransmissionType = scanner.nextLine().toUpperCase().trim();
        try {
            transmissionType = TransmissionSpecification.valueOf(readTransmissionType);
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            transmissionTypeSelection();
        }
    }

    private void bodyTypeSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Select body  type :", "");
        getTextSeparator();
        setMenuTextFormatter(S.getName(), S.getShortName());
        setMenuTextFormatter(C.getName(), C.getShortName());
        setMenuTextFormatter(SUV.getName(), SUV.getShortName());
        setMenuTextFormatter(SW.getName(), SW.getShortName());
        getMenuItemSeparator();
        readBodyType = scanner.nextLine().toUpperCase().trim();
        try {
            bodyType = BodySpecification.valueOf(readBodyType);
            bodyColourSelection();
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            bodyTypeSelection();
        }
    }

    private void bodyColourSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Change car colour", "");
        getTextSeparator();
        setMenuTextFormatter(BodyColour.BLACK.getColour(), BodyColour.BLACK.getColour());
        setMenuTextFormatter(BodyColour.RED.getColour(), BodyColour.RED.getColour());
        setMenuTextFormatter(BodyColour.ORANGE.getColour(), BodyColour.ORANGE.getColour());
        setMenuTextFormatter(BodyColour.SILVER.getColour(), BodyColour.SILVER.getColour());
        setMenuTextFormatter(BodyColour.BLUE.getColour(), BodyColour.BLUE.getColour());
        setMenuTextFormatter(BodyColour.GREEN.getColour(), BodyColour.GREEN.getColour());
        setMenuTextFormatter(BodyColour.WHITE.getColour(), BodyColour.WHITE.getColour());
        getMenuItemSeparator();
        readCarColour = scanner.nextLine().toUpperCase().trim();
        try {
            bodyColour = BodyColour.valueOf(readCarColour);
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            bodyColourSelection();
        }
    }

    private void suspensionTypeSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Select suspension type :", "");
        getTextSeparator();
        setMenuTextFormatter(STDS.getName(), STDS.getShortName());
        setMenuTextFormatter(CTS.getName(), CTS.getShortName());
        setMenuTextFormatter(STS.getName(), STS.getShortName());
        setMenuTextFormatter(ORS.getName(), ORS.getShortName());
        getMenuItemSeparator();
        readSuspensionType = scanner.nextLine().toUpperCase().trim();
        try {
            suspensionType = SuspensionSpecification.valueOf(readSuspensionType);
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            suspensionTypeSelection();
        }
    }

    private void interiorTypeSelection() {
        getMenuItemSeparator();
        setMenuTextFormatter("Select interior type :", "");
        getTextSeparator();
        setMenuTextFormatter(STDI.getName(), STDI.getShortName());
        setMenuTextFormatter(STI.getName(), STI.getShortName());
        setMenuTextFormatter(WRI.getName(), WRI.getShortName());
        getMenuItemSeparator();
        readInteriorType = scanner.nextLine().toUpperCase().trim();
        try {
            interiorType = InteriorSpecification.valueOf(readInteriorType);
        } catch (IllegalArgumentException e) {
            System.out.println(InfoMassage.WRONG_INPUT.getMassage());
            interiorTypeSelection();
        }
    }

    public void createOrder() throws IOException, ClassNotFoundException {
        engineTypeSelection();
        bodyTypeSelection();
        transmissionTypeSelection();
        suspensionTypeSelection();
        interiorTypeSelection();
        sendOrderToFactory();
        changeTheDirectionOfTheProgram();
    }

    private void sendOrderToFactory() throws IOException {
        UniqueCar uniqueCar = new UniqueCar(orderName);
        uniqueCar.setCounter(individualCarProjectCounter);
        uniqueCar.setBodyType(bodyType);
        uniqueCar.setBodyColour(bodyColour);
        uniqueCar.setEngineType(engineType);
        uniqueCar.setTransmissionType(transmissionType);
        uniqueCar.setSuspensionType(suspensionType);
        uniqueCar.setInteriorType(interiorType);
        uniqueCar.assembleCar();
        saveUniqueCar(orderName, uniqueCar);
        updateStatisticsArchive(UNIQUE_CAR_KEY, individualCarProjectCounter);
    }

    public void getInfoAboutCreatedCar() {
        getMenuItemSeparator();
        getInfoFormatter(BODY_MODEL.getName(), bodyType.getName());
        getInfoFormatter(BODY_COLOUR.getName(), bodyColour.getColour());
        getInfoFormatter(ENGINE_MODEL.getName(), engineType.getName());
        getInfoFormatter(TRANSMISSION_MODEL.getName(), transmissionType.getName());
        getInfoFormatter(SUSPENSION_MODEL.getName(), suspensionType.getName());
        getInfoFormatter(INTERIOR_MODEL.getName(), interiorType.getName());
        getMenuItemSeparator();
    }

    public void changeTheDirectionOfTheProgram() throws IOException, ClassNotFoundException {
        getMenuItemSeparator();
        setMenuTextFormatter("Get info about car :", "(INFO)");
        setMenuTextFormatter("To receive an order:", "(REC)");
        setMenuTextFormatter("For creating new car insert :", "(NEW)");
        setMenuTextFormatter("For return to menu insert :", "(MENU)");
        getMenuItemSeparator();
        directionOfTheProgram = scanner.nextLine().toUpperCase().trim();

        switch (directionOfTheProgram) {
            case "INFO":
                getInfoAboutCreatedCar();
                changeTheDirectionOfTheProgram();
                break;
            case "REC":
                shipUniqueCar(orderName).getCarSpecification();
                runHandler();
                break;
            case "NEW":
                orderUniqueCar();
                break;
            case "MENU":
                runHandler();
                break;
            default:
                System.out.println(InfoMassage.WRONG_INPUT.getMassage());
                runHandler();
        }
    }
}
