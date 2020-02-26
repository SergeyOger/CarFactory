package com.car_factory.production_units.transmission_manufacturing;

public enum TransmissionSpecification {

    SMT("SMT","Standard manual transmission", "SMT", "STD/-5-2WDTR",
            "Manual", 5, "2 wheel drive"),
    AT("AT","Automatic transmission", "AT", "AUT/-5-2WDTR",
            "Automatic", 5, "2 wheel drive"),
    SAT("SAT","Semi - automatic transmission", "SAT", "SAT/-6-4WDTR",
            "Semi - Automatic", 6, "2 wheel drive"),
    HDMT("HDMT","Heavy - duty manual transmission", "HDMT", "HDT/-6-4WDTR",
            "Manual", 6, "4 wheel drive");

    private String archiveKey;
    private String name;
    private String shortName;
    private String transmissionModel;
    private String transmissionType;
    private int numberOfGears;
    private String typeOfDrive;

    TransmissionSpecification(String archiveKey, String name, String shortName, String transmissionModel, String transmissionType, int numberOfGears, String typeOfDrive) {
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

    public String getArchiveKey() {
        return archiveKey;
    }
}

