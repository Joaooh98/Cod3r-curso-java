package poo.onetoone.bidirectional;

public class Motor {
    
    Car car;
    boolean connected = false;
    double injectionFactor = 1;

    public Motor(Car car) {
        this.car = car;
    }

    int spins(){
        if (!connected) {
            return 0;
        }
        return (int) Math.round(injectionFactor * 3000);
    }
}
