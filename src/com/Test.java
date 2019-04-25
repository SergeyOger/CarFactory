package com;

import com.infomodule.InfoHandler;

import java.util.Arrays;

import static com.infomodule.InfoHandler.*;

public class Test {

    public static void main(String[] args) {
    getMenuItemSeparator();
    setTextFormater("Change standart car model :", "");
    getTextSeparator();
    setTextFormater("1.City car :", "(CITY)");
    setTextFormater("2.Sport car :","(SPORT)");
    setTextFormater("3.Off-road car :", "(SUV)");
    getMenuItemSeparator();


    }
}
