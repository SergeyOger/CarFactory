package com.car_factory.factory_office.order_department;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.car_assembly_line.standart_cars.StandardCars;

import java.io.IOException;

import static com.car_factory.factory_office.car_shipment_department.CarShipment.*;

public class StandardOrder {

    public static <T extends ICarAssemlyLine> void getStandardCar(StandardCars standardCars) throws IOException {
        switch (standardCars) {
            case CITY_CAR :
                System.out.println("You order");
                shipTheCityCar().getCarSpecification();
                break;
            case SPORT_CAR:
                System.out.println("You order");
                shipTheSportCar().getCarSpecification();
                break;
            case SUV_CAR:
                System.out.println("You order");
                shipSUVCar().getCarSpecification();
                break;
        }
    }
}
