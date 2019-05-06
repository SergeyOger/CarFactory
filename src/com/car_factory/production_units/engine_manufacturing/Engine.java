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
        getSerialNumberFormatter(ENGINE_SERIAL_NUMBER.getName(),serialNumber);
        getSpecificationFormatter(ENGINE_MODEL.getName(), engineModel);
        getSpecificationFormatter(ENGINE_VOLUME.getName(), engineVolume);
        getSpecificationFormatter(CYLINDERS_NUMBER.getName(), cilindersNumber);
        getSpecificationFormatter(FUEL_TYPE.getName(), fuelType);
        getSpecificationFormatter(FUEL_MARK.getName(), fuelMark);
        getSpecificationFormatter(ENGINE_POWER.getName(), enginePower);
        getSeparator();
    }
}
