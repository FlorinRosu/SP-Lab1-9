
import java.util.ArrayList;

public class Book extends Section {

    private String title;
    ArrayList<Element> elementArrayList = new ArrayList<Element>();
    ArrayList<Author> authorArrayList = new ArrayList<Author>();

    public Book(String title) {
        super(title);
        this.title = title;
    }

    public void addElement(Element element) {
        this.elementArrayList.add(element);
    }

    public void addAuthor(Author author) {
        this.authorArrayList.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.title + "\n");
        System.out.println("Authors:");
        this.authorArrayList.forEach(e -> e.print());
        System.out.println();
        this.elementArrayList.forEach(e -> e.print());
    }
}