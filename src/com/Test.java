package com;

import com.car_showroom.IndividualOrder;

import java.io.IOException;


public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        IndividualOrder individualOrder = new IndividualOrder("Test");
        individualOrder.createOrder();
    }


}
