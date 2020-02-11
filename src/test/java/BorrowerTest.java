import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Polly");
    }

    @Test
    public void name_of_borrower() {
        assertEquals("Polly", borrower.getName());
    }

    @Test
    public void borrower_starts_with_no_books_to_read(){
        assertEquals(0, borrower.readingListCount());
    }

}
