package com.car_factory.production_units.engine_manufacturing;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.Serializable;

import static com.car_showroom.TextFormatter.getSeparator;
import static com.car_factory.production_units.engine_manufacturing.EngineDescription.*;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSerialNumberFormatter;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSpecificationFormatter;

public abstract class Engine implements IUnitSpecification, Serializable {

    public static void setEngineDescription(int serialNumber, String engineModel, double engineVolume, int cilindersNumber,
                                            String fuelType, String fuelMark, int enginePower) {
        getSeparator();
        getSerialNumberFormatter(ENGINE_SERIAL_NUMBER.getValue(),serialNumber);
        getSpecificationFormatter(ENGINE_MODEL.getValue(), engineModel);
        getSpecificationFormatter(ENGINE_VOLUME.getValue(), engineVolume);
        getSpecificationFormatter(CILINDERS_NUMBER.getValue(), cilindersNumber);
        getSpecificationFormatter(FUEL_TYPE.getValue(), fuelType);
        getSpecificationFormatter(FUEL_MARK.getValue(), fuelMark);
        getSpecificationFormatter(ENGINE_POWER.getValue(), enginePower);
        getSeparator();
    }

    public abstract double getEngineVolume();

    public abstract int getCilindersNumber();

    public abstract String getFuelType();

    public abstract String getFuelMark();

    public abstract int getEnginePower();

}
