public class Main {
    public static void main(String[] args) {
        // task 1
        for (int i = 1; i <= 10; i++) System.out.println(i);

        // task 2
        for (int i = 10; i > 0; i--) System.out.println(i);

        // task 3
        for (int i = 0; i < 17; i += 2) System.out.println(i);

        // task 4
        for (int i = 10; i >= -10; i--) System.out.println(i);

        // task 5
        for (int i = 1904; i <= 2096; i += 4) System.out.println(i);

        // task 6
        for (int i = 7; i <= 98; i += 7) System.out.println(i);

        // task 7
        for (int i = 1; i <= 512; i *= 2) System.out.println(i);

        // task 8, 9
        int totalSum = 0;
        int salary = 29000;
        for (int i = 0; i <= 12; i++) {
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, totalSum);
            totalSum += salary + totalSum / 100;
        }

        // task 10
        for (int i = 1; i <= 10; i++) System.out.printf("2*%s=%s\n", i, 2 * i);
    }
}
