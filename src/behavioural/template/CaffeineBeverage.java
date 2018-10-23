package behavioural.template;

public abstract class CaffeineBeverage {
    public final void prepare() {
        // Don't forget to make it final!
        // To avoid being overridden
        boil();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boil() {
        System.out.println("Boiling water.");
    }

    private void pourInCup() {
        System.out.println("Pouring into a cup");
    }

    abstract void brew();
    abstract void addCondiments();
}
