package poo.heranca.challenge;

public class Ferrari extends Car{
//    e um carro
    private int currentSpeed;

    void brake() {
        super.brake();
    }

    void run() {
        currentSpeed += 10;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
}
