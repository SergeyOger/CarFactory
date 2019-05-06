package com.car_factory.production_units.body_manufacturing;

import java.io.Serializable;

import static com.car_factory.production_units.body_manufacturing.BodySpecification.C;

public class CoupeBody extends Body {

    private static String bodyModel = C.getBodyModel();
    private static String bodyType = C.getBodyType();
    private static String bodyMaterial = C.getBodyMaterial();
    private static int numberOfSeats = C.getNumberOfSeats();
    private BodyColour bodyColour;
    private static int numberOfDoors = C.getNumberOfDoors();
    private int coupeBodyCounter;

    public CoupeBody() {

    }

    public CoupeBody(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public void setBodyColour(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    public void setCounter(int counter) {
        coupeBodyCounter = counter;
    }

    public int getCounter() {
        return coupeBodyCounter;
    }

    @Override
    public String toString() {
        return bodyModel;
    }

    public void getSpecification() {
        setBodiesDescription(coupeBodyCounter,bodyModel, bodyType, bodyMaterial, bodyColour, numberOfSeats, numberOfDoors);
    }
}
