public class NonFictionBook extends Book {

    String subject;
    String genre;

    public NonFictionBook(String title, String author, String pages, String subject, String genre) {
        super(title, author, pages);
        this.subject = subject;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "subject='" + subject + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
