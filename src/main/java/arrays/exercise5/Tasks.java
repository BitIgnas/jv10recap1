package arrays.exercise5;

public class Tasks {

    public static void task1(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num*1);
        }
    }

    public static void printAllEvenNumbers() {
        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 ==0 ) {
                System.out.println(i);
            }
        }
    }

    public static void addMultiNumbers(int num) {
        StringBuilder stringBuilder = new StringBuilder(num);

        for (int i = 0; i < num ; i++) {
            System.out.println(stringBuilder.append(num));
        }
    }

    public static void devideBy3And5AndOnly() {

        System.out.print("Dalinasi is 3: ");
        for (int i = 0; i <= 100; i++) {
            if((i % 3 == 0 && i % 5 == 0) || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nDalinasi is 3 && 5 : ");
        for (int i = 0; i <= 100; i++) {
            if((i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nDalinasi is 5 : ");
        for (int i = 0; i <= 100; i++) {
            if((i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
