package poo.polimorfismo;

public class Rise {

    private double weight;

    public Rise(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }
}
