public class Main {
    public static void main(String[] args) {
        // task 1
        int number = 1234567; byte byteNumber = 64;
        short smallNumber = 22334; long bigNumber = 9223372036854775807L;
        float floatNumber = 3.14f; double doubleNumber = 3.14;

        System.out.println(
                "Значение переменной number с типом int равно " + number
        );
        System.out.println(
                "Значение переменной byteNumber с типом byte равно " + byteNumber
        );
        System.out.println(
                "Значение переменной smallNumber с типом short равно " + smallNumber
        );
        System.out.println(
                "Значение переменной bigNumber с типом long равно " + bigNumber
        );
        System.out.println(
                "Значение переменной floatNumber с типом float равно " + floatNumber
        );
        System.out.println(
                "Значение переменной doubleNumber с типом double равно " + doubleNumber
        );

        // task 2
        float first = 27.12f; long second = 987678965549L;
        double third = 2.786; short fourth = 569;
        short fifth = -159; short sixth = 27897;
        byte seventh = 67;

        // task 3
        byte lpClass = 23; byte asClass = 27; byte eaClass = 30;
        short paperAmount = 480;

        byte total = (byte) (lpClass + asClass + eaClass);
        short each = (short) (paperAmount / total);

        System.out.println("На каждого ученика рассчитано " + each + " листов бумаги");

        // task 4
        byte bottlesPerMinute = 16 / 2;
        short min20 = (short) (bottlesPerMinute * 20);
        short day = (short) (bottlesPerMinute * 60 * 24);
        int day3 = day * 3;
        int month = day * 31;

        System.out.println("За 20 минут машина произвела " + min20 + " бутылок");
        System.out.println("За сутки машина произвела " + day + " бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " бутылок");

        // task 5
        byte needed = 120;
        byte eachWhite = 2; byte eachBrown = 4;
        byte perClass = (byte) (eachWhite + eachBrown);

        byte classAmount = (byte) (needed / perClass);
        byte totalWhite = (byte) (classAmount * eachWhite);
        byte totalBrown = (byte) (classAmount * eachBrown);

        System.out.println(
                "В школе, где " + classAmount + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски"
        );

        //task 6
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        byte bananaAmount = 5;
        byte milkAmount = 2;
        byte iceCreamAmount = 2;
        byte eggAmount = 4;

        short totalWeight = (short) (bananaWeight * bananaAmount + milkWeight * milkAmount + iceCreamWeight * iceCreamAmount + eggWeight * eggAmount);
        float totalWeightKg = (float) (totalWeight) / 1000;

        System.out.println(totalWeight);
        System.out.println(totalWeightKg);

        // task 7
        short losePerDay250 = 250;
        short losePerDay500 = 500;
        short goal = 7 * 1000;

        byte days250 = (byte) (goal / losePerDay250);
        byte days500 = (byte) (goal / losePerDay500);
        byte daysAvg = (byte) ((days250 + days500) / 2);

        System.out.println("Если терять по 250г в день, нужно дней: " + days250);
        System.out.println("Если терять по 500г в день, нужно дней: " + days500);
        System.out.println("Чтобы потерять 7кг нужно в среднем дней: " + daysAvg);

        // task 8
        int maria = 67760; int denis = 83690; int cristina = 76230;

        int newMaria = maria + maria / 10;
        int newDenis = denis + denis / 10;
        int newCristina = cristina + cristina / 10;

        int diffMaria = (newMaria - maria) * 12;
        int diffDenis = (newDenis - denis) * 12;
        int diffCristina = (newCristina - cristina) * 12;

        System.out.println(
                "Маша теперь получает " + newMaria + " рублей. Годовой доход вырос на " + diffMaria + " рублей"
        );
        System.out.println(
                "Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей"
        );
        System.out.println(
                "Кристина теперь получает " + newCristina + " рублей. Годовой доход вырос на " + diffCristina + " рублей"
        );
    }
}
