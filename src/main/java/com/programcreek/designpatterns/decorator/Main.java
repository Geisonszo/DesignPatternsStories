package com.programcreek.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:19
 * Description: To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void run() {
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        Science g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}
