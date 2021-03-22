package com.season.seasonStudy.pattern.builder.batter;

public class ComputerDirector {
    public void makeComputer(BatterComputerBuilder builder) {
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}