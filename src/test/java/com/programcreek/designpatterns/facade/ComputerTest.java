package com.programcreek.designpatterns.facade;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:37
 * Description: To change this template use File | Settings | File Templates.
 */
public class ComputerTest {
    @Test
    public void testRun() throws Exception {
        Computer computer = new Computer();
        computer.run();
    }
}
