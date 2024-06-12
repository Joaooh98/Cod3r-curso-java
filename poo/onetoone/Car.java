package poo.onetoone;

public class Car {

    public Motor motor;

    public Car() {
        this.motor = new Motor(this);
    }

    public void speedUp() {
        if (motor.injectionFactor < 2.5) {
            motor.injectionFactor += 0.4;
        }
    }

    public void brake() {
        if (motor.injectionFactor > 0.5) {
            motor.injectionFactor -= 0.4;
        }
    }

    public void off() {
        motor.connected = false;
    }

    public void toConnect() {
        motor.connected = true;
    }

    public boolean isConnected() {
        return motor.connected;
    }
}
