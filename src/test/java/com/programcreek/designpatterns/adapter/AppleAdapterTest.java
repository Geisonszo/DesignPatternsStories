package com.programcreek.designpatterns.adapter;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午2:26
 * Description: To change this template use File | Settings | File Templates.
 */
public class AppleAdapterTest {
    @Test
    public void testAdapter() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        apple1.getAColor("green");

        Orange orange = new Orange();
        AppleAdapter aa = new AppleAdapter(orange);
        aa.getAColor("red");
    }
}
