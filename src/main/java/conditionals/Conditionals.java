package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        Person larry = new Person();
        larry.age = 18;
        larry.weight= 89;

        Person jim = new Person();
        jim.age = 23;
        jim.weight= 70;

        if(larry.age < 18) {
            System.out.println("Go to school");
        } else if(larry.age >= 18 && larry.age < 60) {
            System.out.println("Drink bear");
        } else {
            System.out.println("Go work");
        }
    }
}

class Person {
    int age;
    int weight;


}
