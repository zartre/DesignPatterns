public class Main {
    public static void main(String[] args) {
        MediaClip audio1 = new AudioClip("Audio 1");
        MediaClip audio2 = new AudioClip("Audio 2");
        MediaClip video1 = new VideoClip("Video 1");
        MediaClip video2 = new VideoClip("Video 2");
        MediaClip mc;

        AdvertSequence as = new AdvertSequence();
        as.addClip(audio1);
        as.addClip(audio2);
        as.addClip(video1);
        as.addClip(video2);

        mc = as;
        mc.play();
    }
}
