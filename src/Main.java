import java.time.LocalDate;

class Author {
    private String name;
    private String surname;

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}

class Book {
    private String title;
    private Author author;
    private int releaseYear;

    Book(String title, Author author, int releaseYear) {
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
    }
}

public class Main {
    public static void main(String[] args) {
        Author gosling = new Author("Райяан", "Гослинг");
        Author noname = new Author("Ноунейм", "Какой-то");

        Book modernMasterpiece = new Book("Шедевр современности", gosling, 2025);
        Book hackneyedClassic = new Book("Избитая классика", noname, 1978);

        System.out.println(modernMasterpiece.getTitle());
        System.out.println(hackneyedClassic.getTitle());

        System.out.println(modernMasterpiece.getReleaseYear());
        System.out.println(hackneyedClassic.getReleaseYear());

        System.out.println(modernMasterpiece.getAuthor().getSurname());
        System.out.println(hackneyedClassic.getAuthor().getName());

        hackneyedClassic.setReleaseYear(1964);
        System.out.println(hackneyedClassic.getReleaseYear());
    }
}