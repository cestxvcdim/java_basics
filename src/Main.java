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
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
