import java.util.ArrayList;

public class AdvertSequence extends MediaClip {
    private ArrayList<MediaClip> mediaClips = new ArrayList<>();

    public void addClip(MediaClip clip) {
        mediaClips.add(clip);
    }

    public void play() {
        for (MediaClip clip : mediaClips) {
            clip.play();
        }
    }
}
