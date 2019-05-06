package com.car_showroom;

public abstract class TextFormatter {
    public static void getMenuItemSeparator() {
        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void setMenuTextFormatter(String value, String shortName) {
        System.out.println(String.format("%-50s", value) + String.format("%10s", shortName));
    }

    public static void setMenuTextFormatter(String value, int number) {
        System.out.println(String.format("%-50s", value) + String.format("%10d", number));
    }

    public static void getInfoFormatter(String description, String value) {
        System.out.println(String.format("%-25s", description + " :") + String.format("%35s", value));
    }

    public static void getSeparator() {
        for (int i = 0; i < 41; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void getTextSeparator() {
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
