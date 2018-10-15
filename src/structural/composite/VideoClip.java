package structural.composite;

public class VideoClip extends MediaClip {
    private String name;

    public VideoClip(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing video " + name);
    }
}
