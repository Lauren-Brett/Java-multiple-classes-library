import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> readingList;

    public Borrower(String name) {
        this.name = name;
        this.readingList = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int readingListCount() {
        return this.readingList.size();
    }

    public void borrowBook(Library library) {
        if (library.bookCount() > 0) {
            this.readingList.add(library.removeBook());
        }
    }
}

