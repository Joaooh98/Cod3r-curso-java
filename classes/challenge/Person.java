package classes.challenge;

public class Person {
    String name;

    double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eatFoood(Food food){
        weight = food.weight + weight;
    }
}
