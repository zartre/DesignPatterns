package structural.proxy;

public class HighResImage implements Image {

    public HighResImage(String imgPath) {
        loadImage(imgPath);
    }

    public void loadImage(String imgPath) {
        System.out.println("HighResImage.loadImage(" + imgPath + ")");
    }

    public void showImage() {
        System.out.println("HighResImage.showImage()");
    }
}
