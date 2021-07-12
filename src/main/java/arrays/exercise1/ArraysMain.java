package arrays.exercise1;

public class ArraysMain {
    public static void main(String[] args) {

        int[] numberArray = new int[5];
        numberArray[0] = 1;
        numberArray[1] = 2;
        numberArray[2] = 3;

        String[] stringArray = {
          "test",
          "test",
          "test"
        };

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
