package structural.proxy;

public class ImageProxy implements Image {
    private String imgPath;

    public ImageProxy(String imgPath) {
        this.imgPath = imgPath;
    }

    public void showImage() {
        Image proxiedImage = new HighResImage(imgPath);
        proxiedImage.showImage();
    }
}
