package com.season.seasonStudy.pattern.builder.batter;

public class LenovoComputerBuilder extends BatterComputerBuilder {
    private BatterComputer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer = new BatterComputer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public BatterComputer getComputer() {
        return computer;
    }
}