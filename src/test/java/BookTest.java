import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        this.book = new Book("The Lord Of The Rings", "J.R.R. Tolkein", "Fantasy");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Lord Of The Rings", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("J.R.R. Tolkein", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
