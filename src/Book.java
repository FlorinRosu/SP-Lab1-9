import java.util.ArrayList;
import java.util.List;

/**
 * Book.
 */
public class Book {
    private String title;
    private List<String> paragraphsList;
    private List<String> imagesList;
    private List<String> tablesList;

    /**
     * Instantiates a new Book.
     *
     * @param title the title
     */
    public Book(String title) {
        this.title = title;
        this.paragraphsList = new ArrayList<String>();
        this.imagesList = new ArrayList<String>();
        this.tablesList = new ArrayList<String>();
    }

    /**
     * Create new paragraph.
     *
     * @param paragraph the paragraph
     */
    public void createNewParagraph(String paragraph){
        this.paragraphsList.add(paragraph);
    }

    /**
     * Create new image.
     *
     * @param image the image
     */
    public void createNewImage(String image){
        this.imagesList.add(image);
    }

    /**
     * Create new table.
     *
     * @param table the table
     */
    public void createNewTable(String table){
        this.tablesList.add(table);
    }

    /**
     * Print.
     */
    public void print() {
        System.out.println("Title: " + title);

        System.out.print("Paragraphs: ");
        for(String paragraph: paragraphsList){
            System.out.print(paragraph + " ");
        }

        System.out.print("\nTmages: ");
        for(String image: imagesList){
            System.out.print(image + " ");
        }

        System.out.print("\nTables: ");
        for(String table: tablesList){
            System.out.print(table + " ");
        }
    }
}