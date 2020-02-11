import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Book", "You", "Horror");
        book1 = new Book("Read", "Me", "About");
        book2 = new Book("Code", "Clan", "Coding");
        book3 = new Book("World", "Stars", "Global");
    }

    @Test
    public void collectionof_of_books_starts_empty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void add_book_to_library_collection(){
        library.addBook(book);
        library.addBook(book1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void remove_book_from_libray(){
        library.addBook(book);
        library.addBook(book1);
        library.removeBook();
        assertEquals(1, library.bookCount());
    }

    @Test
    public void capacity_of_books_in_library_collection(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void collection_full_can_not_add_book(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void collection_empty_no_books_to_take_out(){
//        library.isEmpty();
        assertEquals(true, library.isEmpty());
    }

}
