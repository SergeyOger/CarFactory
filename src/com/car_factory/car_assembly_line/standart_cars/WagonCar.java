package com.car_factory.car_assembly_line.standart_cars;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.production_units.body_manufacturing.StationWagon;
import com.car_factory.production_units.engine_manufacturing.MediumPowerEngine;
import com.car_factory.production_units.interior_manufacturing.StandartInterior;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.ComfortSuspension;
import com.car_factory.production_units.transmission_manufacturing.AutomaticTransmission;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.WAGON_CAR;
import static com.car_factory.production_units.body_manufacturing.BodyColour.BLUE;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.SW;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.MPE;
import static com.car_factory.production_units.finished_units_stock.UnitOrderingHandler.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STDI;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STI;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.CTS;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.AT;

public class WagonCar implements ICarAssemlyLine, Serializable {

    private static String carModel = WAGON_CAR.getCarModel();
    private int stationWagonCarCounter;
    private LinkedHashSet stationWagon = new LinkedHashSet();

    @Override
    public void setCounter(int counter) {
        stationWagonCarCounter = counter;
    }

    @Override
    public int getCarCounter() {
        return stationWagonCarCounter;
    }

    @Override
    public void assembleCar() throws IOException {
        stationWagon.add(getBody(SW, new StationWagon(), BLUE));
        stationWagon.add(getEngine(MPE, new MediumPowerEngine()));
        stationWagon.add(getTransmission(AT, new AutomaticTransmission()));
        stationWagon.add(getSuspension(CTS, new ComfortSuspension()));
        stationWagon.add(getInterior(STDI, new StandartInterior()));
    }

    @Override
    public <T extends IUnitSpecification> void getCarSpecification() {
        System.out.println(carModel);
        System.out.println("Car serial number: " + String.format("%06d", stationWagonCarCounter));
        for (Object o : stationWagon) {
            ((T) o).getSpecification();
        }
    }
}
