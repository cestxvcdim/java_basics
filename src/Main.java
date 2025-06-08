import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        int currentYear = LocalDate.now().getYear();
        isLeapYear(currentYear);

        // task 2
        getInstallMessage(0, currentYear);

        // task 3
        getDeliveryMessage(95);

    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");
    }

    public static void getInstallMessage(int clientOS, int clientDeviceYear) {
        String outMessage = "Установите%s версию приложения для %s по ссылке\n";
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.printf(outMessage, " облегчённую", "iOS");
        }
        else if (clientOS == 0) {
            System.out.printf(outMessage, "", "iOS");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.printf(outMessage, " облегчённую", "Android");
        }
        else if (clientOS == 1) {
            System.out.printf(outMessage, "", "Android");
        }
    }

    public static void getDeliveryMessage(int deliveryDistance) {
        short days = 1;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance < 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance < 100) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        }
        else System.out.println("Доставки нет");
    }
}