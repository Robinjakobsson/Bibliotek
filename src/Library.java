import java.util.ArrayList;
import java.util.List;

/**
 * Class to represent the Library
 */
public class Library {
    protected List<Book> bookList = new ArrayList<>();
    int index = 0;

    /**
     * Method to add a book
     *
     * @param book is the book
     */
    public void addBook(Book book) {
        bookList.add(book);
    }

    /**
     * Method to show all books
     */
    public void showAllBooks() {
        if (bookList == null) {
            System.out.println("No books to show :(");

            for (Book b : bookList) {
                index++;
                System.out.println(index + ". " + b.toString());
            }
        }
    }
}
