package com;

import com.car_factory.factory_office.statistics_department.ProductionStatistics;

import java.io.IOException;
import java.util.Arrays;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.statistics_department.ProductionStatistics.showProducedEnginesStatistics;
import static com.car_factory.factory_office.statistics_department.ProductionStatistics.showVehicleStatistics;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.getArchiveData;


public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showVehicleStatistics();
        showProducedEnginesStatistics();
    }


}
