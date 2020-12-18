public class Aircraft_Carrier implements Ships{

    private int length = 5;
    private boolean sunk = false;
    private int strength = 5;

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
        return (strength == 0);
    }

    public int getStrength(){
        return this.strength;
    }

    public void takeStrength(){
        this.strength -= 1;
    }
}
