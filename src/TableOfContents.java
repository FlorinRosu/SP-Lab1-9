public class TableOfContents implements Element {
    String name;

    public TableOfContents(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("TableOfContents with Title: " + this.name);
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
}
