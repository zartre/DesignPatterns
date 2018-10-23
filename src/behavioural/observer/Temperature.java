package behavioural.observer;

import java.util.ArrayList;

public class Temperature implements Observee {
    private int temp = 25;
    private ArrayList<Observer> observers = new ArrayList();

    public Temperature(int t) { this.temp = t; }

    public int getTemp() { return temp; }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    public void notifyObservers() {
        for (Observer o : observers) o.update(this);
    }
}
