package com;

import com.detailcarcreator.DetailCarCreator;
import com.infomodule.InfoHandler;
import com.infomodule.InfoModule;
import com.mainhandler.MainHandler;

import java.io.*;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        DetailCarCreator detailCarCreator = new DetailCarCreator();
//        detailCarCreator.changeEngine("LPE");
//        detailCarCreator.changeTransmission("AT");
//        detailCarCreator.changeBody("S","red");
//        detailCarCreator.changeSuspension("STS");
//        detailCarCreator.changeInterior("STI");
//        System.out.println(detailCarCreator.getAllCreatedCarCounter());

        MainHandler mainHandler = new MainHandler();
        mainHandler.runTitle();
    }

}
