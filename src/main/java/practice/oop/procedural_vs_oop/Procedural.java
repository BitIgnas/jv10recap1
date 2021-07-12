package practice.oop.procedural_vs_oop;

public class Procedural {
    public static void main(String[] args) {
        int baseSalary = 1000;
        int hourlyRate = 5;
        int extraHours = 7;

        // hardcoded values
        // all is in main method
        // parameter count in method

        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
        System.out.println(wage);
    }

    private static int calculateWage(int baseSalary, int hourlyRate, int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
