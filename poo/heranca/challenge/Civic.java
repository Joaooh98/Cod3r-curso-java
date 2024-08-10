package poo.heranca.challenge;

public class Civic extends Car{
    
    private int currentSpeed;

    void brake() {
        super.brake();
    }

    void run() {
       this.currentSpeed =+ 7;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
