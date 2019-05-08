package com.car_factory.factory_office.avaiilability_control_department.unit_availability_control;

import com.car_factory.production_units.body_manufacturing.CoupeBody;
import com.car_factory.production_units.body_manufacturing.SUVBody;
import com.car_factory.production_units.body_manufacturing.SedanBody;
import com.car_factory.production_units.body_manufacturing.StationWagon;

import java.io.IOException;
import java.util.LinkedList;

import static com.car_factory.factory_office.statistics_department.StatisticsArchive.updateStatisticsArchive;
import static com.car_factory.production_units.body_manufacturing.BodyColour.PRIMER_PAINTING;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.*;
import static com.car_factory.production_units.finished_units_stock.MainStock.openUnitDepartment;
import static com.car_factory.production_units.finished_units_stock.MainStock.updateDepartmentState;

public abstract class BodyAvailabilityController {

    public static void sedanBodyAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 80;
        int counter;
        LinkedList<SedanBody> sedanBodies = openUnitDepartment(S.getShortName());

        if (sedanBodies.size() < minimumAmount) {
            if (sedanBodies.isEmpty()) {
                counter = 0;
            } else {
                counter = sedanBodies.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SedanBody sedanBody = new SedanBody(PRIMER_PAINTING);
                sedanBody.setCounter(counter);
                sedanBodies.addLast(sedanBody);
            }
            updateDepartmentState(S.getShortName(), sedanBodies);
            updateStatisticsArchive(S.getArchiveKey(), sedanBodies.getLast().getCounter());
        }
    }

    public static void coupeBodyAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 30;
        int counter;
        LinkedList<CoupeBody> coupeBodies = openUnitDepartment(C.getShortName());

        if (coupeBodies.size() < minimumAmount) {
            if (coupeBodies.isEmpty()) {
                counter = 0;
            } else {
                counter = coupeBodies.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                CoupeBody coupeBody = new CoupeBody(PRIMER_PAINTING);
                coupeBody.setCounter(counter);
                coupeBodies.addLast(coupeBody);
            }
            updateDepartmentState(C.getShortName(), coupeBodies);
            updateStatisticsArchive(C.getArchiveKey(), coupeBodies.getLast().getCounter());
        }
    }

    public static void suvBodyAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 50;
        int counter;
        LinkedList<SUVBody> suvBodies = openUnitDepartment(SUV.getShortName());

        if (suvBodies.size() < minimumAmount) {
            if (suvBodies.isEmpty()) {
                counter = 0;
            } else {
                counter = suvBodies.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                SUVBody suvBody = new SUVBody(PRIMER_PAINTING);
                suvBody.setCounter(counter);
                suvBodies.addLast(suvBody);
            }
            updateDepartmentState(SUV.getShortName(), suvBodies);
            updateStatisticsArchive(SUV.getArchiveKey(), suvBodies.getLast().getCounter());
        }
    }

    public static void stationWagonBodyAvailabilityControl() throws IOException {

        int minimumAmount = 3;
        int partySize = 60;
        int counter;
        LinkedList<StationWagon> stationWagonBodies = openUnitDepartment(SW.getShortName());

        if (stationWagonBodies.size() < minimumAmount) {
            if (stationWagonBodies.isEmpty()) {
                counter = 0;
            } else {
                counter = stationWagonBodies.getLast().getCounter();
            }
            for (int i = 0; i < partySize; i++) {
                counter++;
                StationWagon stationWagon = new StationWagon(PRIMER_PAINTING);
                stationWagon.setCounter(counter);
                stationWagonBodies.addLast(stationWagon);
            }
            updateDepartmentState(SW.getShortName(), stationWagonBodies);
            updateStatisticsArchive(SW.getArchiveKey(), stationWagonBodies.getLast().getCounter());
        }
    }
}
