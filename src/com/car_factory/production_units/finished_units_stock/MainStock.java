package com.car_factory.production_units.finished_units_stock;

import com.car_factory.production_units.specification_formating.IUnitSpecification;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class MainStock {

    private static final String ARCHIVE = "resources/unit_stock.bin";

    private static HashMap<String, LinkedList> stock;

    public static <T extends IUnitSpecification> T getUnitFromStock(String key, T t) throws IOException {
        LinkedList<T> unitStock = openUnitDepartment(key);
        t = unitStock.pollFirst();
        updateDepartmentState(key,unitStock);
        return t;
    }

    public static <T extends IUnitSpecification> LinkedList<T> openUnitDepartment(String key) throws IOException {
        openMainStock();
        return stock.getOrDefault(key, new LinkedList());
    }

    private static HashMap<String, LinkedList> openMainStock() throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ARCHIVE))) {
            stock = (HashMap<String, LinkedList>) objectInputStream.readObject();
            return stock;
        } catch (FileNotFoundException e) {
            System.out.println("Archive file created");
            stock = new HashMap<>();
            File dir = new File( "resources");
            dir.mkdir();
            File file1 = new File(dir,"unit_stock.bin");
            file1.createNewFile();
            return stock;
        } catch (ClassNotFoundException e) {
            System.out.println("Archive created");
            stock = new HashMap<>();
            return stock;
        } catch (IOException e) {
            System.out.println("Warehouse opened with creak");
            stock = new HashMap<>();
            return stock;
        }
    }

    private static void closeMainStock() throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ARCHIVE))) {
            objectOutputStream.writeObject(stock);
        } catch (FileNotFoundException e) {
            System.out.println("File for save archive not found, created new archive file");
            File dir = new File( "resources");
            dir.mkdir();
            File file1 = new File(dir,"unit_stock.bin");
            file1.createNewFile();
        } catch (IOException e) {
            System.out.println("Warehouse shut down with creak");
        }
    }

    public static <T extends IUnitSpecification> void updateDepartmentState(String key, LinkedList<T> unitStock) throws IOException {
        openMainStock();
        if (stock.containsKey(key)) {
            stock.replace(key, unitStock);
        } else {
            stock.put(key, unitStock);
        }
        closeMainStock();
    }

}
