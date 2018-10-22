package structural.facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector pjt = new Projector();
        HomeTheaterFacade h = new HomeTheaterFacade(amp, pjt);
        h.watchMovie("Lle");
        h.stopMovie();
    }
}
