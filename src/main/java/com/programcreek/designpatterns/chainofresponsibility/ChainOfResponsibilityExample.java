package com.programcreek.designpatterns.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午3:02
 * Description: To change this template use File | Settings | File Templates.
 */
enum ChainLevel {
    ONE(1), TWO(2), THREE(3);

    private int index;

    ChainLevel(int idx) {
        this.index = idx;
    }

    public int getIndex() {
        return index;
    }
}

abstract class Chain {
    //public static int One = 1;
    //public static int Two = 2;
    //public static int Three = 3;
    protected ChainLevel Threshold;

    protected Chain next;

    public void setNext(Chain next) {
        this.next = next;
    }

    public void message(String msg, ChainLevel priority) {
        //If the priority is less than Threshold it is handled.
        if (priority.getIndex() <= Threshold.getIndex()) {
            writeMessage(msg);
        }

        if (next != null) {
            next.message(msg, priority);
        }
    }

    abstract protected void writeMessage(String msg);
}

class A extends Chain {
    public A(ChainLevel threshold) {
        this.Threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("A: " + msg);
    }
}

class B extends Chain {
    public B(ChainLevel threshold) {
        this.Threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("B: " + msg);
    }
}

class C extends Chain {
    public C(ChainLevel threshold) {
        this.Threshold = threshold;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("C: " + msg);
    }
}

public class ChainOfResponsibilityExample {

    //Build the chain of responsibility
    private static Chain createChain() {
        Chain chain1 = new A(ChainLevel.THREE);

        Chain chain2 = new B(ChainLevel.TWO);
        chain1.setNext(chain2);

        Chain chain3 = new C(ChainLevel.ONE);
        chain2.setNext(chain3);

        return chain1;
    }

    public static void run() {
        Chain chain = createChain();

        chain.message("level 3", ChainLevel.THREE);
        chain.message("level 2", ChainLevel.TWO);
        chain.message("level 1", ChainLevel.ONE);
    }
}
