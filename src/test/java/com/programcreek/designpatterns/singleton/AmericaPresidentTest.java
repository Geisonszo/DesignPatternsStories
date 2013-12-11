package com.programcreek.designpatterns.singleton;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午3:15
 * To change this template use File | Settings | File Templates.
 */
public class AmericaPresidentTest {
    @Test
    public void testGetInstance() throws Exception {
          assertNotNull(AmericaPresident.getInstance());
    }
}
