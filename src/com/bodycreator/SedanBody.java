package com.bodycreator;

public class SedanBody extends Body {

    private String bodytype = "Sedan";
    private String bodyMaterial = "Steel";
    private int numberOfSeats = 4;
    private String bodyColour = "Grey";
    private int numberOfDoors = 4;
    private static int sedanBodyCoubter;

    public SedanBody(String bodyColour) {
        this.bodyColour = bodyColour;
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

    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Body model:") + String.format("%15s", "CUB/-2-2AL"));
        System.out.println(String.format("%-17s", "Body type:") + String.format("%15s", bodytype));
        System.out.println(String.format("%-17s", "Body material:") + String.format("%15s", bodyMaterial));
        System.out.println(String.format("%-17s", "Number of seats:") + String.format("%15d", numberOfSeats));
        System.out.println(String.format("%-17s", "Body colour:") + String.format("%15s", bodyColour));
        System.out.println(String.format("%-17s", "Number of doors:") + String.format("%15d", numberOfDoors));
        System.out.println();
    }
}
