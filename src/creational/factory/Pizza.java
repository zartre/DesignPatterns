package creational.factory;

public abstract class Pizza {
    String name;
    private void prepare() {}
    private void bake() {}
    private void cut() {}
    private void box() {}
    String getName() {
        return name;
    }
}
