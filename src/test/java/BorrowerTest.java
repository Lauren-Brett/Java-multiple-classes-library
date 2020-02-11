import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Polly");
        library = new Library();

    }

    @Test
    public void name_of_borrower() {
        assertEquals("Polly", borrower.getName());
    }

    @Test
    public void borrower_starts_with_no_books_to_read(){
        assertEquals(0, borrower.readingListCount());
    }

    @Test
    public void add_book_to_reading_list_from_library(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.readingListCount());
        assertEquals(0, library.bookCount());
    }


}
