package creational.factory;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza p;
        if (type.equalsIgnoreCase("Margherita")) {
            p = new MargheritaPizza();
        } else {
            p = null;
        }
        return p;
    }
}
