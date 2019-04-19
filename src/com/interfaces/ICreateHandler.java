package com.interfaces;

import java.io.IOException;

public interface ICreateHandler {

    public void runCreator() throws IOException;

    public void saveCreatedCarToCollection();

    public void getInfoAboutCarDetails(int index);

    public void getInfoAboutCreatedCar();

}
