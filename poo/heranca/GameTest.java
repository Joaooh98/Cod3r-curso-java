package poo.heranca;

public class GameTest {
    public static void main(String[] args) {
        Player jOne = new Monster();

        jOne.x = 10;
        jOne.y = 10;

        Player jTwo = new Hero();

        jTwo.x = 10;
        jTwo.y = 11;

        System.out.println(jOne.life);
        System.out.println(jTwo.life);
        
        jOne.attack(jTwo);
        jTwo.attack(jOne);
        
        System.out.println(jOne.life);
        System.out.println(jTwo.life);

    }
}
