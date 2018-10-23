package behavioural.observer;

public class TemperatureObserver implements Observer {
    private Temperature t;
    private String name;

    public TemperatureObserver(Temperature t, String name) {
        this.t = t;
        this.name = name;
        t.registerObserver(this);
    }

    public void update(Temperature t) {
        this.t = t;
        alert(this.t);
    }

    public void alert(Temperature t) {
        System.out.println(this.name + ", temp updated: " + t.getTemp());
    }
}
