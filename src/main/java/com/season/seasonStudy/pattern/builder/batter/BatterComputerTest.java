package com.season.seasonStudy.pattern.builder.batter;

public class BatterComputerTest {

    public static void main(String[] args) {

        ComputerDirector director = new ComputerDirector(); // 1
        BatterComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125"); // 2
        director.makeComputer(builder); // 3
        BatterComputer macComputer = builder.getComputer(); // 4
        System.out.println("mac computer:" + macComputer.toString());

        BatterComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器", "海力士222");
        director.makeComputer(lenovoBuilder);
        BatterComputer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());

    }

}
