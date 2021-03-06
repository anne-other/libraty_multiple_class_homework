import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(100);
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

    @Test
    public void libraryShouldHaveCapacity() {
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void cantAddBookIfAtCapacity() {
        Library library1 = new Library(1);
        library1.addBook(book);
        library1.addBook(book);
        assertEquals(1, library1.bookStock());
    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.addBook(book);
        assertEquals(1, library.bookStock());
        library.removeBook();
        assertEquals(0, library.bookStock());
    }
}
