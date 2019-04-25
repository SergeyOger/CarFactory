package com.bodycreator;

import static com.infomodule.InfoHandler.BodiesE;
import static com.infomodule.InfoHandler.setBodiesDescription;

public class SUVBody extends Body {

    private static String bodyModel = BodiesE.SUV.getBodyModel();
    private static String bodyType = BodiesE.SUV.getBodyType();
    private static String bodyMaterial = BodiesE.SUV.getBodyMaterial();
    private static int numberOfSeats = BodiesE.SUV.getNumberOfSeats();
    private static String bodyColour;
    private static int numberOfDoors = BodiesE.SUV.getNumberOfDoors();
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

    public static void setCounter(int counter) {
        suvBodyCounter = counter;
    }

    public static int getCounter() {
        return suvBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getDetailDescription() {
        setBodiesDescription(bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
