package com.car_factory.car_assembly_line.standart_cars;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.production_units.body_manufacturing.SedanBody;
import com.car_factory.production_units.engine_manufacturing.LowPowerEngine;
import com.car_factory.production_units.interior_manufacturing.StandartInterior;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.StandardSuspension;
import com.car_factory.production_units.transmission_manufacturing.StandardTransmission;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.CITY_CAR;
import static com.car_factory.production_units.body_manufacturing.BodyColour.SILVER;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.S;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.LPE;
import static com.car_factory.production_units.finished_units_stock.UnitOrderingHandler.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STDI;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.STDS;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.SMT;

public class CityCar implements ICarAssemlyLine, Serializable {

    private static String carModel = CITY_CAR.getCarModel();
    private int cityCarCounter;
    private LinkedHashSet cityCar = new LinkedHashSet();

    @Override
    public void setCounter(int counter) {
        this.cityCarCounter = counter;
    }

    @Override
    public int getCarCounter() {
        return cityCarCounter;
    }

    @Override
    public void assembleCar() throws IOException {
        cityCar.add(getBody(S, new SedanBody(), SILVER));
        cityCar.add(getEngine(LPE, new LowPowerEngine()));
        cityCar.add(getTransmission(SMT, new StandardTransmission()));
        cityCar.add(getSuspension(STDS, new StandardSuspension()));
        cityCar.add(getInterior(STDI, new StandartInterior()));
    }

    @Override
    public <T extends IUnitSpecification> void getCarSpecification() {
        System.out.println(carModel);
        System.out.println("Car serial number: " + String.format("%06d", cityCarCounter));
        for (Object o : cityCar) {
            ((T) o).getSpecification();
        }
    }
}

