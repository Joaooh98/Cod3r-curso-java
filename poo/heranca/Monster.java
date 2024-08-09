package poo.heranca;

public class Monster extends Player{
    
    boolean attack(Player opponent){
        boolean attack = super.attack(opponent);
        boolean attackTwo = super.attack(opponent);

        return attack || attackTwo;
    }
}
