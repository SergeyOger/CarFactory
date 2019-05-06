package com.car_factory.factory_office.statistics_department;

import java.io.IOException;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.*;
import static com.car_factory.factory_office.statistics_department.StatisticsArchive.getArchiveData;
import static com.car_factory.factory_office.statistics_department.TextFormatting.configureTableColumns;
import static com.car_factory.factory_office.statistics_department.TextFormatting.setTheTableLine;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;

public abstract class ProductionStatistics {

    public static void showVehicleStatistics() throws IOException {
        int[] producedCars = getArchiveData(CITY_CAR.getKey(), SUV_CAR.getKey(), SPORT_CAR.getKey());
        setTheTableLine();
        configureTableColumns(CITY_CAR.getCarModel(), producedCars[0], SPORT_CAR.getCarModel(), producedCars[2]);
        configureTableColumns(SUV_CAR.getCarModel(), producedCars[1]);
        setTheTableLine();
    }

    public static void showProducedEnginesStatistics() throws IOException {
        int[] producedEngines = getArchiveData(LPE.getArchiveKey(), MPE.getArchiveKey(), HPE.getArchiveKey(),
                HPDE.getArchiveKey());
        setTheTableLine();
        configureTableColumns(LPE.getName(),producedEngines[0],MPE.getName(),producedEngines[1]);
        configureTableColumns(HPE.getName(),producedEngines[2],HPDE.getName(),producedEngines[3]);
        setTheTableLine();

    }


}
