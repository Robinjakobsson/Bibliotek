import java.util.ArrayList;
import java.util.List;

/**
 * Class to represent the Library
 */
public class Library {
    protected List<Book> bookList = new ArrayList<>();
    protected List<NonFictionBook> nonFictionBookList = new ArrayList<>();
    protected List<FictionBook> fictionBookList = new ArrayList<>();
    int index = 0;

    /**
     * Method to add a book
     *
     * @param book is the book
     */
    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addNfBook(Book book){
        nonFictionBookList.add(book);
    }
    public void addFBook(Book book){
        fictionBookList.add(book);
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
    public void PrintFiction(){
        if (fictionBookList == null){
            System.out.println("empty");
        }
        for (Book b: fictionBookList){
            index++;
            System.out.println(index + ". " + b.toString());
        }
    }
    public void printNFiction(){
        if (nonFictionBookList == null){
            System.out.println("Empty");
        }
        for(Book b: nonFictionBookList){
            index++;
            System.out.println(index + ". " + b.toString() );
        }
    }
}
