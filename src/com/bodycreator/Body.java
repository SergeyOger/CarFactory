package com.bodycreator;

import com.interfaces.IGetDetailsDescription;

import java.io.Serializable;

public abstract class Body implements Serializable {

    private static String bodyModel;
    private static String bodyType ;
    private static String bodyMaterial;
    private static int numberOfSeats;
    private static String bodyColour ;
    private static int numberOfDoors;

    public abstract String getBodyType();

    public abstract String getBodyMaterial();

    public abstract int getNumberOfSeats();

    public abstract void setBodyColour(String bodyColour);

    public abstract String getBodyColour();

    public abstract int getNumberOfDoors();

    public static void getDetailDescription() {
        System.out.println(String.format("%-17s", "Body model:") + String.format("%15s", bodyModel));
        System.out.println(String.format("%-17s", "Body type:") + String.format("%15s", bodyType));
        System.out.println(String.format("%-17s", "Body material:") + String.format("%15s", bodyMaterial));
        System.out.println(String.format("%-17s", "Number of seats:") + String.format("%15d", numberOfSeats));
        System.out.println(String.format("%-17s", "Body colour:") + String.format("%15s", bodyColour));
        System.out.println(String.format("%-17s", "Number of doors:") + String.format("%15d", numberOfDoors));
        System.out.println();
    }
}
