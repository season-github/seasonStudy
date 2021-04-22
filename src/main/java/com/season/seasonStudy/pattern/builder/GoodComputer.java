package com.season.seasonStudy.pattern.builder;

/**
 * builder partten
 */
public class GoodComputer extends Computer {

    private GoodComputer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder extends Computer {
        public Builder(String cup, String ram) {
            this.cpu = cup;
            this.ram = ram;
        }

        public GoodComputer build() {
            return new GoodComputer(this);
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
    }
}