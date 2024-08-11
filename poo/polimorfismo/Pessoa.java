package poo.polimorfismo;

public class Pessoa {
    
    private double weight;

    public Pessoa(double weight) {
        this.weight = weight;
    }

    public void eat(Rise rise){
        this.weight += rise.getWeight();
    }
    public void eat(Bean bean){
        this.weight += bean.getWeight();
    }
    public void eat(IceCream iceCream){
        this.weight += iceCream.getWeight();
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
