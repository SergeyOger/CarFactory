package com.car_factory.production_units.body_manufacturing;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.Serializable;

import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSeparator;
import static com.car_factory.production_units.body_manufacturing.BodyDescription.*;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSerialNumberFormatter;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSpecificationFormatter;

public abstract class Body implements IUnitSpecification, Serializable {

    public static void setBodiesDescription(int serialNumber, String bodyModel, String bodyType, String bodyMaterial,
                                            BodyColour bodyColour, int numberOfSeats, int numberOfDoors) {
        getSeparator();
        getSerialNumberFormatter(BODY_SERIAL_NUMBER.getName(),serialNumber);
        getSpecificationFormatter(BODY_MODEL.getName(), bodyModel);
        getSpecificationFormatter(BODY_TYPE.getName(), bodyType);
        getSpecificationFormatter(BODY_MATRIAL.getName(), bodyMaterial);
        getSpecificationFormatter(BODY_COLOUR.getName(), bodyColour.getColour());
        getSpecificationFormatter(NUMBER_OF_DOORS.getName(), numberOfDoors);
        getSpecificationFormatter(NUMBER_OF_SEATS.getName(), numberOfSeats);
        getSeparator();

    }

    public abstract void setBodyColour(BodyColour bodyColour);

}
