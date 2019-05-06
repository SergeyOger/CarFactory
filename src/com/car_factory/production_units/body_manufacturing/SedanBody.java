package com.car_factory.production_units.body_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.body_manufacturing.BodySpecification.S;

public class SedanBody extends Body {

    private static String bodyModel = S.getBodyModel();
    private static String bodyType = S.getBodyType();
    private static String bodyMaterial = S.getBodyMaterial();
    private static int numberOfSeats = S.getNumberOfSeats();
    private BodyColour bodyColour;
    private static int numberOfDoors = S.getNumberOfDoors();
    private int sedanBodyCounter;

    public SedanBody() {

    }

    public SedanBody(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public void setBodyColour(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    public void setCounter(int counter) {
        sedanBodyCounter = counter;
    }

    public int getCounter() {
        return sedanBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getSpecification() {
        setBodiesDescription(sedanBodyCounter,bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
