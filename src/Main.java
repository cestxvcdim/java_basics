import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1
        int [] arr1 = {10000, 12000, 5000, 30000, 27500};
        int sum = Arrays.stream(arr1).sum();
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sum);

        // task 2
        int [] arr2 = {2000, 3500, 1400, 6900, 4760};
        int minSpend = Arrays.stream(arr2).min().getAsInt();
        int maxSpend = Arrays.stream(arr2).max().getAsInt();
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей.\n", minSpend);
        System.out.printf("Максимальная сумма трат за неделю составила %s рублей.\n", maxSpend);

        // task 3
        double [] arr3 = {23000, 16700, 7750, 14000, 17800};
        double average = Arrays.stream(arr3).sum() / arr3.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", average);

        // task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (char c: reverseFullName) {
            System.out.print(c);
        }
    }
}