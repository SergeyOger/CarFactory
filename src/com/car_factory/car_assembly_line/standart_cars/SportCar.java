package com.car_factory.car_assembly_line.standart_cars;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.production_units.body_manufacturing.CoupeBody;
import com.car_factory.production_units.engine_manufacturing.HighPowerEngine;
import com.car_factory.production_units.interior_manufacturing.SportInterior;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.SportSuspension;
import com.car_factory.production_units.transmission_manufacturing.SemiAutomaticTransmission;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;

import static com.car_factory.car_assembly_line.standart_cars.StandardCars.SPORT_CAR;
import static com.car_factory.production_units.body_manufacturing.BodyColour.ORANGE;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.C;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.HPE;
import static com.car_factory.production_units.finished_units_stock.UnitOrderingHandler.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.STI;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.STS;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.SAT;

public class SportCar implements ICarAssemlyLine, Serializable {

    private static String carModel = SPORT_CAR.getCarModel();
    private LinkedHashSet sportCar = new LinkedHashSet();
    private int sportCarCounter;

    @Override
    public void setCounter(int counter) {
        this.sportCarCounter = counter;
    }

    @Override
    public int getCarCounter() {
        return sportCarCounter;
    }

    @Override
    public void assembleCar() throws IOException {
        sportCar.add(getBody(C, new CoupeBody(), ORANGE));
        sportCar.add(getEngine(HPE, new HighPowerEngine()));
        sportCar.add(getTransmission(SAT, new SemiAutomaticTransmission()));
        sportCar.add(getSuspension(STS, new SportSuspension()));
        sportCar.add(getInterior(STI, new SportInterior()));
    }

    @Override
    public <T extends IUnitSpecification> void getCarSpecification() {
        System.out.println(carModel);
        System.out.println("Car serial number: " + String.format("%06d", sportCarCounter));
        for (Object o : sportCar) {
            ((T) o).getSpecification();
        }
    }
}
