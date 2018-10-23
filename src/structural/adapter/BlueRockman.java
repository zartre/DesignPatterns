package structural.adapter;

public class BlueRockman implements Rockman {
    /* This class is not used because in the example
    we want to show the absence of this class and
    the need to use an adapter in place of this class. */

    public void jump() {
        System.out.println("BlueRockman jumps!");
    }

    public void fire() {
        System.out.println("BlueRockman fires!");
    }
}
