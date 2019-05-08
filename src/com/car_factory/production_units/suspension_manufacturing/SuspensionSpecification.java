package com.car_factory.production_units.suspension_manufacturing;

public enum SuspensionSpecification {

    STDS("STDS","Standard suspension", "STDS", "STS/-M200-80",
            "Medium",200, 80),
    CTS("CTS","Comfort suspension", "CTS", "CS/-H250-100", "High",
            250, 100),
    STS("STS","Sport suspension", "STS", "SP/-L120-50", "Low",
            120, 50),
    ORS("ORS","Off - road suspension", "ORS", "ORS/-M350-180", "Medium",
            350, 180);

    private String archiveKey;
    private String name;
    private String shortName;
    private String suspensionModel;
    private String comfortLevel;
    private int clearance;
    private int suspensionTravel;

    SuspensionSpecification(String archiveKey, String name, String shortName, String suspensionModel,
                            String comfortLevel, int clearance, int suspensionTravel) {
        this.archiveKey = archiveKey;
        this.name = name;
        this.shortName = shortName;
        this.suspensionModel = suspensionModel;
        this.comfortLevel = comfortLevel;
        this.clearance = clearance;
        this.suspensionTravel = suspensionTravel;

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

    public String getComfortLevel() {
        return comfortLevel;
    }

    public int getClearance() {
        return clearance;
    }

    public int getSuspensionTravel() {
        return suspensionTravel;
    }

    public String getArchiveKey() {
        return archiveKey;
    }
}

