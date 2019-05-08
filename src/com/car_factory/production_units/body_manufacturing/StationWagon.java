package com.car_factory.production_units.body_manufacturing;

import static com.car_factory.production_units.body_manufacturing.BodySpecification.SW;

public class StationWagon extends Body {

    private static String bodyModel = SW.getBodyModel();
    private static String bodyType = SW.getBodyType();
    private static String bodyMaterial = SW.getBodyMaterial();
    private static int numberOfSeats = SW.getNumberOfSeats();
    private BodyColour bodyColour;
    private static int numberOfDoors = SW.getNumberOfDoors();
    private int wagonBodyCounter;

    public StationWagon() {

    }

    public StationWagon(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public void setBodyColour(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public void getSpecification() {
        setBodiesDescription(wagonBodyCounter,bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }

    @Override
    public int getCounter() {
        return wagonBodyCounter;
    }

    @Override
    public void setCounter(int counter) {
        wagonBodyCounter = counter;
    }
}
