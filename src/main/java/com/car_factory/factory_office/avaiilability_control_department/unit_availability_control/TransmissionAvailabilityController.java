package com.car_factory.factory_office.avaiilability_control_department.unit_availability_control;

import com.car_factory.production_units.transmission_manufacturing.AutomaticTransmission;
import com.car_factory.production_units.transmission_manufacturing.HeavyDutyTransmission;
import com.car_factory.production_units.transmission_manufacturing.SemiAutomaticTransmission;
import com.car_factory.production_units.transmission_manufacturing.StandardTransmission;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.finished_units_stock.MainStock.openUnitDepartment;
import static com.car_factory.production_units.finished_units_stock.MainStock.updateDepartmentState;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.*;

public abstract class TransmissionAvailabilityController {

    public static void standardTransmissionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 75;
        int counter;
        LinkedList<StandardTransmission> standardTransmissions = openUnitDepartment(SMT.getShortName());

        if (standardTransmissions.size() < minimumAmount) {
            if (standardTransmissions.isEmpty()) {
                counter = 0;
            } else {
                counter = standardTransmissions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                StandardTransmission standardTransmission = new StandardTransmission();
                standardTransmission.setCounter(counter);
                standardTransmissions.addLast(standardTransmission);
            }
            updateDepartmentState(SMT.getShortName(), standardTransmissions);
            updateStatisticsArchive(SMT.getArchiveKey(), standardTransmissions.getLast().getCounter());
        }
    }

    public static void automaticTransmissionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 65;
        int counter;
        LinkedList<AutomaticTransmission> automaticTransmissions = openUnitDepartment(AT.getShortName());

        if (automaticTransmissions.size() < minimumAmount) {
            if (automaticTransmissions.isEmpty()) {
                counter = 0;
            } else {
                counter = automaticTransmissions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                AutomaticTransmission automaticTransmission = new AutomaticTransmission();
                automaticTransmission.setCounter(counter);
                automaticTransmissions.addLast(automaticTransmission);
            }
            updateDepartmentState(AT.getShortName(), automaticTransmissions);
            updateStatisticsArchive(AT.getArchiveKey(), automaticTransmissions.getLast().getCounter());
        }
    }

    public static void semiAutomaticTransmissionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 24;
        int counter;
        LinkedList<SemiAutomaticTransmission> semiAutomaticTransmissions = openUnitDepartment(SAT.getShortName());

        if (semiAutomaticTransmissions.size() < minimumAmount) {
            if (semiAutomaticTransmissions.isEmpty()) {
                counter = 0;
            } else {
                counter = semiAutomaticTransmissions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SemiAutomaticTransmission semiAutomaticTransmission = new SemiAutomaticTransmission();
                semiAutomaticTransmission.setCounter(counter);
                semiAutomaticTransmissions.addLast(semiAutomaticTransmission);
            }
            updateDepartmentState(SAT.getShortName(), semiAutomaticTransmissions);
            updateStatisticsArchive(SAT.getArchiveKey(), semiAutomaticTransmissions.getLast().getCounter());
        }
    }

    public static void heavyDutyTransmissionControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 41;
        int counter;
        LinkedList<HeavyDutyTransmission> heavyDutyTransmissions = openUnitDepartment(HDMT.getShortName());

        if (heavyDutyTransmissions.size() < minimumAmount) {
            if (heavyDutyTransmissions.isEmpty()) {
                counter = 0;
            } else {
                counter = heavyDutyTransmissions.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                HeavyDutyTransmission heavyDutyTransmission = new HeavyDutyTransmission();
                heavyDutyTransmission.setCounter(counter);
                heavyDutyTransmissions.addLast(heavyDutyTransmission);
            }
            updateDepartmentState(HDMT.getShortName(), heavyDutyTransmissions);
            updateStatisticsArchive(HDMT.getArchiveKey(), heavyDutyTransmissions.getLast().getCounter());
        }
    }
}
