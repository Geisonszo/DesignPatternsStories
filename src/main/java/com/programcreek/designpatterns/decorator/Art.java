package com.programcreek.designpatterns.decorator;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:16
 * Description: To change this template use File | Settings | File Templates.
 */
public class Art extends GirlDecorator {

    private Girl girl;

    public Art(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Art";
    }

    public void draw() {
        System.out.println("draw pictures!");
    }
}
