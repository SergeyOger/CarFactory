package com.car_factory.car_assembly_line;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.IOException;

public interface ICarAssemlyLine {

    void setCounter(int counter);

    int getCarCounter();

    void assembleCar() throws IOException;

    <T extends IUnitSpecification> void getCarSpecification();

}
