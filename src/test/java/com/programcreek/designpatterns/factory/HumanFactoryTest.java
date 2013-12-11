package com.programcreek.designpatterns.factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
public class HumanFactoryTest {
    @Test
    public void testCreateHuman() throws Exception {
        Human b = HumanFactory.createHuman("boy");
        assertTrue(b instanceof Boy);

        Human g = HumanFactory.createHuman("girl");
        assertTrue(g instanceof Girl);

        Human f = HumanFactory.createHuman("foobar");
        assertNull(f);
    }
}
