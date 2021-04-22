package com.season.seasonStudy.pattern.builder.batter;

public class MacComputerBuilder extends BatterComputerBuilder {
    private BatterComputer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new BatterComputer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public BatterComputer getComputer() {
        return computer;
    }
}