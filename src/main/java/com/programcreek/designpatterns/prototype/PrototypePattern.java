package com.programcreek.designpatterns.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午8:35
 * Description: To change this template use File | Settings | File Templates.
 */

// prototype
interface Prototype {
    void setSize(int x);
    void printSize();
}

// a concrete class
class Concrete implements Prototype, Cloneable {
    private int size;

    public Concrete(int x) {
        this.size = x;
    }

    @Override
    public void setSize(int x) {
        this.size = x;
    }

    @Override
    public void printSize() {
        System.out.println("Size: " + size);
    }

    @Override
    public Concrete clone() throws CloneNotSupportedException {
        return (Concrete) super.clone();
    }
}

// When we need a large number of similar objects
public class PrototypePattern {
    public static void run() throws CloneNotSupportedException {
        Concrete a = new Concrete(1);

        for (int i = 2; i < 10; i++) {
            Prototype temp = a.clone();
            temp.setSize(i);
            temp.printSize();
        }
    }
}
