package com.bodycreator;

public class CoupeBody extends Body {

    private String bodytype = "Coupe";
    private String bodyMaterial = "Aluminium";
    private int numberOfSeats = 2;
    private String bodyColour = "Red";
    private int numberOfDoors = 2;
    private static int coupeBodyCounter;

    public CoupeBody() {
        coupeBodyCounter++;
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

    public static int getCoupeBodyCounter() {
        return coupeBodyCounter;
    }

    @Override
    public String toString() {
        return "Body model: CUB/-2-2AL";
    }
}
