import java.util.Scanner;

public class Menu {
    final private Scanner scanner;
    final private library;

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
                    library.addBook();
                    break;
                }
                case "2": {
                    library.printBooks();
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
