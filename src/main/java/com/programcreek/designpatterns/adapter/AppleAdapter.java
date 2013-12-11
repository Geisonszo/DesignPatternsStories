package com.programcreek.designpatterns.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午2:20
 * Description: To change this template use File | Settings | File Templates.
 */
class Apple {
    public void getAColor(String str) {
        System.out.println("Apple color is: " + str);
    }
}

class Orange {
    public void getOColor(String str) {
        System.out.println("Orange color is: " + str);
    }
}

// The Adapter make Orange acts like an Apple object
public class AppleAdapter extends Apple {
    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    public void getAColor(String str) {
        orange.getOColor(str);
    }
}
