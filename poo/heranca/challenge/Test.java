package poo.heranca.challenge;

public class Test {
    public static void main(String[] args) {
        
        Car car = new Car();

        car = new Ferrari();
        car.run();

        System.out.println(car.getCurrentSpeed());
        car.brake();
        
        car = new Civic();
        
        car.run();
        System.out.println(car.getCurrentSpeed());
        car.brake();;

    }
}
