import java.awt.print.Book;
import java.util.Scanner;

public class Menu {
    final private Scanner scanner;
    final private Library library;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.library = new Library();
    }


    public void run() {
        boolean running = true;
        System.out.println("Welcome to the library!");
        System.out.println("1. Add book");
        System.out.println("2. Show all books");
        System.out.println("3. Exit");
        System.out.println("Enter:");
        String input = scanner.nextLine();
        while (running) {
            switch (input) {
                case "1": {
                    Book book = new Book();
                    System.out.println("*** ADD NEW BOOK ***");
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author name:");
                    String author = scanner.nextLine();
                    System.out.println("Enter number of pages:");
                    String pages = scanner.nextLine();
                    library.addBook(new Book(title, author, pages));
                    System.out.println(book + " was added to the library!");
                    break;
                }
                case "2": {
                    library.showAllBooks();
                    break;
                }
                case "3": {
                    running = false;
                    break;
                }
                default: {
                    System.out.println("Invalid input, try again!");
                }
            }
        }
    }
}
