package com.car_factory.factory_office.car_shipment_department;

import com.car_factory.car_assembly_line.standart_cars.CityCar;
import com.car_factory.car_assembly_line.standart_cars.SUV;
import com.car_factory.car_assembly_line.standart_cars.SportCar;
import com.car_factory.car_assembly_line.unique_car.UniqueCar;

import java.io.IOException;

import static com.car_factory.assembled_cars.StandardCarsStorage.getCarFromParkingLot;
import static com.car_factory.assembled_cars.UniqueCarsStorage.getUniqueCarFromParkingLot;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.avaiilability_control_department.car_availability_control.CarAvailabilityControl.*;

public abstract class CarShipment {

    public static CityCar shipTheCityCar() throws IOException {
        checkCityCarAvailability();
        CityCar car = getCarFromParkingLot(CITY_CAR.getKey(), new CityCar());
        return car;
    }

    public static SportCar shipTheSportCar() throws IOException {
        checkSportCarAvailability();
        SportCar car = getCarFromParkingLot(SPORT_CAR.getKey(), new SportCar());
        return car;
    }

    public static SUV shipSUVCar() throws IOException {
        checkSUVCarAvailability();
        SUV car = getCarFromParkingLot(SUV_CAR.getKey(), new SUV());
        return car;
    }

    public static UniqueCar shipUniqueCar(String orderName) throws IOException {
        UniqueCar uniqueCar = getUniqueCarFromParkingLot(orderName);
        return uniqueCar;
    }
}
