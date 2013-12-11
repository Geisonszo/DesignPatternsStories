package com.programcreek.designpatterns.bridge;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:42
 * Description: To change this template use File | Settings | File Templates.
 */
public class LogitechRemoteControlTest {
    @Test
    public void testSetChannelKeyboard() throws Exception {
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
}
