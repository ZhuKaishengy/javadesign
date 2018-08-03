package com.aisino.simplefactory.common;


import java.util.Scanner;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class TestCommon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        SendFactory sendFactory = new SendFactory();
        Sender producer = sendFactory.produce(i);
        producer.send();
    }

}
