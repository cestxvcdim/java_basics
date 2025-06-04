public class Main {
    public static void main(String[] args) {
        // task 1, 2
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            else System.out.println("Установите версию приложения для Android по ссылке");
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
        short month = 1;
        switch (month) {
            case 1:
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябрь");
            case 12:
                System.out.println("Декабрь");
            default:
                System.out.println("Ошибка");
        }
    }
}
