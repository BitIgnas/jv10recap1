package operators;

    public class Operators {
        public static void main(String[] args) {
        /**
         * 1.Assigment operators
         */

        int x = 5;
        int y = 10;
        x += y;
        x -= y;
        x *= y;
        x /= y;

        /**
         * Relation operators
         */

        System.out.println(x == x);
        System.out.println(x != x);
        System.out.println(x < x);
        System.out.println(x > x);
        System.out.println(x >= x);
        System.out.println(x <= x);

        /**
         * Logical operators (salygos)
         */
        CarService carService = new CarService();
        Car car = carService.getCar();
        x = 5;
        System.out.println(x == 8 && car.year == 5);
        System.out.println(x == 8 & car.year == 5);
        // && - short circuit (trumpesnio tikrinimo, tikrina tik viena puse jei reikia) logical operator
        // & - long circuit (ilgesnio tikrinimo, tikrina abi puses betkokiu atveju) logical operator
        System.out.println(x == 5 | car.getPrice() == 5);

        /**
         * Conditional operator
         */

        boolean isValid = 5 > 2 ? true : false;
    }

    static class Car {
        int price;
        Integer year;

        public int getPrice() {
            return price;
        }
    }

    static class CarService {
        public Car getCar() {
            Car car = new Car();
            car.price = 50;
            car.year = null;
            return car;
        }
    }
}
