package structural.adapter;

public class MegamanAdapter implements Rockman {
    Megaman m;

    public MegamanAdapter(Megaman m) {
        this.m = m;
    }

    public void jump() {
        m.spring();
    }

    public void fire() {
        m.fire();
    }
}
