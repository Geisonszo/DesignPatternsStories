package com.programcreek.designpatterns.command;

import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午3:42
 * Description: To change this template use File | Settings | File Templates.
 */

/* The Command Interface */
interface Command {
    void execute();
}

// In this example, suppose you use a switch to control computer

/* The Invoker class */
class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {

    }

    public void storeAndExecute(Command command) {
        this.history.add(command); // optional, can do the execute only!
        command.execute();
    }
}

/* The Receiver class */
class Computer {
    public void shutDown() {
        System.out.println("computer is shut down");
    }

    public void restart() {
        System.out.println("computer is restarted");
    }
}

/* The Command for shutting down the computer */
class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.shutDown();
    }
}

/* The Command for shutting down the computer */
class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.restart();
    }
}

public class CommandExample {
    public static void run() {
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "shutdown"; // get value based on real situation

        if (str == "shutdown") {
            s.storeAndExecute(shutdown);
        } else {
            s.storeAndExecute(restart);
        }
    }
}
