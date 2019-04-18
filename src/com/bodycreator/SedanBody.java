package com.bodycreator;

public class SedanBody extends Body {

    private String bodytype = "Sedan";
    private String bodyMaterial = "Steel";
    private int numberOfSeats = 4;
    private String bodyColour ="grey";
    private int numberOfDoors = 4;
    private static int sedanBodyCoubter;

    public SedanBody() {
        sedanBodyCoubter++;
    }

    @Override
    public String getBodyType() {
        return bodytype;
    }

    @Override
    public String getBodyMaterial() {
        return bodyMaterial;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void setBodyColour(String bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public String getBodyColour() {
        return bodyColour;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public static int getSedanBodyCoubter() {
        return sedanBodyCoubter;
    }

    @Override
    public String toString() {
        return "Body model: SB/-4-4STL";
    }
}
