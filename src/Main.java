public class Main {
    public static void main(String[] args) {
        // task 1
        int [] arr1 = new int[] {1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986};
        char [] myArr = {'a', 'b', 'c'};

        // task 2
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
            }
            else System.out.printf("%s, ", arr1[i]);
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            }
            else System.out.printf("%s, ", arr2[i]);
        }
        System.out.println();

        for (int i = 0; i < myArr.length; i++) {
            if (i == myArr.length - 1) {
                System.out.print(myArr[i]);
            }
            else System.out.printf("%s, ", myArr[i]);
        }
        System.out.println();

        // task 3
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
            }
            else System.out.printf("%s, ", arr1[i]);
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
            }
            else System.out.printf("%s, ", arr2[i]);
        }
        System.out.println();

        for (int i = myArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArr[i]);
            }
            else System.out.printf("%s, ", myArr[i]);
        }
        System.out.println();

        // task 4
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) arr1[i]++;
            System.out.printf("%s ", arr1[i]);
        }
    }
}