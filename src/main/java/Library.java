import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int bookStock() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
