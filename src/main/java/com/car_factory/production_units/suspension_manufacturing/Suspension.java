package com.car_factory.production_units.suspension_manufacturing;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.Serializable;

import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSeparator;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSerialNumberFormatter;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSpecificationFormatter;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionDescription.*;

public abstract class Suspension implements IUnitSpecification, Serializable {

    public static void setSuspensionsDescription(int serialNumber, String suspensionModel, String comphortLevel,
                                                 int clearense, int suspensionTreavel) {
        getSeparator();
        getSerialNumberFormatter(SUSPENSION_SERIAL_NUMBER.getName(),serialNumber);
        getSpecificationFormatter(SUSPENSION_MODEL.getName(), suspensionModel);
        getSpecificationFormatter(COMFORT_LEVEL.getName(), comphortLevel);
        getSpecificationFormatter(CLEARANCE.getName(), clearense);
        getSpecificationFormatter(SUSPENSION_TRAVEL.getName(), suspensionTreavel);
        getSeparator();
    }

}

