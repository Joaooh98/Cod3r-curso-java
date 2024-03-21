package poo.onetoone.bidirectional;

public class Car {

    Motor motor;

    

    public Car() {
        this.motor = new Motor(this);
    }

    void speedUp() {
        if (motor.injectionFactor < 2.5) {
            motor.injectionFactor += 0.4;
        }
    }

    void brake() {
        if (motor.injectionFactor > 0.5) {
            motor.injectionFactor -= 0.4;
        }
    }

    void off() {
        motor.connected = false;
    }

    void toConnect() {
        motor.connected = true;
    }

    boolean isConnected() {
        return motor.connected;
    }
}
