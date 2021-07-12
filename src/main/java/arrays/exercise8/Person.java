package arrays.exercise8;

import java.time.LocalDate;
import java.time.Period;

abstract class Person {

    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private int age;

    public Person(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        calculateAge(dateOfBirth);
    }

    public void calculateAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        if (dateOfBirth != null) {
            this.age = Period.between(dateOfBirth, currentDate).getYears();
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}
