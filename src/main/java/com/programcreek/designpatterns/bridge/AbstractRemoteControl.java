package com.programcreek.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:36
 * Description: To change this template use File | Settings | File Templates.
 */
public abstract class AbstractRemoteControl {
    private ITV tv;

    public AbstractRemoteControl(ITV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.switchChannel(channel);
    }
}
