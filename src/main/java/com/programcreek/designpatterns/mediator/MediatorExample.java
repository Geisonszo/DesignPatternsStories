package com.programcreek.designpatterns.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午6:42
 * Description: Mediator(中介者模式).
 */

interface IMediator {
    public void fight();
    public void talk();
    public void registerA(ColleagueA a);
    public void registerB(ColleagueB b);
}

//concrete mediator
class ConcreteMediator implements IMediator {
    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void registerA(ColleagueA a) {
        this.talk = a;
    }

    @Override
    public void registerB(ColleagueB b) {
        this.fight = b;
    }

    @Override
    public void fight() {
        System.out.println("Mediator is fighting.");
        //let the fight colleague do some stuff
    }

    @Override
    public void talk() {
        System.out.println("Mediator is talking.");
        //let the talk colleague do some stuff
    }
}
abstract class Colleague {
    IMediator mediator;
    public abstract void doSomething();
}

class ColleagueA extends Colleague {

    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doSomething() {
        this.mediator.talk();
        this.mediator.registerA(this);
    }
}

class ColleagueB extends Colleague {

    public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.registerB(this);
    }

    @Override
    public void doSomething() {
        this.mediator.fight();
    }
}

public class MediatorExample {
    public static void run() {
        IMediator mediator = new ConcreteMediator();

        ColleagueA talkColleague = new ColleagueA(mediator);
        ColleagueB fightColleague = new ColleagueB(mediator);

        talkColleague.doSomething();
        fightColleague.doSomething();
    }
}
