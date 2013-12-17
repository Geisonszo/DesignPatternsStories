package com.programcreek.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:29
 * Description: To change this template use File | Settings | File Templates.
 */

// the components of a computer
class CPU {
    public void processData() {
        System.out.println("CPU is processing data");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory is loading data");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("HardDrive is reading data");
    }
}

// Facade
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        cpu.processData();
        memory.load();
        hardDrive.readData();
    }
}
