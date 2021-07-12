package string.exercise1;

import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {

        int firstNumber = 1; // -> int type literal

        String line = "abc"; // -> string type literal
        String anotherLine = "abc"; // -> another string literal

        System.out.println(line == anotherLine);
        System.out.println(line.equals(anotherLine));

        String yetAnotherLine = new String("abc"); //created in heap not string pool
        System.out.println(line == yetAnotherLine);
        System.out.println(line.equals(yetAnotherLine));

        String randomString = "Today is sunday";
        char[] chars = randomString.toCharArray();

        for (int i = 0; i < chars.length ; i++) {
            System.out.println(chars[i]);
        }

        System.out.println(randomString.toLowerCase());
        System.out.println(randomString.toUpperCase());

    }
}
