package com.programcreek.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午7:53
 * Description: The Memento(备忘录模式)
 */

class Life {
    private String time;

    public void set(String time) {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    public Memento saveToMemento() {
        System.out.println("Time restored from Memento: " + time);
        return new Memento(time);
    }

    public void restoreFromMemento(Memento memento) {
        time = memento.getTime();
        System.out.println("Time restored from Memento: " + time);
    }

    public static class Memento {
        private final String time;

        public Memento(String timeToSave) {
            this.time = timeToSave;
        }

        public String getTime() {
            return time;
        }
    }
}
public class You {
    public static void run() {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();

        Life life = new Life();

        //time travel and record the eras
        life.set("2000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("3000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");

        life.restoreFromMemento(savedTimes.get(0));
    }
}
