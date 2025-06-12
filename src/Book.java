import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    private int releaseYear;

    public Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear <= LocalDate.now().getYear() && releaseYear >= 0) {
            this.releaseYear = releaseYear;
        }
        else throw new IllegalArgumentException("Неверное значение аргумента releaseYear");
    }

    public String toString() {
        return this.getAuthor() + ": '" + this.getTitle() + "', " + this.getReleaseYear();
    }

    public boolean equals(Book book) {
        if (this == book) {
            return true;
        }
        if (!this.title.equals(book.title)) {
            return false;
        }
        if (!this.author.equals(book.author)) {
            return false;
        }
        if (this.releaseYear != book.releaseYear) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = title.hashCode() + author.hashCode();
        result = 31 * result + releaseYear;
        return result;
    }
}