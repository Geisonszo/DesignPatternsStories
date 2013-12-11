package com.programcreek.designpatterns.builder;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-10
 * Time: 下午7:33
 * Description: the Builder Design Pattern
 * Difference between Builder and Factory
 * Builder pattern is used when there are many steps to create an object.
 * Factory pattern is used when the factory can easily create the entire
 * object within one method call.
 */

// produce to be built (星巴克)
class Starbucks {
    private String size;
    private String drink;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}

// abstract builder
abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    public Starbucks getStarbucks() {
        return starbucks;
    }

    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();
}

// Concrete Builder to build tea
class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}

// Concrete Builder to build coffee
class CoffeeBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}

// director to encapsulate the builder
class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }

    public Starbucks getStarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildDrink();
        starbucksBuilder.buildSize();
    }
}

//customer
public class Customer {
    //public static void main(String[] args) {
    public static void run() {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

        //StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        //get the drink built
        Starbucks drink = waiter.getStarbucksDrink();
    }
}
