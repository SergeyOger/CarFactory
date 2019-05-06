package com.car_factory.production_units.transmission_manufacturing;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.Serializable;

import static com.car_showroom.TextFormatter.getSeparator;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSerialNumberFormatter;
import static com.car_factory.production_units.specification_formating.UnitSpecificationFormatting.getSpecificationFormatter;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionDescription.*;

public abstract class Transmission implements IUnitSpecification, Serializable {

    public static void setTransmissionDescription(int serialNumber, String transmissionModel, String transmissionType,
                                                  int numberOfGears, String typeOfDrive) {
        getSeparator();
        getSerialNumberFormatter(TRANSMISSION_SERIAL_NUMBER.getValue(),serialNumber);
        getSpecificationFormatter(TRANSMISSION_MODEL.getValue(), transmissionModel);
        getSpecificationFormatter(TRANSMISSION_TYPE.getValue(), transmissionType);
        getSpecificationFormatter(NUMBER_OF_GEARS.getValue(), numberOfGears);
        getSpecificationFormatter(TYPE_OF_DRIVE.getValue(), typeOfDrive);
        getSeparator();

    }

    public abstract String getTransmissionType();

    public abstract int getNumberOfGears();

    public abstract String getTypeOfDrive();

}
