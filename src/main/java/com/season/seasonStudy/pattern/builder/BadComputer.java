package com.season.seasonStudy.pattern.builder;

/**
 * 正常创建一个Computer对象.
 * 方案1，使用构造方法，多而杂，参数过多导致阅读不方便
 * 方案2，使用set方法，容易漏掉，但是builder模式，一样会漏掉，相对的有点是，如果不适用最终的builder，这个对象就不能使用，方便流程控制
 * 方案2，在对象的构建过程中，对象的状态时刻发生变化，在并发的过程中，类的信息会变得，不一致的危险
 */
public class BadComputer extends Computer {

    public BadComputer(String cpu, String ram) {
        this(cpu, ram, 0);
    }
    public BadComputer(String cpu, String ram, int usbCount) {
        this(cpu, ram, usbCount, "罗技键盘");
    }
    public BadComputer(String cpu, String ram, int usbCount, String keyboard) {
        this(cpu, ram, usbCount, keyboard, "三星显示器");
    }
    public BadComputer(String cpu, String ram, int usbCount, String keyboard, String display) {
        this.cpu = cpu;
        this.ram = ram;
        this.usbCount = usbCount;
        this.keyboard = keyboard;
        this.display = display;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
