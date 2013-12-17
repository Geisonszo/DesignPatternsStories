package com.programcreek.designpatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 上午10:28
 * Description: To change this template use File | Settings | File Templates.
 */
interface Strategy {
    //defined a method for police to process speeding case.
    public void processSpeeding(int speed);
}

//two kinds of police officers
class NicePolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("This is your first time, be sure don't do it again!");
    }
}

class HardPolice implements Strategy {
    @Override
    public void processSpeeding(int speed) {
        System.out.println("Your speed is " + speed + ", and should get a ticket!");
    }
}

class Situation {
    private Strategy strategy;

    public Situation(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleByPolice(int speed) {
        this.strategy.processSpeeding(speed);
    }
}

public class StrategyTest {
    public static void run() {
        HardPolice hp = new HardPolice();
        NicePolice np = new NicePolice();

        // In situation 1, a hard officer is met
        // In situation 2, a nice officer is met
        Situation s1 = new Situation(hp);
        Situation s2 = new Situation(np);

        // The result based on the kind of police officer
        s1.handleByPolice(10);
        s2.handleByPolice(10);
    }
}
