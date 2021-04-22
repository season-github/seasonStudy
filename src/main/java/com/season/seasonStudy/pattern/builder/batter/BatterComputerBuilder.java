package com.season.seasonStudy.pattern.builder.batter;

public abstract class BatterComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();
    public abstract BatterComputer getComputer();
}
