package creational.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza m = pizzaFactory.createPizza("Margherita");
        System.out.println(m.getName());
    }
}
