package com.car_factory.car_assembly_line.standart_cars;

public enum StandardCars {

    CITY_CAR("CITY_CAR", "Car model : City car"),
    SPORT_CAR("SPORT_CAR", "Car model : Sport car"),
    SUV_CAR("SUV_CAR", "Car model : SUV car");

    private String key;
    private String carModel;

    StandardCars(String key, String carModel) {
        this.key = key;
        this.carModel = carModel;
    }

    public String getKey() {
        return key;
    }

    public String getCarModel() {
        return carModel;
    }
}
