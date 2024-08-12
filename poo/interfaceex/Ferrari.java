package poo.interfaceex;


public class Ferrari extends Car implements Esport, Luxury{

    private boolean onTurbo;

    private boolean onAir;

    public Ferrari() {
        super(315);
    }

    public Ferrari(int limitSpeed) {
        super(limitSpeed);
        setDelta(15);
    }

    @Override
    public void onAir() {
        onAir = true;
    }
    
    @Override
    public void offAir() {
        onAir = false;
    }

    @Override
    public void onTurbo() {
        onTurbo = true;
    }
    
    @Override
    public void offTurbo() {
        onTurbo = false;
    }

    @Override
    public int getDelta() {
        if (onTurbo && !onAir) {
            return 35;
        }else if (onTurbo && onAir) {
            return 35;
        }else if (!onTurbo && !onAir) {
            return 35;
        }else{
            return 15;
        }
    }
}
