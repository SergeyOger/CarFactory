package com.car_factory.production_units.interior_manufacturing;

public enum InteriorSpecification {
    STDI("STDI", "Standard interior", "STDI", "STDI/-CL-CL-A",
            "The cloth","The cloth", "Analog"),
    STI("STI","Sport interior", "STI", "SI/-C-C-D", "Carbon",
            "Carbon", "Digital"),
    WRI("WRI","Wear resistant interior", "WRI", "WRI/-CL-ANT-D",
            "The cloth","Alcantara", "Digital");

    private String archiveKey;
    private String name;
    private String shortName;
    private String interiorModel;
    private String seatsMaterial;
    private String upholsteryMaterial;
    private String dashboardType;

    InteriorSpecification(String archiveKey, String name, String shortName, String interiorModel, String seatsMaterial, String upholsteryMaterial, String dashboardType) {

        this.archiveKey = archiveKey;
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

    public String getArchiveKey() {
        return archiveKey;
    }
}

