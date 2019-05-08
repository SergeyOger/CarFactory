package com.car_factory.production_units.body_manufacturing;

public enum BodySpecification {

    S("SEDAN_BODY","Sedan body", "S", "SB/-4-4STL", "Sedan",
            "Steel", 4, 4),
    C("COUPE_BODY","Coupe body", "C", "CUB/-2-2AL", "Coupe",
            "Aluminium", 2, 2),
    SUV("SUV_BODY","SUV body", "SUV", "SUVB/-7-5STL", "SUV",
            "Steel", 7, 4),
    SW("WagonCar","Station wagon","SW","SW/-4-4STL","Wagon",
            "Steel",5,4);

    private String archiveKey;
    private String name;
    private String shortName;
    private String bodyModel;
    private String bodyType;
    private String bodyMaterial;
    private int numberOfSeats;
    private int numberOfDoors;

    BodySpecification(String archiveKey, String name, String shortName, String bodyModel, String bodyType,
                      String bodyMaterial, int numberOfSeats, int numberOfDoors) {
        this.archiveKey = archiveKey;
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

    public String getArchiveKey() {
        return archiveKey;
    }
}
