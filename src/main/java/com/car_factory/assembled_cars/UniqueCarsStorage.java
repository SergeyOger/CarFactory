package com.car_factory.assembled_cars;

import com.car_factory.car_assembly_line.unique_car.UniqueCar;

import java.io.*;
import java.text.CollationElementIterator;
import java.util.*;

import static com.car_factory.factory_office.statistics_department.TextFormatting.configureTableColumns;
import static com.car_showroom.TextFormatter.getTextSeparator;
import static com.car_showroom.TextFormatter.setMenuTextFormatter;

public abstract class UniqueCarsStorage {

    private static final String FILE_NAME = "resources/assembled_unique_cars.bin";
    private static LinkedHashMap<String, UniqueCar> uniqueCars;

    public static void showNotShippedOrders() throws IOException {
        openUniqueCarsStock();
        System.out.println("Remaining orders at the factory");
        getTextSeparator();
        if (uniqueCars.isEmpty()) {
            System.out.println("All orders sent to customers ");
        }
        for (String key : uniqueCars.keySet()) {
            setMenuTextFormatter(("Order name : " + "|" + key + "|"),
                    ( String.format("%06d",uniqueCars.get(key).getCarCounter())));
        }
    }

    public static UniqueCar getUniqueCarFromParkingLot(String key) throws IOException {
        openUniqueCarsStock();
        UniqueCar uniqueCar = null;
        if (uniqueCars.containsKey(key)) {
            uniqueCar = uniqueCars.get(key);
            uniqueCars.remove(key);
            closeUniqueCarsStock();
            return uniqueCar;
        } else {
            System.out.println("There is no such order.");
            return null;
        }
    }

    public static <T extends UniqueCar> void saveUniqueCar(String orderNumber, T t) throws IOException {
        openUniqueCarsStock();
        uniqueCars.put(orderNumber, t);
        System.out.println("Order saved");
        closeUniqueCarsStock();
    }

    public static Boolean checkTheOrderNameUniqueness(String key) throws IOException {
        openUniqueCarsStock();
        if (uniqueCars.containsKey(key)) {
            return false;
        } else {
            return true;
        }
    }

    private static void openUniqueCarsStock() throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            uniqueCars = (LinkedHashMap) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "assembled_unique_cars.bin");
            file1.createNewFile();
            uniqueCars = new LinkedHashMap();
        } catch (ClassNotFoundException e) {
            uniqueCars = new LinkedHashMap();
        } catch (IOException e) {
            uniqueCars = new LinkedHashMap();
        }
    }

    private static void closeUniqueCarsStock() throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(uniqueCars);
        } catch (FileNotFoundException e) {
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "assembled_unique_cars.bin");
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
