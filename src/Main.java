public class Main {
    public static void main(String[] args) {
        // task 1
        int monthsAmount = 0;
        int total = 2459000;
        int start = 0;
        while (start < total) {
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", monthsAmount, start);
            monthsAmount++;
            start += 15000;
        }

        // task 2
        int i = 1;
        while (i <= 10) {
            System.out.printf("%s ", i);
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        // task 3
        int population = 12000000;
        int bornPerYear = population / 1000 * (17 - 8);
        for (i = 0; i <= 10; i++) {
            System.out.printf("Год %s, численность населения составляет %s\n", i, population);
            population += bornPerYear;
        }

        // task 4
        total = 15000;
        i = 0;
        while (total < 12000000) {
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, total);
            i++;
            total += total / 100 * 7;
        }

        // task 5
        total = 15000;
        i = 0;
        while (total < 12000000) {
            if (i > 0 && i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, total);
            }
            i++;
            total += total / 100 * 7;
        }

        // task 6
        total = 15000;
        monthsAmount = 9 * 12;
        for (i = 1; i <= monthsAmount; i++) {
            if (i > 0 && i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, total);
            }
            total += total / 100 * 7;
        }

        // task 7
        int firstFriday = 3;
        for (int date = firstFriday; date <= 31; date += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", date);
        }

        // task 8
        int period = 79;
        start = 2025 - 200;
        int end = 2025 + 200;
        for (int year = 0; year <= end; year += period) {
            if (year >= start) System.out.println(year);
        }
    }
}