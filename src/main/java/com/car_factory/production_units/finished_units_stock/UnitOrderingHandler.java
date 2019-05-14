package com.car_factory.production_units.finished_units_stock;

import com.car_factory.production_units.body_manufacturing.Body;
import com.car_factory.production_units.body_manufacturing.BodyColour;
import com.car_factory.production_units.body_manufacturing.BodySpecification;
import com.car_factory.production_units.engine_manufacturing.Engine;
import com.car_factory.production_units.engine_manufacturing.EngineSpecification;
import com.car_factory.production_units.interior_manufacturing.Interior;
import com.car_factory.production_units.interior_manufacturing.InteriorSpecification;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.Suspension;
import com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification;
import com.car_factory.production_units.transmission_manufacturing.Transmission;
import com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification;

import java.io.IOException;

import static com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.BodyAvailabilityController.*;
import static com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.EngineAvailabilityController.*;
import static com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.InteriorAvailabilityController.*;
import static com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.SuspensionAvailabilityController.*;
import static com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.TransmissionAvailabilityController.*;
import static com.car_factory.production_units.body_manufacturing.BodySpecification.*;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;
import static com.car_factory.production_units.finished_units_stock.MainStock.getUnitFromStock;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.*;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.*;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.*;

public abstract class UnitOrderingHandler {

    public static <T extends Body> T getBody(BodySpecification bodySpecification, T t, BodyColour bodyColour)
            throws IOException {
        switch (bodySpecification) {
            case S:
                sedanBodyAvailabilityControl();
                t = getUnitFromStock(S.getShortName(), t);
                break;
            case C:
                coupeBodyAvailabilityControl();
                t = getUnitFromStock(C.getShortName(), t);
                break;
            case SUV:
                suvBodyAvailabilityControl();
                t = getUnitFromStock(SUV.getShortName(), t);
                break;
            case SW:
                stationWagonBodyAvailabilityControl();
                t = getUnitFromStock(SW.getShortName(), t);
                break;
        }
        t.setBodyColour(bodyColour);
        return t;
    }

    public static <T extends Engine> T getEngine(EngineSpecification engineSpecification, T t)
            throws IOException {
        switch (engineSpecification) {
            case LPE:
                lowPowerEngineAvailabilityControl();
                t = getUnitFromStock(LPE.getShortName(), t);
                break;
            case MPE:
                mediumPowerEngineAvailabilityControl();
                t = getUnitFromStock(MPE.getShortName(), t);
                break;
            case HPE:
                highPowerEngineAvailabilityControl();
                t = getUnitFromStock(HPE.getShortName(), t);
                break;
            case HPDE:
                highPowerDieselEngineAvailabilityControl();
                t = getUnitFromStock(HPDE.getShortName(), t);
                break;
        }
        return t;
    }

    public static <T extends Transmission> T getTransmission(TransmissionSpecification transmissionSpecification, T t)
            throws IOException {
        switch (transmissionSpecification) {
            case SMT:
                standardTransmissionControl();
                t = getUnitFromStock(SMT.getShortName(), t);
                break;
            case AT:
                automaticTransmissionControl();
                t = getUnitFromStock(AT.getShortName(), t);
                break;
            case SAT:
                semiAutomaticTransmissionControl();
                t = getUnitFromStock(SAT.getShortName(), t);
                break;
            case HDMT:
                heavyDutyTransmissionControl();
                t = getUnitFromStock(HDMT.getShortName(), t);
                break;
        }
        return t;
    }

    public static <T extends Suspension> T getSuspension(SuspensionSpecification suspensionSpecification, T t)
            throws IOException {
        switch (suspensionSpecification) {
            case STDS:
                standardSuspensionControl();
                t = getUnitFromStock(STDS.getShortName(), t);
                break;
            case CTS:
                comfortSuspensionControl();
                t = getUnitFromStock(CTS.getShortName(), t);
                break;
            case STS:
                sportSuspensionControl();
                t = getUnitFromStock(STS.getShortName(), t);
                break;
            case ORS:
                offRoadSuspensionControl();
                t = getUnitFromStock(ORS.getShortName(), t);
                break;
        }
        return t;
    }

    public static <T extends Interior> T getInterior(InteriorSpecification interiorSpecification, T t)
            throws IOException {
        switch (interiorSpecification) {
            case STDI:
                standardInteriorAvailabilityControl();
                t = getUnitFromStock(STDI.getShortName(), t);
                break;
            case STI:
                sportInteriorAvailabilityControl();
                t = getUnitFromStock(STI.getShortName(), t);
                break;
            case WRI:
                wearResistantInteriorAvailabilityControl();
                t = getUnitFromStock(WRI.getShortName(), t);
                break;
        }
        return t;
    }

}

