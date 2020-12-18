public class Destroyer implements Ships{

    private int length;
    private int strength;
    private boolean sunk;

    public void main(){
        this.length = setLength();
        this.strength = setLength();
        this.sunk = false;
    }
    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public boolean getStatus() {
        return this.sunk;
    }

    @Override
    public int setLength() {
        int length = 3;
        return length;
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
