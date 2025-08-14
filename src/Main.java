//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Author author = new Author("Den ", "Maxwell");
        Book crime = new Book("Crime",  author,  1980);

        Author author2 = new Author("Роман ", "Булгаков");
        Book crime2 = new Book("Мастер и Маргарита",  author,  1966);

        System.out.println("Книга " + crime.setTitle() + ". Автор " + author.getFirstName() + author.getLastName()+ ". Год публикации " + crime.setYearPublication());
        System.out.println("Книга " + crime2.setTitle() + ". Автор " + author2.getFirstName() + author2.getLastName()+ ". Год публикации " + crime2.setYearPublication());


        System.out.println("Книга 1: " + crime);
        System.out.println("Книга 2: " + crime2);

        System.out.println("book1.equals(book2): " + crime.equals(crime2));


        System.out.println("book1.hashCode(): " + crime.hashCode());


    }
}