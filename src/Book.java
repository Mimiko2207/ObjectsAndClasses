import java.util.Objects;
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
    public String toString() {
        return "\"" + title + "\" by " + author.toString() + " (" + yearPublication + ")";
    }

    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yearPublication == book.yearPublication &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }
}