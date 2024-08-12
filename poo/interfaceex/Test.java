package poo.interfaceex;


public class Test {
    public static void main(String[] args) {
        

        Ferrari car = new Ferrari(400);
        car.run();
        
        car.brake();
        car.run();
        car.onTurbo();
        car.run();
        car.run();
        
        Civic civic = new Civic();
        
        civic.run();
        civic.brake();;

    }
}
