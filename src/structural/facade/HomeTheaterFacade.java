package structural.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Projector pjt;
    public HomeTheaterFacade(Amplifier a, Projector p) {
        this.amp = a;
        this.pjt = p;
    }
    public void watchMovie(String mname) {
        System.out.println("Preparing for " + mname);
        amp.turnOn();
        pjt.turnOn();
    }
    public void stopMovie() {
        System.out.println("Stop watching movie...");
        amp.turnOff();
        pjt.turnOff();
    }
}
