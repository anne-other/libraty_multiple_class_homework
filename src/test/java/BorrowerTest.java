import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
//    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(100);
//        book = new Book("Hounded", "Kevin Hearne", "Urban Fantasy")

    }

    @Test
    public void borrowerCollectionStartsEmpty() {
        assertEquals(0, borrower.getCollection());
    }

//    @Test
//    public void borrowerCanBorrowBook() {
//        library.addBook(book);
//        borrower.borrow(library);
//        assertEquals(1, borrower.getCollection());
//    }
}
