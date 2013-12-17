package com.programcreek.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午8:55
 * Description: To change this template use File | Settings | File Templates.
 */
public abstract class Girl {
    //java abstract 默认的变量权限是 friendly 型,interface 默认是 public static final
    String description = "no particular";

    public String getDescription() {
        return description;
    }
}
