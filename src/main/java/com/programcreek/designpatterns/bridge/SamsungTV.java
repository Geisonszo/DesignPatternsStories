package com.programcreek.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:31
 * Description: To change this template use File | Settings | File Templates.
 */
public class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung is turned on.");
    }

    @Override
    public void off() {
        System.out.println("Samsung is turned off.");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung: Channel - " + channel);
    }
}
