import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String name;
    private LocalDate birthDay;

    User (String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthDay.toString();
    }

    public String getBorrowedBooks() {
        return this.borrowedBooks.toString();
    }

    int age() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    void borrow(Book book) {
        this.borrowedBooks.add(book);
    }

    void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    void borrow(Book[] books) {
        borrowedBooks.addAll(Arrays.asList(books));
    }
}
