public class Locations {

    private boolean hit = false;
    private Object occupied = null;

    public boolean beenHit(){
        return this.hit;
    }

    public void setOccupied(Object occupation){
        this.occupied = occupation;
      }
}
