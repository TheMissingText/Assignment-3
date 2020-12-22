public class Locations {

    private boolean hit = false;
    private Object occupied = null;
    private String pointer = " ";

    public boolean checkHit(){
        return this.hit;
    }

    public void beenHit(){
        this.hit = true;
    }

    public void setOccupied(Object occupation) {
        this.occupied = occupation;
    }

    public boolean checkOccupied(){
        return this.occupied == null;
    }

    public void changePointer(){
        if (checkOccupied()){
            this.pointer = "H";
        }
        this.pointer = "M";
    }

    public String checkPointer(){
        return this.pointer;
    }
}
