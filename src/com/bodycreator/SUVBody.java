package com.bodycreator;

public class SUVBody extends Body {

    private String bodytype = "SUV";
    private String bodyMaterial = "Steel";
    private int numberOfSeats = 7;
    private String bodyColour = "Black";
    private int numberOfDoors = 5;
    private static int suvBodyCounter;

    public SUVBody() {
        suvBodyCounter++;
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

    public static int getSuvBodyCounter() {
        return suvBodyCounter;
    }

    @Override
    public String toString() {
        return "Body model: SUB/-7-5STL";
    }
}
