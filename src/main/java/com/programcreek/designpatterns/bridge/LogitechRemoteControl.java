package com.programcreek.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:39
 * Description: To change this template use File | Settings | File Templates.
 */
public class LogitechRemoteControl extends AbstractRemoteControl {
    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(int channel) {
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }
}
