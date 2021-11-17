import java.util.ArrayList;

public class Section implements Element {
    public String title;
    ArrayList<Element> elementArrayList = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        this.elementArrayList.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elementArrayList.remove(element);
    }

    @Override
    public Element get(int index) {
        return this.elementArrayList.get(index);
    }

    @Override
    public void print(){
        System.out.println(this.title);
        this.elementArrayList.forEach(e -> e.print());
    }
}