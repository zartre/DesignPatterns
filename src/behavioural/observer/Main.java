package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        TemperatureObserver ob1 = new TemperatureObserver(t, "Observer 1");
        TemperatureObserver ob2 = new TemperatureObserver(t, "Observer 2");
        t.setTemp(27);
        t.setTemp(28);
        t.removeObserver(ob1);
        t.setTemp(26);
    }
}
