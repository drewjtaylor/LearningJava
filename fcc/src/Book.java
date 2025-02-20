import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    protected String title;
    protected int pageCount;
    private ArrayList<String> authors = new ArrayList<String>();

    Book(String title, int pageCount, String[] authors) {
        this.title = title;
        this.pageCount = pageCount;
        this.authors = new ArrayList<String>(Arrays.asList(authors));
    }

    public String length() {
        return String.format("%s is %d pages long.", this.title, this.pageCount);
    }

    public String toString() {
        return String.format("%s by %s", this.title, this.authors.toString());
    }
}