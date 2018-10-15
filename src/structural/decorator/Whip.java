package structural.decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }

    public Double getCost() {
        return 0.99 + beverage.getCost();
    }
}
