package poo.polimorfismo;

public class Dinner {
    public static void main(String[] args) {
        Person guest = new Person(99.65);

        Rise rise = new Rise(0.2);
        Bean bean = new Bean(0.1);

        System.out.println(guest.getWeight());

        guest.eat(rise);
        guest.eat(bean);

        System.out.println(guest.getWeight());
        
        IceCream iceCream = new IceCream(0.3);
        
        guest.eat(iceCream);
        System.out.println(guest.getWeight());
    }
}
