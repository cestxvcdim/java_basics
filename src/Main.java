public class Main {
    public static void main(String[] args) {
        // task 1
        String firstName = "Ivanov";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.printf("Ф.И.О. сотрудника — %s\n", fullName);

        // task 2
        String upperFullName = fullName.toUpperCase();
        System.out.printf("Данные Ф.И.О. сотрудника для заполнения отчета — %s\n", upperFullName);

        // task 3
        fullName = "Иванов Семён Семёнович".replace('ё', 'е');
        System.out.printf("Данные Ф.И.О. сотрудника — %s\n", fullName);

    }
}