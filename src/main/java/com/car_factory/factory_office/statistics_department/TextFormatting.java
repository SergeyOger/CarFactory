package com.car_factory.factory_office.statistics_department;

public abstract class TextFormatting {

    public static void setTheTableLine () {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void configureTableColumns(String firstColumnText, int firstColumnValue,
                                             String secondColumnText, int secondColumnValue) {
        System.out.println("|" + String.format("%-38s",firstColumnText) + String.format("%10d",firstColumnValue)
                + " | " + String.format("%-38s",secondColumnText) + String.format("%10d",secondColumnValue) + "|" );
    }
    public static void configureTableColumns(String firstColumnText, int firstColumnValue) {
        System.out.println("|" + String.format("%-38s",firstColumnText) + String.format("%10d",firstColumnValue)
                + " | "+ String.format("%48s","") + "|" );
    }

    public static void configureTableColumns(String firstColumnText, String firstColumnValue) {
        System.out.println("|" + String.format("%-38s",firstColumnText) + String.format("%10s",firstColumnValue)
                + " | " );
    }

    public static void configureTableColumnsTitle(String firstColumnText, String secondColumnText) {
        System.out.println("|" + String.format("%-48s",firstColumnText) + " | " + String.format("%-48s",secondColumnText) + "|" );
    }

}
