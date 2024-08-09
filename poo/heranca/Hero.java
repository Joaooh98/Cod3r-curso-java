package poo.heranca;

public class Hero extends Player {
    
    boolean attack(Player opponent){
        int deltaX = Math.abs(x- opponent.x);
        int deltaY = Math.abs(y- opponent.y);

        if (deltaX == 0 && deltaY == 1) {
            opponent.life  -= 20;
            return false;
        }else if (deltaX == 1 && deltaY == 0) {
            opponent.life -= 20;
            return true;
        }else{
            return false;
        }
    }
}
