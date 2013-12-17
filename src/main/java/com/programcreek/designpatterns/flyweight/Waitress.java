package com.programcreek.designpatterns.flyweight;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: wujiaoniao
 * Date: 13-12-13
 * Time: 下午9:45
 * Description: To change this template use File | Settings | File Templates.
 */

// A context, here is table number
class CoffeeContext {
    private final int tableNumber;

    public CoffeeContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
// Flyweight object interface
interface ICoffee {
    public void serveCoffee(CoffeeContext context);
}

// Concrete Flyweight object
class Coffee implements ICoffee {
    private final String flavor;

    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + flavor + "to table " + context.getTableNumber());
    }
}

// The FlyweightFactory!
class CoffeeFactory {
    private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);
        if (flavor == null) {
            flavor = new Coffee(flavorName);
            flavors.put(flavorName, flavor);
        }
        return flavor;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}

public class Waitress {
    //coffee array
    private static Coffee[] coffees = new Coffee[20];
    //table array
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }

    public static void run() {
        coffeeFactory = new CoffeeFactory();
        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 2);
        takeOrder("Regular Coffee", 1);
        takeOrder("Regular Coffee", 2);
        takeOrder("Regular Coffee", 3);
        takeOrder("Regular Coffee", 4);
        takeOrder("Cappuccino", 4);
        takeOrder("Cappuccino", 5);
        takeOrder("Regular Coffee", 3);
        takeOrder("Cappuccino", 3);

        for (int i = 0; i < ordersCount; ++i) {
            coffees[i].serveCoffee(tables[i]);
        }

        System.out.println("\nTotal Coffee objects made; " + coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}
