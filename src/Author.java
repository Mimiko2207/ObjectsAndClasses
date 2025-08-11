public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(String firstName) {
        return this.firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }
}