package structural.decorator;

public class Cinnamon extends CondimentDecorator {
    Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + cinnamon";
    }

    public Double getCost() {
        return 0.5 + beverage.getCost();
    }
}
