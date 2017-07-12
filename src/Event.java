/**
 * Created by Rory on 7/2/2017.
 */
public class Event {
    public boolean occupied;
    public String type;
    public String location;
    public int time;

    Event(boolean occupied, String type, String location, int time){
        this.occupied = occupied;
        this.type = type;
        this.location = location;
        this.time = time;
    }

    public boolean getOccupied(){
        return occupied;
    }

    public String getType(){
        return type;
    }

    public String getLocation(){
        return location;
    }

    public int getTime() { return time;}

    public void clear() {
        occupied = false;
        type = null;
        location = null;
    }

    public void addJob(String type, String location) {
        this.location = location;
        this.type = type;
        this.occupied = true;
    }

    public void removeJob() {
        this.location = null;
        this.type = null;
        this.occupied = false;
    }

    public void notAvailable()  {
        this.occupied = true;
        this.location = null;
        this.type = null;
    }


}
