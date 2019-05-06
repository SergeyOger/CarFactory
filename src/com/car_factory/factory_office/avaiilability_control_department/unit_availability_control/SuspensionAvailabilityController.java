package com.car_factory.factory_office.avaiilability_control_department.unit_availability_control;

import com.car_factory.production_units.suspension_manufacturing.ComfortSuspension;
import com.car_factory.production_units.suspension_manufacturing.OffRoadSuspension;
import com.car_factory.production_units.suspension_manufacturing.SportSuspension;
import com.car_factory.production_units.suspension_manufacturing.StandardSuspension;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.finished_units_stock.MainStock.openUnitDepartment;
import static com.car_factory.production_units.finished_units_stock.MainStock.updateDepartmentState;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.*;

public abstract class SuspensionAvailabilityController {

    public static void standardSuspensionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<StandardSuspension> standardSuspensions = openUnitDepartment(STDS.getShortName());

        if (standardSuspensions.size() < minimumAmount) {
            if (standardSuspensions.isEmpty()) {
                counter = 0;
            } else {
                counter = standardSuspensions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                StandardSuspension standardSuspension = new StandardSuspension();
                standardSuspension.setCounter(counter);
                standardSuspensions.addLast(standardSuspension);
            }
            updateDepartmentState(STDS.getShortName(), standardSuspensions);
            updateStatisticsArchive(STDS.getArchiveKey(), standardSuspensions.getLast().getCounter());
        }
    }

    public static void comfortSuspensionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 30;
        int counter;
        LinkedList<ComfortSuspension> comfortSuspensions = openUnitDepartment(CTS.getShortName());

        if (comfortSuspensions.size() < minimumAmount) {
            if (comfortSuspensions.isEmpty()) {
                counter = 0;
            } else {
                counter = comfortSuspensions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                ComfortSuspension comfortSuspension = new ComfortSuspension();
                comfortSuspension.setCounter(counter);
                comfortSuspensions.addLast(comfortSuspension);
            }
            updateDepartmentState(CTS.getShortName(), comfortSuspensions);
            updateStatisticsArchive(CTS.getArchiveKey(), comfortSuspensions.getLast().getCounter());
        }
    }

    public static void sportSuspensionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<SportSuspension> sportSuspensions = openUnitDepartment(STS.getShortName());

        if (sportSuspensions.size() < minimumAmount) {
            if (sportSuspensions.isEmpty()) {
                counter = 0;
            } else {
                counter = sportSuspensions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SportSuspension sportSuspension = new SportSuspension();
                sportSuspension.setCounter(counter);
                sportSuspensions.addLast(sportSuspension);
            }
            updateDepartmentState(STS.getShortName(), sportSuspensions);
            updateStatisticsArchive(STS.getArchiveKey(), sportSuspensions.getLast().getCounter());
        }
    }

    public static void offRoadSuspensionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 40;
        int counter;
        LinkedList<OffRoadSuspension> offRoadSuspensions = openUnitDepartment(ORS.getShortName());

        if (offRoadSuspensions.size() < minimumAmount) {
            if (offRoadSuspensions.isEmpty()) {
                counter = 0;
            } else {
                counter = offRoadSuspensions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                OffRoadSuspension offRoadSuspension = new OffRoadSuspension();
                offRoadSuspension.setCounter(counter);
                offRoadSuspensions.addLast(offRoadSuspension);
            }
            updateDepartmentState(ORS.getShortName(), offRoadSuspensions);
            updateStatisticsArchive(ORS.getArchiveKey(), offRoadSuspensions.getLast().getCounter());
        }
    }
}
