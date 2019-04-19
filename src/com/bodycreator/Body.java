package com.bodycreator;

import java.io.Serializable;

public abstract class Body implements Serializable {

    public abstract String getBodyType();

    public abstract String getBodyMaterial();

    public abstract int getNumberOfSeats();

    public abstract void setBodyColour(String bodyColour);

    public abstract String getBodyColour();

    public abstract int getNumberOfDoors();
}
