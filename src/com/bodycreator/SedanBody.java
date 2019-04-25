package com.bodycreator;

import static com.infomodule.InfoHandler.BodiesE;
import static com.infomodule.InfoHandler.setBodiesDescription;

public class SedanBody extends Body {

    private static String bodyModel = BodiesE.S.getBodyModel();
    private static String bodytype = BodiesE.S.getBodyType();
    private static String bodyMaterial = BodiesE.S.getBodyMaterial();
    private static int numberOfSeats = BodiesE.S.getNumberOfSeats();
    private static String bodyColour;
    private static int numberOfDoors = BodiesE.S.getNumberOfDoors();
    private static int sedanBodyCounter;

    public SedanBody(String bodyColour) {
        this.bodyColour = bodyColour;
        sedanBodyCounter++;
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

    public static void setCounter(int counter) {
        sedanBodyCounter = counter;
    }

    public static int getCounter() {
        return sedanBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getDetailDescription() {
        setBodiesDescription(bodyModel, bodytype, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
