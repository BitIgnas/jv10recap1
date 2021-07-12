package practice.oop.procedural_vs_oop;

public class EmployeeOopV1 {
    private int baseSalary;
    private int hourlyRate;

    public EmployeeOopV1(int baseSalary, int hourlyRate) {
        // this.baseSalary = baseSalary;
        // this.hourlyRate = hourlyRate;
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public EmployeeOopV1(int baseSalary) {
        this(baseSalary, 0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("Not valid");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            System.out.println("Not valid");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
}
