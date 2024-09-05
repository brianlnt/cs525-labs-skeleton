package edu.mum.cs.cs525.labs.skeleton.decorator_pattern;

public class CofferShop {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);  // Add Mocha
        beverage2 = new Milk(beverage2);   // Add Milk
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
