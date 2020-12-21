public class Patrol_Boat implements Ships{

    private int length = 2;
    private int strength = 2;
    private boolean sunk = false;

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public boolean getStatus() {
        return this.sunk;
    }

    @Override
    public boolean checkStatus() {
        return (this.strength == 0);
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public void takeStrength() {
        this.strength -= 1;
    }
}
