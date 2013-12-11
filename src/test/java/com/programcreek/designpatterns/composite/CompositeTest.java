package com.programcreek.designpatterns.composite;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:57
 * Description: To change this template use File | Settings | File Templates.
 */
public class CompositeTest {
    @Test
    public void testComposite() {
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");
        Leaf leaf4 = new Leaf("4");
        Leaf leaf5 = new Leaf("5");

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite component2 = new Composite();
        component2.add(leaf3);
        component2.add(leaf4);
        component2.add(leaf5);

        composite1.add(component2);
        composite1.show();
    }
}
