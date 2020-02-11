import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    //library

    @Before
    public void before() {
        book1 = new Book("Design Ideas", "Me", "Personal");
        book2 = new Book("Coding", "them", "Learn");
        //library.addBook()
    }

    @Test
    public void book_has_name(){
        assertEquals("Design Ideas", book1.getName());
        assertEquals("Coding", book2.getName());
    }

    @Test
    public void book_has_author() {
        assertEquals("Me", book1.getAuthor());
    }

    @Test
    public void book_has_genre() {
        assertEquals("Personal", book1.getGenre());
    }

}
