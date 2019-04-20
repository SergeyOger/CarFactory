package com.enginecreator;

import com.interfaces.IGetDetailsDescription;

import java.io.Serializable;

public abstract class Engine implements IGetDetailsDescription, Serializable {

    public abstract double getEngineVolume();

    public abstract int getCilindersNumber();

    public abstract String getEngineType();

    public abstract String getFuelType();

    public abstract int getEnginePower();
}
