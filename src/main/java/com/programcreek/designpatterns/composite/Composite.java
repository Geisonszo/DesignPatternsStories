package com.programcreek.designpatterns.composite;

import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-11
 * Time: 下午3:48
 * Description: To change this template use File | Settings | File Templates.
 */

//Component
interface Component {
    public void show();
}

//leaf
class Leaf implements Component {
    String name;
    public Leaf(String s) {
        name = s;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}

//Composite
public class Composite implements Component {

    private List<Component> childComponents = new ArrayList<Component>();

    public void add(Component component) {
        childComponents.add(component);
    }

    public void remove(Component component) {
        childComponents.remove(component);
    }

    @Override
    public void show() {
        for (Component component: childComponents) {
            component.show();
        }
    }
}
