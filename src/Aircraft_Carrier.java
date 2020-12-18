public class Aircraft_Carrier implements Ships{

    private int length;
    private boolean sunk;
    private int strength;

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
        int length = 5;
        return length;
    }

    @Override
    public boolean checkStatus() {
        return (strength == 0);
    }

    public int getStrength(){
        return this.strength;
    }

    public void takeStrength(){
        this.strength -= 1;
    }
}
