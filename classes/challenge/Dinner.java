package classes.challenge;

public class Dinner {
    public static void main(String[] args) {
        Food foodRise = new Food("rice", 0.100);
        Food foodBean = new Food("bean", 0.100);

        Person person = new Person("john carlos", 80.00);
        
        person.eatFoood(foodBean);
        person.eatFoood(foodRise);

        System.out.println(person.weight);
    }
}
