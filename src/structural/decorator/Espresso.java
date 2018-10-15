package structural.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public Double getCost() {
        return 6.99;
    }
}
