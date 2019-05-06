package com.car_factory.production_units.specification_formating;

public final class UnitSpecificationFormatting {

    public static void getSerialNumberFormatter(String description, int serialNumber) {
        System.out.println(String.format("%-21s",description) + String.format("%14s"," ")
                + String.format("%06d",serialNumber));
    }

    public static void getSpecificationFormatter(String description, int value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20d", value));
    }

    public static void getSpecificationFormatter(String description, double value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20.2f", value));
    }

    public static void getSpecificationFormatter(String description, String value) {
        System.out.println(String.format("%-21s", description + " :") + String.format("%20s", value));
    }

}
