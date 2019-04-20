package com.bodycreator;

public class CoupeBody extends Body {

    private static String bodytype = "Coupe";
    private static String bodyMaterial = "Aluminium";
    private static int numberOfSeats = 2;
    private static String bodyColour = "Red";
    private static int numberOfDoors = 2;
    private static int coupeBodyCounter;

    public CoupeBody() {
        coupeBodyCounter++;
    }

    @Override
    public String getBodyType() {
        return bodytype;
    }

    @Override
    public String getBodyMaterial() {
        return bodyMaterial;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void setBodyColour(String bodyColour) {
        this.bodyColour = bodyColour;
    }

    @Override
    public String getBodyColour() {
        return bodyColour;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public static int getCoupeBodyCounter() {
        return coupeBodyCounter;
    }

    @Override
    public String toString() {
        return "Body model: CUB/-2-2AL";
    }

    public static void getDetailDescription() {
        System.out.println(String.format("%-17s", "Body model:") + String.format("%15s", "CUB/-2-2AL"));
        System.out.println(String.format("%-17s", "Body type:") + String.format("%15s", bodytype));
        System.out.println(String.format("%-17s", "Body material:") + String.format("%15s", bodyMaterial));
        System.out.println(String.format("%-17s", "Number of seats:") + String.format("%15d", numberOfSeats));
        System.out.println(String.format("%-17s", "Body colour:") + String.format("%15s", bodyColour));
        System.out.println(String.format("%-17s", "Number of doors:") + String.format("%15d", numberOfDoors));
        System.out.println();
    }
}
