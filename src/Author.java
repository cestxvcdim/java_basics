public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

    public boolean equals(Author author) {
        if (this == author)
            return true;
        return this.name.equals(author.name) && this.surname.equals(author.surname);
    }

    public int hashCode() {
        int result = this.name.hashCode() + this.surname.hashCode();
        result *= 31;
        return result;
    }
}