package com.programcreek.designpatterns.abstractfactory;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午5:20
 * Description: To change this template use File | Settings | File Templates.
 */
@RunWith(Parameterized.class)
public class AbstractFactoryTest {
    private int sys;
    private Object cls;

    public AbstractFactoryTest(int sys, Object cls) {
        this.sys = sys;
        this.cls = cls;
    }

    @Parameters
    public static Collection sysNumbers() {

        return Arrays.asList(new Object[][] {
                { 0, AMDFactory.class },
                { 1, IntelFactory.class }
        });
    }

    @Test
    public void testCreateSpecificFactory() throws Exception {
        System.out.printf("Parameterized Number is : %d\n", sys);
        assertEquals(AbstractFactory.createSpecificFactory(sys).getClass(), cls);
    }
}
