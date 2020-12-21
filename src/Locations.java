public class Locations {

    private boolean hit = false;
    private Object occupied = null;
    private String pointer = " ";

    public boolean beenHit(){
        return this.hit;
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
}
