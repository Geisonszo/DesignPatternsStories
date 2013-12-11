package com.programcreek.designpatterns.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午5:01
 * Description: To change this template use File | Settings | File Templates.
 */
interface CPU {
    void process();
}

interface CPUFactory {
    CPU produceCPU();
}

class AMDCPU implements CPU {
    public void process() {
        System.out.println("AMD is processing...");
    }
}

class IntelCPU implements CPU {
    public void process() {
        System.out.println("Intel is processing...");
    }
}

class AMDFactory implements CPUFactory {
    public CPU produceCPU() {
        return new AMDCPU();
    }
}

class IntelFactory implements CPUFactory {
    public CPU produceCPU() {
        return new IntelCPU();
    }
}

class Computer {
    CPU cpu;

    public Computer(CPUFactory factory) {
        cpu = factory.produceCPU();
        cpu.process();
    }
}

public class AbstractFactory {
    /*
    public static void main(String[] args) {
        new Computer(createSpecificFactory(0));
    }
    */
    public static CPUFactory createSpecificFactory(int sys) {
        // based on specific requirement
        if (sys == 0)
            return new AMDFactory();
        else
            return new IntelFactory();
    }
}
