public class Book {
    private String title;
    private Author author;
    private int yearPublication;


    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String setTitle() {
        return this.title = title;
    }
    public Author setAuthor() {
        return this.author = author;

    }
    public int setYearPublication () {
        return this.yearPublication = yearPublication;

    }

}
