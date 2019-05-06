package com.car_showroom;

import com.car_factory.car_assembly_line.ICarAssemlyLine;

public class StandardOrder {

    public static <T extends ICarAssemlyLine> void getStandardCar(String carType) {
        switch (carType) {
            case "CITY":

                break;
            case "SPORT" :

                break;
            case "SUV":

                break;
        }

    }
}
