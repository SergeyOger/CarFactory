package com.car_factory.production_units.interior_manufacturing;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.Serializable;

import static com.car_showroom.TextFormatter.getSeparator;
import static com.car_factory.production_units.interior_manufacturing.InteriorDescription.*;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSerialNumberFormatter;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSpecificationFormatter;

public abstract class Interior implements IUnitSpecification, Serializable {

    public static void setInteriorsDescription(int serialNumber, String interiorModel, String seatsMaterial, String upholsteryMaterial,
                                               String dashboardType) {
        getSeparator();
        getSerialNumberFormatter(INTERIOR_SERIAL_NUMBER.getName(),serialNumber);
        getSpecificationFormatter(INTERIOR_MODEL.getName(), interiorModel);
        getSpecificationFormatter(SEATS_MATERIAL.getName(), seatsMaterial);
        getSpecificationFormatter(UPHOLSTERY_MATERIAL.getName(), upholsteryMaterial);
        getSpecificationFormatter(DASHDOARD_TYPE.getName(), dashboardType);
        getSeparator();
    }

}
