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
        System.out.println("|" + String.format("%-23s",firstColumnText) + String.format("%24d",firstColumnValue)
                + " | " + String.format("%-24s",secondColumnText) + String.format("%24d",secondColumnValue) + "|" );
    }
    public static void configureTableColumns(String firstColumnText, int firstColumnValue) {
        System.out.println("|" + String.format("%-23s",firstColumnText) + String.format("%24d",firstColumnValue)
                + " | "+ String.format("%48s","") + "|" );
    }

}
