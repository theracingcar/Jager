import java.util.ArrayList;

/**
 * Created by Rory on 7/2/2017.
 */
public class Day extends ArrayList<Job> {
    public String name;
    public boolean weekend;

    Day(String name, boolean weekend){
        this.name = name;
        this.weekend = weekend;
    }

    public String getName(){
        return name;
    }

    public boolean getWeekend(){
        return weekend;
    }

    public void clear(){
        for(Job i : this){
            i.clear();
        }
    }

    public void addJob(String type, String location, int time){
        for(Job i : this){
            if(i.getTime() == time){
                i.addJob(type, location, time);
            }

        }
    }

    public void removeJob(int time){
        for(Job i : this){
            if(i.getTime() == time){
                i.removeJob();
            }
        }
    }
}
