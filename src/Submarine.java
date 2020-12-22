public class Submarine implements Ships{

    private int length = 3;
    private int strength = 3;
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
    public String getName(){
        return "Submarine";
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
