package com.programcreek.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-17
 * Time: 下午5:14
 * Description: To change this template use File | Settings | File Templates.
 */

class Context {
    private String input;
    private String output;

    public Context(String input) {
        this.input = input;
        this.output = "";
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }
}

abstract class Expression {
    public abstract void interpret(Context context);
}

class AExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("a expression");
        String input = context.getInput();
        System.out.println(input);
        System.out.println(input.substring(1));
        context.setInput(input.substring(1));
        context.setOutput(context.getOutput() + "1");
    }
}

class BExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("b expression");
        String input = context.getInput();
        System.out.println(input);
        System.out.println(input.substring(1));
        context.setInput(input.substring(1));
        context.setOutput(context.getOutput() + "2");
    }
}

public class InterpreterExample {
    public static void run() {
        String str = "ab";
        Context context = new Context(str);

        List<Expression> list = new ArrayList<Expression>();
        list.add(new AExpression());
        list.add(new BExpression());

        for (Expression ex: list) {
            ex.interpret(context);
        }
        System.out.println(context.getInput());
        System.out.println(context.getOutput());
    }
}
