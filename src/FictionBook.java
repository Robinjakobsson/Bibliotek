public class FictionBook extends Book {

    String subject;
    String genre;

    public FictionBook(String title, String author, String pages, String subject, String genre) {
        super(title, author, pages);
        this.subject = subject;
        this.genre = genre;
    }
}
