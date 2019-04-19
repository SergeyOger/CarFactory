package com.transmissioncreator;

import java.io.Serializable;

public abstract class Transmission implements Serializable {

    public abstract String getTransmissionType();

    public abstract int getNumberOfGears();

    public abstract String getTypeOfDrive();
}
