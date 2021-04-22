package com.season.seasonStudy.pattern.builder.batter;

import com.season.seasonStudy.pattern.builder.Computer;

import java.util.StringJoiner;

/**
 * 比{@link com.season.seasonStudy.pattern.builder.GoodComputer }更加复杂一些
 *
 */
public class BatterComputer extends Computer {

    public BatterComputer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BatterComputer.class.getSimpleName() + "[", "]")
                .add("cpu='" + cpu + "'")
                .add("ram='" + ram + "'")
                .add("usbCount=" + usbCount)
                .add("keyboard='" + keyboard + "'")
                .add("display='" + display + "'")
                .toString();
    }
}

