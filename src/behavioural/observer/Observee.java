package behavioural.observer;

public interface Observee {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
