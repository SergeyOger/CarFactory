package com.infomodule;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public final class InfoHandler {

    public static final String ENGINES = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\engines.bin";
    public static final String TRANSMISSIONS = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\transmissions.bin";
    public static final String BODIES = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\bodies.bin";
    public static final String SUSPENSIONS = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\suspensions.bin";
    public static final String INTERIORS = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\interiors.bin";
    public static final String COUNTERS = "C:\\Users\\Case-IH\\IdeaProjects\\CarFactory\\src\\Files\\counters.bin";

    public enum InfoMassage {
        WRONG_INPUT("Wrong input,please repeat the input");
        private String massage;
        InfoMassage(String massage) {
            this.massage = massage;
        }

        public String getMassage() {
            return massage;
        }
    }

    public static <T> void saveCreationObjectToFile(ArrayList<T> list, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> ArrayList<T> readSavedObject(ArrayList<T> list, String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<T>) objectInputStream.readObject();
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

//    public static int readCounterForDetailCarCreator(ArrayList<ArrayList<Integer>> counters, int mainArrayListIndex,
//                                                     int inletArrayListIndex, String fileName) {
//
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
//            counters = (ArrayList<ArrayList<Integer>>) objectInputStream.readObject();
//            ArrayList<Integer> details = counters.get(mainArrayListIndex);
//            int counter = details.get(inletArrayListIndex);
//            return counter;
//        } catch (FileNotFoundException e) {
//            System.out.println("File with counters not find");
//            return 0;
//        } catch (IOException e) {
//            return 0;
//        } catch (ClassNotFoundException e) {
//            return 0;
//        } catch (NullPointerException nullPointer) {
//            nullPointer.printStackTrace();
//            return 0;
//        }
//    }

    public static int readCounterForInfoModule(int mainArrayListIndex, int inletArrayListIndex) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(COUNTERS))) {
            ArrayList<ArrayList<Integer>> counters = (ArrayList<ArrayList<Integer>>) objectInputStream.readObject();
            ArrayList<Integer> numbers = counters.get(mainArrayListIndex);
            int requestNumber = numbers.get(inletArrayListIndex);
            return requestNumber;
        } catch (FileNotFoundException e) {
            System.out.println("File with counters not find");
            return 0;
        } catch (IOException e) {
            return 0;
        } catch (ClassNotFoundException e) {
            return 0;
        }
    }

    public static ArrayList<Integer> readArrayLIstFromArrayList(ArrayList<ArrayList<Integer>> list, int index, String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<ArrayList<Integer>>) objectInputStream.readObject();
            ArrayList<Integer> someList = list.get(index);
            return someList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void stringFormater(String description, int value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20d", value));
    }

    public static void stringFormater(String description, double value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20.2f", value));
    }

    public static void stringFormater(String description, String value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20s", value));
    }

    public static void getSeparator() {
        for (int i = 0; i < 41; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void getTextSeparator() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void getMenuItemSeparator(){
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void setTextFormater(String value, String shortName) {
        System.out.println(String.format("%-50s",value) + String.format("%10s",shortName));
    }

    public static void setTextFormater(String value, int number) {
        System.out.println(String.format("%-50s",value) + String.format("%10d",number));
    }

    public static void arrayInit(ArrayList<Integer> someList, int size) {
        for (int i = 0; i < size; i++) {
            someList.add(i, 0);
        }
    }

    public static <T> void objectArrayInit(ArrayList<T> someList, int size) {
        for (int i = 0; i < size; i++) {
            someList.add(i, null);
        }
    }

    public enum EnginesE {

        LPE("Low power engine", "LPE", "LP/-4-120-1.6",
                1.6, 4, 120),
        MPE("Medium power engine", "MPE", "MP/-6-350-2.5",
                2.5, 6, 350),
        HPE("High power engine", "HPE", "HP/-12-620-5.2",
                5.2, 12, 620),
        HPDE("High power diesel engine", "HPDE", "HPD/-6-560-6.8",
                6.8, 6, 560);

        private String name;
        private String shortName;
        private String engineModel;
        private double engineVolume;
        private int cilindersNumber;

        private int enginePower;

        EnginesE(String name, String shortName, String engineModel, double engineVolume, int cilindersNumber, int enginePower) {
            this.name = name;
            this.shortName = shortName;
            this.engineModel = engineModel;
            this.engineVolume = engineVolume;
            this.cilindersNumber = cilindersNumber;
            this.enginePower = enginePower;
        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public String getEngineModel() {
            return engineModel;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public int getCilindersNumber() {
            return cilindersNumber;
        }

        public int getEnginePower() {
            return enginePower;
        }

    }

    public enum EngineDescriptionE {
        ENGINE_MODEL("Engine model"),
        ENGINE_VOLUME("Engine volume, L"),
        CILINDERS_NUMBER("Cilinders number"),
        ENGINE_POWER("Engine power"),
        FUEL_TYPE("Fuel type"),
        FUEL_MARK("Fuel mark");

        private String value;

        EngineDescriptionE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public static void setEngineDescription(String engineModel, double engineVolume, int cilindersNumber,
                                            String fuelType, String fuelMark, int enginePower) {
        stringFormater(EngineDescriptionE.ENGINE_MODEL.getValue(), engineModel);
        stringFormater(EngineDescriptionE.ENGINE_VOLUME.getValue(), engineVolume);
        stringFormater(EngineDescriptionE.CILINDERS_NUMBER.getValue(), cilindersNumber);
        stringFormater(EngineDescriptionE.FUEL_TYPE.getValue(), fuelType);
        stringFormater(EngineDescriptionE.FUEL_MARK.getValue(), fuelMark);
        stringFormater(EngineDescriptionE.ENGINE_POWER.getValue(), enginePower);
    }

    public enum Fuel {

        PETROL("PETROL", "A-92"),
        HIGH_OCTAN_PETROL("PETROL", "A-98"),
        DIESEL("DIESEL", "DIESEL");

        private String fuelType;
        private String fuelMark;

        Fuel(String fuelType, String fuelMark) {
            this.fuelType = fuelType;
            this.fuelMark = fuelMark;
        }

        public String getFuelMark() {
            return fuelMark;
        }

        public String getFuelType() {
            return fuelType;
        }
    }

    public enum TransmissionsE {

        SMT("Standart manual trnsmission", "SMT", "STD/-5-2WDTR",
                "Manual", 5, "2 wheel drive"),
        AT("Automatic transmission", "AT", "AUT/-5-2WDTR",
                "Automatic", 5, "2 wheel drive"),
        SAT("Semi - automatic transmission", "SAT", "SAT/-6-4WDTR",
                "Semi - Automatic", 6, "2 wheel drive"),
        HDMT("Heavi - duty manua transmission", "HDMT", "HDT/-6-4WDTR",
                "Manual", 6, "4 wheel drive");

        private String name;
        private String shortName;
        private String transmissionModel;
        private String transmissionType;
        private int numberOfGears;
        private String typeOfDrive;

        TransmissionsE(String name, String shortName, String transmissionModel, String transmissionType, int numberOfGears, String typeOfDrive) {
            this.name = name;
            this.shortName = shortName;
            this.transmissionModel = transmissionModel;
            this.transmissionType = transmissionType;
            this.numberOfGears = numberOfGears;
            this.typeOfDrive = typeOfDrive;
        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public int getNumberOfGears() {
            return numberOfGears;
        }

        public String getTransmissionType() {
            return transmissionType;
        }

        public String getTypeOfDrive() {
            return typeOfDrive;
        }

        public String getTransmissionModel() {
            return transmissionModel;
        }
    }

    public enum TransmissionDescriptionE {
        TRNSMISSION_MODEL("Transmission model"),
        TRANSMISSION_TYPE("Transission type"),
        NUMBER_OF_GEARS("Number of gears"),
        TYPE_OF_DRIVE("Type of drive");

        private String value;

        TransmissionDescriptionE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void setTransmissionDescription(String transmissionModel, String transmissionType,
                                                  int numberOfGears, String typeOfDrive) {
        stringFormater(TransmissionDescriptionE.TRNSMISSION_MODEL.getValue(), transmissionModel);
        stringFormater(TransmissionDescriptionE.TRANSMISSION_TYPE.getValue(), transmissionType);
        stringFormater(TransmissionDescriptionE.NUMBER_OF_GEARS.getValue(), numberOfGears);
        stringFormater(TransmissionDescriptionE.TYPE_OF_DRIVE.getValue(), typeOfDrive);

    }

    public enum BodiesE {

        S("Sedan body", "S", "SB/-4-4STL", "Sedan",
                "Steel", 4, 4),
        C("Coupe body", "C", "CUB/-2-2AL", "Coupe",
                "Aluminium", 2, 2),
        SUV("SUV body", "SUV", "SUB/-7-5STL", "SUV",
                "Steel", 4, 7);

        private String name;
        private String shortName;
        private String bodyModel;
        private String bodyType;
        private String bodyMaterial;
        private int numberOfSeats;
        private int numberOfDoors;

        BodiesE(String name, String shortName, String bodyModel, String bodyType, String bodyMaterial, int numberOfSeats, int numberOfDoors) {

            this.name = name;
            this.shortName = shortName;
            this.bodyModel = bodyModel;
            this.bodyType = bodyType;
            this.bodyMaterial = bodyMaterial;
            this.numberOfSeats = numberOfSeats;
            this.numberOfDoors = numberOfDoors;

        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public String getBodyModel() {
            return bodyModel;
        }

        public String getBodyType() {
            return bodyType;
        }

        public String getBodyMaterial() {
            return bodyMaterial;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }
    }

    public enum BodiesDescriptionE {
        BODY_MODEL("Body model"),
        BODY_TYPE("Body type"),
        BODY_MATRIAL("Body material"),
        BODY_COLOUR("Body colour"),
        NUMBER_OF_SEATS("Number of seats"),
        NUMBER_OF_DOORS("Number of doors");

        private String name;

        BodiesDescriptionE(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void setBodiesDescription(String bodyModel, String bodyType, String bodyMaterial,
                                            String bodyColour, int numberOfSeats, int numberOfDoors) {
        stringFormater(BodiesDescriptionE.BODY_MODEL.getName(), bodyModel);
        stringFormater(BodiesDescriptionE.BODY_TYPE.getName(), bodyType);
        stringFormater(BodiesDescriptionE.BODY_MATRIAL.getName(), bodyMaterial);
        stringFormater(BodiesDescriptionE.BODY_COLOUR.getName(), bodyColour);
        stringFormater(BodiesDescriptionE.NUMBER_OF_DOORS.getName(), numberOfDoors);
        stringFormater(BodiesDescriptionE.NUMBER_OF_SEATS.getName(), numberOfSeats);

    }

    public enum InteriorsE {
        STDI("Standart interior", "STDI", "STDI/-CL-CL-A", "The cloth",
                "The cloth", "Analog"),
        STI("Sport interior", "STI", "SI/-C-C-D", "Carbon",
                "Carbon", "Digital"),
        WRI("Wear resistant interior", "WRI", "WRI/-CL-ANT-D", "The cloth",
                "Alcantara", "Digital");

        private String name;
        private String shortName;
        private String interiorModel;
        private String seatsMaterial;
        private String upholsteryMaterial;
        private String dashboardType;

        InteriorsE(String name, String shortName, String interiorModel, String seatsMaterial, String upholsteryMaterial, String dashboardType) {

            this.name = name;
            this.shortName = shortName;
            this.interiorModel = interiorModel;
            this.seatsMaterial = seatsMaterial;
            this.upholsteryMaterial = upholsteryMaterial;
            this.dashboardType = dashboardType;
        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public String getInteriorModel() {
            return interiorModel;
        }

        public String getSeatsMaterial() {
            return seatsMaterial;
        }

        public String getUpholsteryMaterial() {
            return upholsteryMaterial;
        }

        public String getDashboardType() {
            return dashboardType;
        }
    }

    public enum InteriorsDescriptionE {
        INTERIOR_MODEL("Interior model"),
        SEATS_MATERIAL("Seats material"),
        UPHOLSTERY_MATERIAL("Upholstery material"),
        DASHDOARD_TYPE("Dashboard type");
        private String name;

        InteriorsDescriptionE(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void setInteriorsDescription(String interiorModel, String seatsMaterial, String upholsteryMaterial,
                                               String dashboardType) {
        stringFormater(InteriorsDescriptionE.INTERIOR_MODEL.getName(), interiorModel);
        stringFormater(InteriorsDescriptionE.SEATS_MATERIAL.getName(), seatsMaterial);
        stringFormater(InteriorsDescriptionE.UPHOLSTERY_MATERIAL.getName(), upholsteryMaterial);
        stringFormater(InteriorsDescriptionE.DASHDOARD_TYPE.getName(), dashboardType);
    }

    public enum SuspensionsE {
        STDS("Standart suspension", "STDS", "STS/-M200-80", "Medium",
                200, 80),
        CTS("Comphort suspension", "CTS", "CS/-H250-100", "High",
                250, 100),
        STS("Sport suspension", "STS", "SP/-L120-50", "Low",
                120, 50),
        ORS("Off - road suspension", "ORS", "ORS/-M350-180", "Medium",
                350, 180);

        private String name;
        private String shortName;
        private String suspensionModel;
        private String comphortLevel;
        private int clearense;
        private int suspensionTreavel;

        SuspensionsE(String name, String shortName, String suspensionModel,
                     String comphortLevel, int clearense, int suspensionTreavel) {
            this.name = name;
            this.shortName = shortName;
            this.suspensionModel = suspensionModel;
            this.comphortLevel = comphortLevel;
            this.clearense = clearense;
            this.suspensionTreavel = suspensionTreavel;

        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public String getSuspensionModel() {
            return suspensionModel;
        }

        public String getComphortLevel() {
            return comphortLevel;
        }

        public int getClearense() {
            return clearense;
        }

        public int getSuspensionTreavel() {
            return suspensionTreavel;
        }

    }

    public enum SuspensionsDescriptionE {

        SUSPENSION_MODEL("Suspension model"),
        COMPHORT_LEVEL("Comphort level"),
        CLEARENSE("Clearense"),
        SUSPENSION_TREAVEL("Suspension treavel");

        private String name;

        SuspensionsDescriptionE(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void setSuspensionsDescription(String suspensionModel, String comphortLevel,
                                                 int clearense, int suspensionTreavel) {
        stringFormater(SuspensionsDescriptionE.SUSPENSION_MODEL.getName(), suspensionModel);
        stringFormater(SuspensionsDescriptionE.COMPHORT_LEVEL.getName(), comphortLevel);
        stringFormater(SuspensionsDescriptionE.CLEARENSE.getName(), clearense);
        stringFormater(SuspensionsDescriptionE.SUSPENSION_TREAVEL.getName(), suspensionTreavel);
    }

}
