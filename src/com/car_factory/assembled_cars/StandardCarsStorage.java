package com.car_factory.assembled_cars;

import com.car_factory.car_assembly_line.ICarAssemlyLine;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public abstract class StandardCarsStorage {

    private static final String CAR_PARKING = "resources/assembled_standard_cars.bin";
    private static HashMap carParking;

    public static <T extends ICarAssemlyLine> T getCarFromParkingLot(String key, T t) throws IOException {
        LinkedList<T> department = openParkingDepartment(key);
        t = department.pollFirst();
        updateParkingDepartment(key, department);
        return t;
    }

    public static <T extends ICarAssemlyLine> void sendCarToParkingLot(String key, LinkedHashSet<T> car) throws IOException {
        LinkedList<T> department = openParkingDepartment(key);
        department.addLast((T) car);
        updateParkingDepartment(key, department);
    }

    public static <T extends ICarAssemlyLine> void updateParkingDepartment(String key, LinkedList<T> department) throws IOException {
        openParking();
        if (carParking.containsKey(key)) {
            carParking.replace(key, department);
        } else {
            carParking.put(key, department);
        }
        closeParking();
    }

    public static <T extends ICarAssemlyLine> LinkedList<T> openParkingDepartment(String key) throws IOException {
        openParking();
        LinkedList<T> department = (LinkedList) carParking.getOrDefault(key, new LinkedList<T>());
        return department;
    }

    private static void openParking() throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(CAR_PARKING))) {
            carParking = (HashMap) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            carParking = new HashMap();
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "assembled_standard_cars.bin");
            file1.createNewFile();
        } catch (ClassNotFoundException e) {
            carParking = new HashMap();
        } catch (IOException e) {
            carParking = new HashMap();
        }
    }

    private static void closeParking() throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(CAR_PARKING))) {
            objectOutputStream.writeObject(carParking);
        } catch (FileNotFoundException e) {
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "assembled_standard_cars.bin");
            file1.createNewFile();
            System.out.println("Writing error.File not found");
        } catch (IOException e) {
            System.out.println("Error in writing process ");
        }
    }
}
