package poo.testclass;

import poo.onetoone.bidirectional.Car;

@SuppressWarnings("all")
public class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();
        System.out.println(carOne.isConnected());

        carOne.toConnect();
        System.out.println(carOne.isConnected());
        System.out.println(carOne.motor.spins());
        
        carOne.speedUp();
        carOne.speedUp();
        carOne.speedUp();
        carOne.speedUp();

        System.out.println(carOne.motor.spins());

        carOne.brake();
        carOne.brake();
        carOne.brake();
        carOne.brake();
        carOne.brake();
        carOne.brake();

        System.out.println(carOne.motor.spins());
    }
}
