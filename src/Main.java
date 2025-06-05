public class Main {
    public static void main(String[] args) {
        // task 1, 2
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        String outMessage = "Установите%s версию приложения для %s по ссылке\n";
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.printf(outMessage, " облегчённую", "iOS");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.printf(outMessage, "", "iOS");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.printf(outMessage, " облегчённую", "Android");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.printf(outMessage, "", "Android");
        }

        // task 3
        short year = 2025;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");

        // task 4
        short deliveryDistance = 95;
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

        // task 5
        byte monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
