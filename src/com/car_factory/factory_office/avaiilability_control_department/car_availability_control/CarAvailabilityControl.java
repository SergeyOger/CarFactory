package com.car_factory.factory_office.avaiilability_control_department.car_availability_control;

import com.car_factory.car_assembly_line.standart_cars.CityCar;
import com.car_factory.car_assembly_line.standart_cars.SUV;
import com.car_factory.car_assembly_line.standart_cars.SportCar;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.assembled_cars.StandardCarsStorage.openParkingDepartment;
import static com.car_factory.assembled_cars.StandardCarsStorage.updateParkingDepartment;
import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;

public abstract class CarAvailabilityControl {

    public static void checkCityCarAvailability() throws IOException {

        int minimumAmount = 4;
        int partySize = 30;
        int counter;
        LinkedList<CityCar> carParkingDepartment = openParkingDepartment(CITY_CAR.getKey());

        if (carParkingDepartment.size() < minimumAmount) {
            if (carParkingDepartment.isEmpty()) {
                counter = 0;
            } else {
                counter = carParkingDepartment.getLast().getCarCounter();
            }
            for (int i = 0; i < partySize; i++) {
                CityCar cityCar = new CityCar();
                cityCar.assembleCar();
                counter++;
                cityCar.setCounter(counter);
                carParkingDepartment.addLast(cityCar);
            }
            updateStatisticsArchive(CITY_CAR.getKey(), carParkingDepartment.getLast().getCarCounter());
            updateParkingDepartment(CITY_CAR.getKey(), carParkingDepartment);
        }
    }

    public static void checkSportCarAvailability() throws IOException {

        int minimumAmount = 2;
        int partySize = 20;
        int counter;
        LinkedList<SportCar> carParkingDepartment = openParkingDepartment(SPORT_CAR.getKey());

        if (carParkingDepartment.size() < minimumAmount) {
            if (carParkingDepartment.isEmpty()) {
                counter = 0;
            } else {
                counter = carParkingDepartment.getLast().getCarCounter();
            }
            for (int i = 0; i < partySize; i++) {
                SportCar sportCar = new SportCar();
                sportCar.assembleCar();
                counter++;
                sportCar.setCounter(counter);
                carParkingDepartment.addLast(sportCar);
            }
            updateStatisticsArchive(SPORT_CAR.getKey(), carParkingDepartment.getLast().getCarCounter());
            updateParkingDepartment(SPORT_CAR.getKey(), carParkingDepartment);
        }
    }

    public static void checkSUVCarAvailability() throws IOException {

        int minimumAmount = 3;
        int partySize = 25;
        int counter;
        LinkedList<SUV> carParkingDepartment = openParkingDepartment(SUV_CAR.getKey());

        if (carParkingDepartment.size() < minimumAmount) {
            if (carParkingDepartment.isEmpty()) {
                counter = 0;
            } else {
                counter = carParkingDepartment.getLast().getCarCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SUV suv = new SUV();
                suv.assembleCar();
                suv.setCounter(counter);
                carParkingDepartment.addLast(suv);
            }
            updateStatisticsArchive(SUV_CAR.getKey(), carParkingDepartment.getLast().getCarCounter());
            updateParkingDepartment(SUV_CAR.getKey(), carParkingDepartment);
        }
    }
}
