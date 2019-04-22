package com.interfaces;

import java.io.IOException;

public interface ICreateHandler {

    public void runCreator() throws IOException, ClassNotFoundException;

    public void getInfoAboutCreatedCar();

    public void changeTheDirectionOfTheProgram() throws IOException, ClassNotFoundException;

    public void saveCreatedCar();

}
