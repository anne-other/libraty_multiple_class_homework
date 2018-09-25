import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Game Of Thrones", "George R R Martin", "Fantasy");
    }

    @Test
    public void countBooksInLibrary() {
        assertEquals(0, library.bookStock());
    }

    @Test
    public void addBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookStock());
    }
}
