package com.car_factory.car_assembly_line.standart_cars;

public enum StandardCars {

    CITY_CAR("CITY_CAR", "Car model : City car","SOLD_CITY_CAR"),
    SPORT_CAR("SPORT_CAR", "Car model : Sport car","SOLD_SPORT_CAR"),
    SUV_CAR("SUV_CAR", "Car model : SUV car","SOLD_SUV_CAR"),
    WAGON_CAR("WAGON_CAR","Car model : Station wagon","SOLD_WAGON_CAR");

    private String key;
    private String carModel;
    private String soldCarKey;

    StandardCars(String key, String carModel, String soldCarKey) {
        this.key = key;
        this.carModel = carModel;
        this.soldCarKey = soldCarKey;
    }

    public String getKey() {
        return key;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getSoldCarKey() {
        return soldCarKey;
    }
}
