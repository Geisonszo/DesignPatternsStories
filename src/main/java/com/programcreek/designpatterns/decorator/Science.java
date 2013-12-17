package com.programcreek.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:13
 * Description: To change this template use File | Settings | File Templates.
 */
public class Science extends GirlDecorator {
    private Girl girl;

    public Science(Girl g) {
        girl = g;
    }

    @Override
    public String getDescription() {
        return girl.getDescription() + "+Like Science";
    }

    public void calculateStuff() {
        System.out.println("scientific calculation!");
    }
}
