public class Main {
    public static void main(String[] args) {
        Author gosling = new Author("Райяан", "Гослинг");
        Author unknown = new Author("Автор", "Неизвестен");

        Book modernMasterpiece = new Book("Шедевр современности", gosling, 2025);
        Book hackneyedClassic = new Book("Избитая классика", unknown, 1978);
        Book hackneyedClassicDuplicate = new Book("Избитая классика", unknown, 1978);

        System.out.println(modernMasterpiece);
        System.out.println(gosling);

        System.out.println(hackneyedClassic.equals(hackneyedClassicDuplicate));
        hackneyedClassic.setReleaseYear(2001);
        System.out.println(hackneyedClassic.equals(hackneyedClassicDuplicate));
    }
}