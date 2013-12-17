package com.programcreek.designpatterns.state;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 上午10:17
 * Description: To change this template use File | Settings | File Templates.
 */
interface State {
    public void saySomething(StateContext sc);
}

class Rich implements State {
    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm rich currently, and play a lot.");
        sc.changeState(new Poor());
    }
}

class Poor implements State {
    @Override
    public void saySomething(StateContext sc) {
        System.out.println("I'm poor currently, and spend much time working.");
        sc.changeState(new Rich());
    }
}

public class StateContext {
    private State currentState;

    public StateContext() {
        currentState = new Poor();
    }

    public void changeState(State newState) {
        this.currentState = newState;
    }

    public void saySomething() {
        this.currentState.saySomething(this);
    }

    public static void run() {
        StateContext sc = new StateContext();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
        sc.saySomething();
    }
}
