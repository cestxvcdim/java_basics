public class Main {
    public static void main(String[] args) {
        // task 1
        byte age = 19;
        if (age >= 18) {
            System.out.println("Совершенолетний");
        }
        else {
            System.out.println("Несовершенолетний");
        }

        // task 2
        byte temperature = 2;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        // task 3
        short speed = 55;
        if (speed > 60) {
            System.out.println("Скорость превышена");
        }
        else {
            System.out.println("Скорость не превышена");
        }

        // task 4
        if (age >= 2 && age < 7) {
            System.out.println("Пора в детский сад");
        }
        else if (age >= 7 && age < 18) {
            System.out.println("Пора в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Пора в универ");
        }
        else if (age >= 24) {
            System.out.println("Пора на работу");
        }

        // task 5
        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Можно кататься на аттракционе, но только со взрослым");
        }
        else if (age >= 14) {
            System.out.println("Можно кататься на аттракционе, даже без взрослого");
        }

        // task 6
        byte capacity = 102;
        byte sitPlaces = 60;
        byte standPlaces = (byte) (capacity - sitPlaces);

        byte sitPlacesBusy = 34;
        byte standPlacesBusy = 57;
        if (sitPlacesBusy < sitPlaces) {
            System.out.println("Есть сидячее место, чувак");
        }
        else if (standPlacesBusy < standPlaces) {
            System.out.println("Есть стоячее место, чувак");
        }
        else {
            System.out.println("Все занято, чувак");
        }

        // task 7
        int one = 14;
        int two = 15;
        int three = 15;

        if (one > two && one > three) {
            System.out.println("one - большее число: " + one);
        }
        else if (two > one && two > three) {
            System.out.println("two - большее число: " + two);
        }
        else if (three > one && three > two) {
            System.out.println("three - большее число: " + three);
        }
        else if (one < two && one < three) {
            System.out.println("two и three - большие числа: " + two);
        }
        else if (two < one && two < three) {
            System.out.println("one и three - большие числа: " + one);
        }
        else if (three < one && three < two) {
            System.out.println("one и two - большие числа: " + one);
        }
        else {
            System.out.println("Все числа равны, это число: " + one);
        }
    }
}
