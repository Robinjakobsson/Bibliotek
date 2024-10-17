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
        while (running) {
            System.out.println("Welcome to the library!");
            System.out.println("1. Add book");
            System.out.println("2. Show all books");
            System.out.println("3. Exit");
            System.out.println("Enter:");
            String input = scanner.nextLine();
            switch (input) {
                case "1": {
                    addBookMenu();
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

    private void addBookMenu() {
        System.out.println("*** ADD NEW BOOK ***");
        System.out.println("1. Fiction");
        System.out.println("2. Non-Fiction");
        System.out.println("Enter: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1": {
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter author name:");
                String author = scanner.nextLine();
                System.out.println("Enter number of pages:");
                String pages = scanner.nextLine();
                System.out.println("Enter subject:");
                String subject = scanner.nextLine();
                System.out.println("Enter genre:");
                String genre = scanner.nextLine();
                FictionBook fictionBook = new FictionBook(title, author, pages,subject,genre);
                library.addBook(fictionBook);
                System.out.println(fictionBook + " was added to the library!");
                break;
            }
            case "2": {
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter author name:");
                String author = scanner.nextLine();
                System.out.println("Enter number of pages:");
                String pages = scanner.nextLine();
                System.out.println("Enter subject:");
                String subject = scanner.nextLine();
                System.out.println("Enter genre:");
                String genre = scanner.nextLine();
                NonFictionBook nonFictionBook = new NonFictionBook(title, author, pages, subject, genre);
                library.addBook(nonFictionBook);
                System.out.println(nonFictionBook + " was added to the library!");
                break;
            }
        }
    }
}
