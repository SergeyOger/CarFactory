package com.interfaces;

import java.io.IOException;

public interface ICreateHandler {

    void runCreator() throws IOException, ClassNotFoundException;

    void getInfoAboutCreatedCar();

    void changeTheDirectionOfTheProgram() throws IOException, ClassNotFoundException;

    void saveCreatedCar();


}
