package com.car_factory.assembled_cars;

import com.car_factory.car_assembly_line.unique_car.UniqueCar;

import java.io.*;
import java.util.HashMap;

public abstract class UniqueCarsStorage {

    private static final String FILE_NAME = "resources/assembled_unique_cars.bin";
    private static HashMap uniqueCars;

    public static UniqueCar getUniqueCarFromParkingLot(String key) throws IOException {
        openUniqueCarsStock();
        UniqueCar uniqueCar = null;
        if (uniqueCars.containsKey(key)) {
            uniqueCar = (UniqueCar) uniqueCars.get(key);
            uniqueCars.remove(key);
            return uniqueCar;
        } else {
            System.out.println("There is no such order.");
            return null;
        }
    }

    public static <T extends UniqueCar> void saveUniqueCar(String orderNumber, T t) throws IOException {
        openUniqueCarsStock();
        uniqueCars.put(orderNumber, t);
        System.out.println("Oder saved");
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
            uniqueCars = (HashMap) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "assembled_unique_cars.bin");
            file1.createNewFile();
            uniqueCars = new HashMap();
        } catch (ClassNotFoundException e) {
            uniqueCars = new HashMap();
        } catch (IOException e) {
            uniqueCars = new HashMap();
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
