
import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private Author author;
    public static Integer chapterCount=0;
    public List<Chapter> chapters = new ArrayList<Chapter>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public int createChapter(String text)
    {
        Chapter chapter = new Chapter(text,chapterCount);
        chapterCount++;
        chapters.add(chapter);

        return chapterCount;
    }

    public Chapter getChapter(int index)
    {
        return chapters.get(index-1);
    }

    public void print() {
    }
}