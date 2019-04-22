package com.infomodule;

import com.detailcarcreator.DetailCarCreator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InfoHandler {

    // Void for writing objects to file
    public static <T> void saveCreationObjectToFile(ArrayList<T> list, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Void for reading objects from file
    public static <T> ArrayList<T> readSavedObject(ArrayList<T> list, String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<T>) objectInputStream.readObject();
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Write car counter
    public static void writeCarCounter(int number, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeInt(number);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read car counter
    public static int readNumber(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            int number = objectInputStream.readInt();
            return number;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            return 0;
        }
    }

}
