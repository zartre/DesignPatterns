package structural.decorator;

public class HomeBrew extends Beverage {
    public HomeBrew() {
        description = "Homebrew";
    }

    public Double getCost() {
        return 5.99;
    }
}
