public class Book {
    private String title;
    private Author author;
    private int yearPublication;


    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
