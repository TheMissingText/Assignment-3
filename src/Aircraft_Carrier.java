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
    public String getName(){
        return "Aircraft Carrier";
    }

    @Override
    public boolean checkStatus() {
        return (strength == 0);
    }

    @Override
    public int getStrength(){
        return this.strength;
    }

    @Override
    public void takeStrength(){
        this.strength -= 1;
    }
}
