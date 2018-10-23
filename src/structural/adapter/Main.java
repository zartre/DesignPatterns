package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Megaman red = new RedMegaman();
        Rockman blue = new MegamanAdapter(red);
        blue.jump();
        blue.fire();
        // Notice that blue now uses red's (Megaman) methods instead
    }
}
