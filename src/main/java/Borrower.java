import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int getCollection() {
        return this.collection.size();
    }

    public void borrow(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }
}
