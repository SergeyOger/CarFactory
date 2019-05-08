package com.car_factory.factory_office.statistics_department;

import java.io.*;
import java.util.HashMap;

public abstract class StatisticsArchive {

    private static final String STATISTICS_ARCHIVE = "resources/statistics_archive.bin";

    public static int[] getArchiveData(String... n) throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(STATISTICS_ARCHIVE))) {
            HashMap archive = (HashMap) objectInputStream.readObject();
            int[] values = new int[n.length];
            int cell = 0;
            for (String s : n) {
                if (archive.containsKey(s)) {
                    values[cell] = (int) archive.get(s);
                } else {
                    values[cell] = 0;
                }
                cell++;
            }
            return values;
        } catch (FileNotFoundException e) {
            System.out.println("Archive file is damaged. New archive created. ");
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "statistics_archive.bin");
            file1.createNewFile();
            return new int[n.length];
        } catch (ClassNotFoundException e) {
            System.out.println("Archive if empty");
            return new int[n.length];
        } catch (EOFException e) {
            return new int[n.length];
        } catch (IOException e) {
            e.printStackTrace();
            return new int[n.length];
        }
    }

    public static void updateStatisticsArchive(String key, Integer value) throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(STATISTICS_ARCHIVE))) {
            HashMap archive = (HashMap) objectInputStream.readObject();
            if (archive.containsKey(key)) {
                archive.replace(key, value);
            } else {
                archive.put(key, value);
            }
            closeArchive(archive);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (FileNotFoundException e) {
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "statistics_archive.bin");
            file1.createNewFile();
            updateStatisticsArchive(key, value);
        } catch (EOFException e) {
            closeArchive(new HashMap());
            updateStatisticsArchive(key, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeArchive(HashMap archive) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(STATISTICS_ARCHIVE))) {
            objectOutputStream.writeObject(archive);
        } catch (FileNotFoundException e) {
            System.out.println("Archive file not found, new archive created");
            File dir = new File("resources");
            dir.mkdir();
            File file1 = new File(dir, "statistics_archive.bin");
            file1.createNewFile();
            closeArchive(archive);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
