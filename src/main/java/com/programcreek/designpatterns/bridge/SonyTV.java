package com.programcreek.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:34
 * Description: To change this template use File | Settings | File Templates.
 */
public class SonyTV implements ITV {
    @Override
    public void on() {
        System.out.println("Sony is turned on.");
    }

    @Override
    public void off() {
        System.out.println("Sony is turned off.");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony: channel - " + channel);
    }
}
