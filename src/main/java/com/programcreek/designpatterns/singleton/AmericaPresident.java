package com.programcreek.designpatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 上午11:27
 * Description: http://www.programcreek.com/2011/07/java-design-pattern-singleton/
 */
public class AmericaPresident {
    private static AmericaPresident ourInstance;//= new AmericaPresident();

    public static AmericaPresident getInstance() {
        if (ourInstance == null)
            ourInstance = new AmericaPresident();
        return ourInstance;
    }

    private AmericaPresident() {
    }
}
