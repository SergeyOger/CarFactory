package com;

import java.io.IOException;

import static com.car_factory.factory_office.car_shipment_department.CarShipment.*;


public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        for (int i = 0; i <30 ; i++) {
            shipTheCityCar();
            System.out.println("+");
            shipTheSportCar();
            System.out.println("*");
            shipSUVCar();
            System.out.println("/");
            shipUniversalCar();
            System.out.println("-");
        }
        System.out.println("Done");
    }


}
