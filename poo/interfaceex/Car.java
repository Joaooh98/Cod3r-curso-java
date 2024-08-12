package poo.interfaceex;

public class Car {
    
    public final int limitSpeed;
    protected int currentSpeed;
    private int delta = 5;

    public Car(int limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    void run(){
        if (currentSpeed +  getDelta() > limitSpeed) {
            currentSpeed = limitSpeed;
        }else {
            currentSpeed += getDelta();
        }

        System.out.println("run :"+getCurrentSpeed());
    }
    
    void brake(){
        if (this.currentSpeed > 5) {
            this.currentSpeed -= 5;
        }else{
            currentSpeed = 0;
        }
        System.out.println("brake :"+getCurrentSpeed());
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getLimitSpeed() {
        return limitSpeed;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
