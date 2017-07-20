package Calendar;

import Calendar.Event;

import java.util.ArrayList;

/**
 * Created by Rory on 7/2/2017.
 */
public class Day extends ArrayList<Event> {
    public String name;
    public boolean weekend;

    public Day(String name, boolean weekend){
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
        for(Event i : this){
            i.clear();
        }
    }

    public void addJob(String type, String location, int time){
        for(Event i : this){
            if(i.getTime() == time){
                i.addJob(type, location);
            }

        }
    }

    public void removeJob(int time){
        for(Event i : this){
            if(i.getTime() == time){
                i.removeJob();
            }
        }
    }
}
