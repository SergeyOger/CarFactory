package com.transmissioncreator;

import com.interfaces.IGetDetailsDescription;

import java.io.Serializable;

public abstract class Transmission implements IGetDetailsDescription, Serializable {

    public abstract String getTransmissionType();

    public abstract int getNumberOfGears();

    public abstract String getTypeOfDrive();
}
