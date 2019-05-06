package com.car_factory.production_units.engine_manufacturing;

public enum EngineSpecification {

    LPE("LPE","Low power engine", "LPE", "LP/-4-120-1.6",
            1.6, "PETROL", "REGULAR", 4, 120),
    MPE("MPE","Medium power engine", "MPE", "MP/-6-350-2.5",
            2.5, "PETROL", "REGULAR", 6, 350),
    HPE("HPE","High power engine", "HPE", "HP/-12-620-5.2",
            5.2, "PETROL", "PLUS", 12, 620),
    HPDE("HPDE","High power diesel engine", "HPDE", "HPD/-6-560-6.8",
            6.8, "DIESEL", "REGULAR", 6, 560);
    private String archiveKey;
    private String name;
    private String shortName;
    private String engineModel;
    private double engineVolume;
    private String fuelType;
    private String fuelMark;
    private int cilindersNumber;

    private int enginePower;

    EngineSpecification(String archiveKey,String name, String shortName, String engineModel,
                        double engineVolume, String fuelType, String fuelMark, int cilindersNumber, int enginePower) {
        this.archiveKey = archiveKey;
        this.name = name;
        this.shortName = shortName;
        this.engineModel = engineModel;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.fuelMark = fuelMark;
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

    public String getFuelType() {
        return fuelType;
    }

    public String getFuelMark() {
        return fuelMark;
    }

    public int getCilindersNumber() {
        return cilindersNumber;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getArchiveKey() {
        return archiveKey;
    }
}
