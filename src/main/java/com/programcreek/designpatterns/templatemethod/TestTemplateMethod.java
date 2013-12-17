package com.programcreek.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午1:38
 * Description: To change this template use File | Settings | File Templates.
 */

abstract class Vehicle {
    protected boolean status;

    abstract void start();
    abstract void run();
    abstract void stop();

    public  void testYourVehicle() {
        start();
        if (this.status) {
            run();
            stop();
        }
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("Run fast!");
    }

    @Override
    void stop() {
        System.out.println("Car stop!");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("Run slowly!");
    }

    @Override
    void stop() {
        System.out.println("Truck stop!");
    }
}

public class TestTemplateMethod {
    private static void testVehicle(Vehicle v) {
        v.testYourVehicle();
    }

    public static void run() {
        Car car = new Car();
        testVehicle(car);

        Truck truck = new Truck();
        testVehicle(truck);
    }
}
