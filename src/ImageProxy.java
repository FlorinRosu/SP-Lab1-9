public class ImageProxy extends Picture implements Element {
    private String name;
    private Image realImage;

    public ImageProxy(String url) {
        this.name = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        return realImage;
    }
    @Override
    public void print() {
        loadImage();
        realImage.print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    String url() {
        return this.name;
    }
}
