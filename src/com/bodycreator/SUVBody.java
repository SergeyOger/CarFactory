package com.bodycreator;

public class SUVBody extends Body {

    private String bodyType = "SUV";
    private String bodyMaterial = "Steel";
    private int numberOfSeats = 7;
    private String bodyColour = "Black";
    private int numberOfDoors = 5;
    private String bodyModel = "SUB/-7-5STL";
    private static int suvBodyCounter;

    public SUVBody(String bodyColour) {
        this.bodyColour = bodyColour;
        suvBodyCounter++;
    }

    @Override
    public String getBodyType() {
        return bodyType;
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

    public static int getSuvBodyCounter() {
        return suvBodyCounter;
    }

    @Override
    public String toString() {
        return "Body model: SUB/-7-5STL";
    }

    public void getDetailDescription() {
        System.out.println(String.format("%-17s", "Body model:") + String.format("%15s", bodyModel));
        System.out.println(String.format("%-17s", "Body type:") + String.format("%15s", bodyType));
        System.out.println(String.format("%-17s", "Body material:") + String.format("%15s", bodyMaterial));
        System.out.println(String.format("%-17s", "Number of seats:") + String.format("%15d", numberOfSeats));
        System.out.println(String.format("%-17s", "Body colour:") + String.format("%15s", bodyColour));
        System.out.println(String.format("%-17s", "Number of doors:") + String.format("%15d", numberOfDoors));
        System.out.println();
    }
}
