package poo.composicao.onetoone;

public class Motor {
    
    Car car;
    boolean connected = false;
    double injectionFactor = 1;

    public Motor(Car car) {
        this.car = car;
    }

    public int spins(){
        if (!connected) {
            return 0;
        }
        return (int) Math.round(injectionFactor * 3000);
    }
}
