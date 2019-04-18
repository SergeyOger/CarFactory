package com;

import com.carcreator.DetailCarCreator;
import com.createhandler.DetailCarCreateHandler;

import java.util.Scanner;

public class AppRuner {
    public static void main(String[] args) {
        /*
        String runVoid;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How you wont to create you car: Detail(D) or Fast(F)");
        runVoid = scanner.nextLine().toUpperCase();
        if (runVoid.equals("D")) {
            DetailCarCreateHandler detailCarCreateHandler = new DetailCarCreateHandler();
            detailCarCreateHandler.runDetailHandler();
        } else if(runVoid.equals("F")) {
            System.out.println("In development....try later");
        } else {
            System.out.println("Wrong input.Insert only D or F");
            scanner.reset();
        }

         */
        DetailCarCreateHandler detailCarCreateHandler = new DetailCarCreateHandler();
        detailCarCreateHandler.runDetailHandler();
        detailCarCreateHandler.getCollectionContent();
        System.out.println(detailCarCreateHandler.toString());
    }
}
