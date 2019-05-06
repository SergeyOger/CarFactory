package com.car_factory.factory_office.avaiilability_control_department.unit_availability_control;

import com.car_factory.production_units.engine_manufacturing.HighPowerDieselEngine;
import com.car_factory.production_units.engine_manufacturing.HighPowerEngine;
import com.car_factory.production_units.engine_manufacturing.LowPowerEngine;
import com.car_factory.production_units.engine_manufacturing.MediumPowerEngine;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;
import static com.car_factory.production_units.finished_units_stock.MainStock.openUnitDepartment;
import static com.car_factory.production_units.finished_units_stock.MainStock.updateDepartmentState;

public abstract class EngineAvailabilityController {

    public static void lowPowerEngineAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 30;
        int counter;
        LinkedList<LowPowerEngine> lowPowerEngines = openUnitDepartment(LPE.getShortName());

        if (lowPowerEngines.size() < minimumAmount) {
            if (lowPowerEngines.isEmpty()) {
                counter = 0;
            } else {
                counter = lowPowerEngines.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                LowPowerEngine lowPowerEngine = new LowPowerEngine();
                lowPowerEngine.setCounter(counter);
                lowPowerEngines.addLast(lowPowerEngine);
            }
            updateDepartmentState(LPE.getShortName(), lowPowerEngines);
            updateStatisticsArchive(LPE.getArchiveKey(), lowPowerEngines.getLast().getCounter());
        }
    }

    public static void mediumPowerEngineAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 20;
        int counter;
        LinkedList<MediumPowerEngine> mediumPowerEngines = openUnitDepartment(MPE.getShortName());

        if (mediumPowerEngines.size() < minimumAmount) {
            if (mediumPowerEngines.isEmpty()) {
                counter = 0;
            } else {
                counter = mediumPowerEngines.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                MediumPowerEngine mediumPowerEngine = new MediumPowerEngine();
                mediumPowerEngine.setCounter(counter);
                mediumPowerEngines.addLast(mediumPowerEngine);
            }
            updateDepartmentState(MPE.getShortName(), mediumPowerEngines);
            updateStatisticsArchive(MPE.getArchiveKey(), mediumPowerEngines.getLast().getCounter());
        }
    }

    public static void highPowerEngineAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<HighPowerEngine> highPowerEngines = openUnitDepartment(HPE.getShortName());

        if (highPowerEngines.size() < minimumAmount) {
            if (highPowerEngines.isEmpty()) {
                counter = 0;
            } else {
                counter = highPowerEngines.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                HighPowerEngine highPowerEngine = new HighPowerEngine();
                highPowerEngine.setCounter(counter);
                highPowerEngines.addLast(highPowerEngine);
            }
            updateDepartmentState(HPE.getShortName(), highPowerEngines);
            updateStatisticsArchive(HPE.getArchiveKey(), highPowerEngines.getLast().getCounter());
        }
    }

    public static void highPowerDieselEngineAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 15;
        int counter;
        LinkedList<HighPowerDieselEngine> highPowerDieselEngines = openUnitDepartment(HPDE.getShortName());

        if (highPowerDieselEngines.size() < minimumAmount) {
            if (highPowerDieselEngines.isEmpty()) {
                counter = 0;
            } else {
                counter = highPowerDieselEngines.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                HighPowerDieselEngine highPowerDieselEngine = new HighPowerDieselEngine();
                highPowerDieselEngine.setCounter(counter);
                highPowerDieselEngines.addLast(highPowerDieselEngine);
            }
            updateDepartmentState(HPDE.getShortName(), highPowerDieselEngines);
            updateStatisticsArchive(HPDE.getArchiveKey(), highPowerDieselEngines.getLast().getCounter());
        }
    }
}
