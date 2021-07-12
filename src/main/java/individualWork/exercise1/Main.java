package individualWork.exercise1;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arrays = new int[]{4, 3, 3, 8, 9, 5, 5};

        System.out.println(sumAllElements(arrays));
        System.out.println(Arrays.stream(arrays).sum());
        System.out.printf("%.0f\n", Arrays.stream(arrays).average().getAsDouble());
        oddNumbers(arrays);
        System.out.println();
        findMinimumAndMaxNumber(arrays);
        reverseArray(arrays);
        findOddsAndEvens(arrays);
        insert(arrays, 4, 2);
        findDuplicates(arrays);
        findSecondLargest(arrays);
        findPairOf4(arrays);
    }

    private static void oddNumbers(int[] arrays) {
        Arrays.stream(arrays).forEach(value -> {
            if (value % 2 != 0) {
                System.out.print(arrays);
            }
        });
    }

    public static int sumAllElements(int[] givenArray) {

        int sum = 0;
        for (int i = 0; i < givenArray.length; i++) {
            sum += givenArray[i];
        }
        return sum;
    }

    public static void findMinimumAndMaxNumber(int[] array) {
        System.out.println("Max element: " + Arrays.stream(array).max().getAsInt());
        System.out.println("Min element: " + Arrays.stream(array).min().getAsInt());
    }

    public static void reverseArray(int[] array) {
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, array.length)
                .map(i -> array[array.length - i])
                .toArray()));
    }

    public static void findOddsAndEvens(int[] arrays) {
        int tempOdd = 0;
        int tempEven = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                tempOdd++;
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                tempEven++;
            }
        }

        System.out.println("Odd numbers: " + tempOdd);
        System.out.println("Even numbers: " + tempEven);

    }


    public static void insert(int[] a, int key, int index) {
        int[] result = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }

        result[index] = key;

        for (int i = index + 1; i <= a.length; i++) {
            result[i] = a[i - 1];
        }

        System.out.println(Arrays.toString(result));
    }

    public static void findDuplicates(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
    }

    public static void findSecondLargest(int[] array) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        System.out.println(high2);
    }

    public static void findPairOf4(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i] + array[j] == 4) ) {
                    System.out.println(i + " - " + j);
                }
            }
        }
    }
}

