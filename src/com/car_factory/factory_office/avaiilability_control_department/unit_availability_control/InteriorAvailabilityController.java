package com.car_factory.factory_office.avaiilability_control_department.unit_availability_control;

import com.car_factory.production_units.interior_manufacturing.SportInterior;
import com.car_factory.production_units.interior_manufacturing.StandartInterior;
import com.car_factory.production_units.interior_manufacturing.WearResistantInterior;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.finished_units_stock.MainStock.openUnitDepartment;
import static com.car_factory.production_units.finished_units_stock.MainStock.updateDepartmentState;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.*;

public abstract class InteriorAvailabilityController {

    public static void standardInteriorAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<StandartInterior> standardInteriors = openUnitDepartment(STDI.getShortName());

        if (standardInteriors.size() < minimumAmount) {
            if (standardInteriors.isEmpty()) {
                counter = 0;
            } else {
                counter = standardInteriors.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                StandartInterior standartInterior = new StandartInterior();
                standartInterior.setCounter(counter);
                standardInteriors.addLast(standartInterior);
            }
            updateDepartmentState(STDI.getShortName(), standardInteriors);
            updateStatisticsArchive(STDI.getArchiveKey(), standardInteriors.getLast().getCounter());
        }
    }

    public static void sportInteriorAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 30;
        int counter;
        LinkedList<SportInterior> sportInteriors = openUnitDepartment(STI.getShortName());

        if (sportInteriors.size() < minimumAmount) {
            if (sportInteriors.isEmpty()) {
                counter = 0;
            } else {
                counter = sportInteriors.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SportInterior sportInterior = new SportInterior();
                sportInterior.setCounter(counter);
                sportInteriors.addLast(sportInterior);
            }
            updateDepartmentState(STI.getShortName(), sportInteriors);
            updateStatisticsArchive(STI.getArchiveKey(), sportInteriors.getLast().getCounter());
        }
    }

    public static void wearResistantInteriorAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<WearResistantInterior> wearResistantInteriors = openUnitDepartment(WRI.getShortName());

        if (wearResistantInteriors.size() < minimumAmount) {
            if (wearResistantInteriors.isEmpty()) {
                counter = 0;
            } else {
                counter = wearResistantInteriors.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                WearResistantInterior wearResistantInterior = new WearResistantInterior();
                wearResistantInterior.setCounter(counter);
                wearResistantInteriors.addLast(wearResistantInterior);
            }
            updateDepartmentState(WRI.getShortName(), wearResistantInteriors);
            updateStatisticsArchive(WRI.getArchiveKey(), wearResistantInteriors.getLast().getCounter());
        }
    }
}
