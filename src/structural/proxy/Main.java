package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image catImg = new ImageProxy("cat.jpg");
        catImg.showImage();
    }
}
