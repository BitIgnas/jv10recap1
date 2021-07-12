package arrays.exercise8;

import java.time.LocalDate;
import java.time.Period;

public class Student extends Person {

    private double studentGrade;
    private boolean hasPreviousJavaKnowledge;

    public Student(String name, String lastName, LocalDate dateOfBirth, double studentGrade, boolean hasPreviousJavaKnowledge) {
        super(name, lastName, dateOfBirth);
        this.studentGrade = studentGrade;
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }

    public boolean getHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }



    @Override
    public String toString() {
        return "Student{" + "Student name=" + super.getName() + " Student age=" + super.getAge() +
                ", studentGrade=" + this.studentGrade +
                ", hasPreviousJavaKnowledge=" + this.hasPreviousJavaKnowledge +
                '}';
    }
}
