package poo.heranca.challenge;

public class Car {
    
    private int currentSpeed;

    void run(){
        this.currentSpeed += 5;
    }

    void brake(){
       if (this.currentSpeed > 5) {
           this.currentSpeed -= 5;
       } 
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
