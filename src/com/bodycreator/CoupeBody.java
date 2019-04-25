package com.bodycreator;

import static com.infomodule.InfoHandler.BodiesE;
import static com.infomodule.InfoHandler.setBodiesDescription;

public class CoupeBody extends Body {

    private static String bodyModel = BodiesE.C.getBodyModel();
    private static String bodyType = BodiesE.C.getBodyType();
    private static String bodyMaterial = BodiesE.C.getBodyMaterial();
    private static int numberOfSeats = BodiesE.C.getNumberOfSeats();
    private static String bodyColour;
    private static int numberOfDoors = BodiesE.C.getNumberOfDoors();
    private static int coupeBodyCounter;

    public CoupeBody(String bodyColour) {
        this.bodyColour = bodyColour;
        coupeBodyCounter++;
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

    public static void setCounter(int counter) {
        coupeBodyCounter = counter;
    }

    public static int getCounter() {
        return coupeBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getDetailDescription() {
        setBodiesDescription(bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
