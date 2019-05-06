package com.car_factory.car_assembly_line.unique_car;

import com.car_factory.car_assembly_line.ICarAssemlyLine;
import com.car_factory.production_units.body_manufacturing.*;
import com.car_factory.production_units.engine_manufacturing.*;
import com.car_factory.production_units.interior_manufacturing.*;
import com.car_factory.production_units.specification_formating.IUnitSpecification;
import com.car_factory.production_units.suspension_manufacturing.*;
import com.car_factory.production_units.transmission_manufacturing.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashSet;

import static com.car_factory.production_units.body_manufacturing.BodySpecification.*;
import static com.car_factory.production_units.engine_manufacturing.EngineSpecification.*;
import static com.car_factory.production_units.finished_units_stock.UnitOrderingHandler.*;
import static com.car_factory.production_units.interior_manufacturing.InteriorSpecification.*;
import static com.car_factory.production_units.suspension_manufacturing.SuspensionSpecification.*;
import static com.car_factory.production_units.transmission_manufacturing.TransmissionSpecification.*;


public class UniqueCar implements ICarAssemlyLine, Serializable {

    private static String orderNameTitle = "Order name : ";
    private static String orderNumberTitle = "Individual order number : ";
    private String orderName;
    private int uniqueCarCounter;
    BodySpecification bodyType;
    BodyColour bodyColour;
    EngineSpecification engineType;
    TransmissionSpecification transmissionType;
    SuspensionSpecification suspensionType;
    InteriorSpecification interiorType;
    private LinkedHashSet uniqueCar = new LinkedHashSet();

    public UniqueCar(String orderName) {
        this.orderName = orderName;
    }

    public void setBodyType(BodySpecification bodyType) {
        this.bodyType = bodyType;
    }

    public void setBodyColour(BodyColour bodyColour) {
        this.bodyColour = bodyColour;
    }

    public void setEngineType(EngineSpecification engineType) {
        this.engineType = engineType;
    }

    public void setTransmissionType(TransmissionSpecification transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setSuspensionType(SuspensionSpecification suspensionType) {
        this.suspensionType = suspensionType;
    }

    public void setInteriorType(InteriorSpecification interiorType) {
        this.interiorType = interiorType;
    }

    private static Engine installEngine(EngineSpecification engineSpecification) throws IOException {
        Engine engine = null;
        switch (engineSpecification) {
            case LPE:
                engine = getEngine(LPE, new LowPowerEngine());
                break;
            case MPE:
                engine = getEngine(MPE, new MediumPowerEngine());
                break;
            case HPE:
                engine = getEngine(HPE, new HighPowerEngine());
                break;
            case HPDE:
                engine = getEngine(HPDE, new HighPowerDieselEngine());
                break;
        }
        return engine;
    }

    private static Transmission installTransmission(TransmissionSpecification transmissionSpecification)
            throws IOException {
        Transmission transmission = null;
        switch (transmissionSpecification) {
            case SMT:
                transmission = getTransmission(SMT, new StandardTransmission());
                break;
            case AT:
                transmission = getTransmission(AT, new AutomaticTransmission());
                break;
            case SAT:
                transmission = getTransmission(SAT, new SemiAutomaticTransmission());
                break;
            case HDMT:
                transmission = getTransmission(HDMT, new HeavyDutyTransmission());
                break;

        }
        return transmission;
    }

    private static Body installBody(BodySpecification bodySpecification, BodyColour bodyColour) throws IOException {
        Body body = null;

        switch (bodySpecification) {
            case S:
                body = getBody(S, new SedanBody(), bodyColour);
                break;
            case C:
                body = getBody(C, new CoupeBody(), bodyColour);
                break;
            case SUV:
                body = getBody(SUV, new SUVBody(), bodyColour);
                break;
        }
        return body;
    }

    private static Suspension installSuspension(SuspensionSpecification suspensionSpecification) throws IOException {
        Suspension suspension = null;
        switch (suspensionSpecification) {
            case STDS:
                suspension = getSuspension(STDS, new StandardSuspension());
                break;
            case CTS:
                suspension = getSuspension(CTS, new ComfortSuspension());
                break;
            case STS:
                suspension = getSuspension(STS, new SportSuspension());
                break;
            case ORS:
                suspension = getSuspension(ORS, new OffRoadSuspension());
                break;
        }
        return suspension;
    }

    private static Interior installInterior(InteriorSpecification interiorSpecification) throws IOException {
        Interior interior = null;

        switch (interiorSpecification) {
            case STDI:
                interior = getInterior(STDI, new StandartInterior());
                break;
            case STI:
                interior = getInterior(STI, new SportInterior());
                break;
            case WRI:
                interior = getInterior(WRI, new WearResistantInterior());
                break;
        }
        return interior;
    }

    @Override
    public void setCounter(int counter) {
        this.uniqueCarCounter = counter;
    }

    @Override
    public int getCarCounter() {
        return uniqueCarCounter;
    }

    @Override
    public void assembleCar() throws IOException {
        uniqueCar.add(installBody(bodyType, bodyColour));
        uniqueCar.add(installEngine(engineType));
        uniqueCar.add(installTransmission(transmissionType));
        uniqueCar.add(installSuspension(suspensionType));
        uniqueCar.add(installInterior(interiorType));
    }

    @Override
    public <T extends IUnitSpecification> void getCarSpecification() {
        System.out.println(orderNameTitle + orderName);
        System.out.println(orderNumberTitle + uniqueCarCounter);
        for (Object o : uniqueCar) {
            ((T) o).getSpecification();
        }
    }

}
