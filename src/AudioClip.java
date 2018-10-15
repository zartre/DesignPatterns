public class AudioClip extends MediaClip {
    private String name;

    public AudioClip(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing audio " + name);
    }
}
