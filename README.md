# CarFactory
AppRunner.java class is used to run the progarm ;

com.car_showroom.MainHandler class is used to handle user input; 

1.Individual order

com.car_factory.factory_office.order_department.IndividualOrder is used to creating individual order for car;

car_factory.car_assembly_line.unique_car.UniqueCar is used to assemble car by individual order;

com.car_factory.assembled_cars.UniqueCarsStorage used for saving created cars assembled by individual order;

car_factory.factory_office.car_shipment_department.CarShipment is used for shiping created car from factory; 

2.Standart orfder

Standart cars specification are contained in com.car_factory.car_assembly_line.standart_cars.StandardCar;

com.car_factory.factory_office.order_department.StandardOrder is used to creating standart order for car;

car_factory.car_assembly_line.standart_cars - package contains classes for assemle standart cars;

com.car_factory.assembled_cars.StandardCarsStorage - class used for svaing standart cars to storage;

com.car_factory.factory_office.avaiilability_control_department.car_availability_control.CarAvailabilityControl 
- class for controll availability standart cars on assembled cars parking; 

3.Units stock

All units descriptions are contained in enum classes [Unit]Specification, [Unit]Description ( BodySpecification, EngineDescription and other);

car_factory.production_units - package contains classes describing units and units stock;

com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.BodyAvailabilityController 
is used for controll bodies availability in com.car_factory.production_units.finished_units_stock.MainStock 

com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.EngineAvailabilityController  
is used for controll engines availability in com.car_factory.production_units.finished_units_stock.MainStock 

com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.InteriorAvailabilityController 
is used for controll interiors availability in com.car_factory.production_units.finished_units_stock.MainStock 

com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.SuspensionAvailabilityController 
is used for controll suspensions availability in com.car_factory.production_units.finished_units_stock.MainStock 

com.car_factory.factory_office.avaiilability_control_department.unit_availability_control.TransmissionAvailabilityController 
is used for controll transmissions availability in com.car_factory.production_units.finished_units_stock.MainStock 



