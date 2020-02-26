package com.car_factory.factory_office.car_shipment_department;

import com.car_factory.car_assembly_line.standart_cars.CityCar;
import com.car_factory.car_assembly_line.standart_cars.SUV;
import com.car_factory.car_assembly_line.standart_cars.SportCar;
import com.car_factory.car_assembly_line.standart_cars.WagonCar;
import com.car_factory.car_assembly_line.unique_car.UniqueCar;

import java.io.IOException;

import static com.car_factory.assembled_cars.StandardCarsStorage.getCarFromParkingLot;
import static com.car_factory.assembled_cars.UniqueCarsStorage.getUniqueCarFromParkingLot;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.avaiilability_control_department.car_availability_control.CarAvailabilityControl.*;
import static com.car_factory.factory_office.order_department.IndividualOrder.SOLD_UNIQUE_CAR_KEY;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.getArchiveData;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;

public abstract class CarShipment {

    public static CityCar shipTheCityCar() throws IOException {
        checkCityCarAvailability();
        CityCar car = getCarFromParkingLot(CITY_CAR.getKey(), new CityCar());
        updateStatisticsArchive(CITY_CAR.getSoldCarKey(),car.getCarCounter());
        return car;
    }

    public static SportCar shipTheSportCar() throws IOException {
        checkSportCarAvailability();
        SportCar car = getCarFromParkingLot(SPORT_CAR.getKey(), new SportCar());
        updateStatisticsArchive(SPORT_CAR.getSoldCarKey(),car.getCarCounter());
        return car;
    }

    public static SUV shipSUVCar() throws IOException {
        checkSUVCarAvailability();
        SUV car = getCarFromParkingLot(SUV_CAR.getKey(), new SUV());
        updateStatisticsArchive(SUV_CAR.getSoldCarKey(),car.getCarCounter());
        return car;
    }

    public static WagonCar shipUniversalCar() throws IOException {
        checkWagonCarAvailability();
        WagonCar car = getCarFromParkingLot(WAGON_CAR.getKey(), new WagonCar());
        updateStatisticsArchive(WAGON_CAR.getSoldCarKey(),car.getCarCounter());
        return car;
    }

    public static UniqueCar shipUniqueCar(String orderName) throws IOException {
        UniqueCar uniqueCar = getUniqueCarFromParkingLot(orderName);
        int shippedCarsCounter = getArchiveData(SOLD_UNIQUE_CAR_KEY)[0];
        shippedCarsCounter++;
        updateStatisticsArchive(SOLD_UNIQUE_CAR_KEY,shippedCarsCounter);
        return uniqueCar;
    }
}
