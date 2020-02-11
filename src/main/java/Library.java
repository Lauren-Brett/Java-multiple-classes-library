import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;

    public Library() {
       this.collection = new ArrayList<Book>();
       this.capacity = 3;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        if (this.collection.isEmpty());
            return true;
    }
}
