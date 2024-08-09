package poo.heranca;

public class Player {

    int life = 100;
    int x;
    int y;

    boolean attack(Player opponent){
        int deltaX = Math.abs(x- opponent.x);
        int deltaY = Math.abs(y- opponent.y);

        if (deltaX == 0 && deltaY == 1) {
            opponent.life  -= 10;
            return false;
        }else if (deltaX == 1 && deltaY == 0) {
            opponent.life -= 10;
            return true;
        }else{
            return false;
        }
    }

    boolean walk(Direction direction){
        switch (direction) {
            case NORTE:
                y--;
                break;
            case LESTE:
                y++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }

        return true;
    }
}
