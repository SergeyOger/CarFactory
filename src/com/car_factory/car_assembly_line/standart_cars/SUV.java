package com.car_factory.car_assembly_line.standart_cars;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.production_units.body_manufacturing.SUVBody;
import com.car_factory.production_units.engine_manufacturing.HighPowerDieselEngine;
import com.car_factory.production_units.interior_manufacturing.WearResistantInterior;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.OffRoadSuspension;
import com.car_factory.production_units.transmission_manufacturing.HeavyDutyTransmission;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.SUV_CAR;
import static com.car_factory.production_units.body_manufacturing.BodyColour.BLACK;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.SUV;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPDE;
import static com.car_factory.production_units.finished_units_stock.UnitOrderingHandler.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.WRI;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.ORS;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.HDMT;

public class SUV implements ICarAssemlyLine, Serializable {

    private static String carModel = SUV_CAR.getCarModel();
    private LinkedHashSet suv = new LinkedHashSet();
    private int suvCarCounter;

    @Override
    public void setCounter(int counter) {
        this.suvCarCounter = counter;
    }

    @Override
    public int getCarCounter() {
        return suvCarCounter;
    }

    @Override
    public void assembleCar() throws IOException {
        suv.add(getBody(SUV, new SUVBody(),BLACK));
        suv.add(getEngine(HPDE, new HighPowerDieselEngine()));
        suv.add(getTransmission(HDMT, new HeavyDutyTransmission()));
        suv.add(getSuspension(ORS, new OffRoadSuspension()));
        suv.add(getInterior(WRI, new WearResistantInterior()));
    }

    @Override
    public <T extends IUnitSpecification> void getCarSpecification() {

        System.out.println(carModel);
        System.out.println("Car serial number: " + String.format("%06d", suvCarCounter));
        for (Object o : suv) {
            ((T) o).getSpecification();
        }
    }
}
