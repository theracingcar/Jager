/**
 * Created by Rory on 7/2/2017.
 */
public class Job {
    public boolean shift;
    public String type;
    public String location;
    public int time;

    Job(boolean shift, String type, String location, int time){
        this.shift = shift;
        this.type = type;
        this.location = location;
        this.time = time;
    }

    public boolean getShift(){
        return shift;
    }

    public String getType(){
        return type;
    }

    public String getLocation(){
        return location;
    }

    public int getTime() { return time;}

    public void clear() {
        shift = false;
        type = null;
        location = null;
    }

    public void addJob(String type, String location, int time) {

        this.location = location;
        this.type = type;
        this.time = time;
        this.shift = true;

    }

    public void removeJob() {

        this.location = null;
        this.type = null;
        this.shift = false;

    }


}
