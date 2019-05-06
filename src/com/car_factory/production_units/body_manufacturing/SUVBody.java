package com.car_factory.production_units.body_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.body_manufacturing.BodySpecification.SUV;

public class SUVBody extends Body {

    private static String bodyModel = SUV.getBodyModel();
    private static String bodyType = SUV.getBodyType();
    private static String bodyMaterial = SUV.getBodyMaterial();
    private static int numberOfSeats = SUV.getNumberOfSeats();
    private BodyColour bodyColour;
    private static int numberOfDoors = SUV.getNumberOfDoors();
    private int suvBodyCounter;

    public SUVBody() {

    }

    public SUVBody(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
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
    public void setBodyColour(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public BodyColour getBodyColour() {
        return bodyColour;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setCounter(int counter) {
        suvBodyCounter = counter;
    }

    public int getCounter() {
        return suvBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getSpecification() {
        setBodiesDescription(suvBodyCounter,bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
