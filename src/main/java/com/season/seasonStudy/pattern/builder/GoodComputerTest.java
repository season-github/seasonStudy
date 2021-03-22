package com.season.seasonStudy.pattern.builder;

public class GoodComputerTest {
    public static void main(String[] args) {
        /**
         * 可以根据步骤一个一个来，中间可以忙其他的事情
         */
        GoodComputer computer = new GoodComputer.Builder("intel i5 9600kf", "32g")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
    }
}
