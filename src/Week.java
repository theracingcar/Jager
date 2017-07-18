import java.util.ArrayList;

/**
 * Created by Rory on 7/2/2017.
 */
public class Week extends ArrayList<Day> {


    Week(){}


    public void addJob(int day, String type, String location, int time){
                this.get(day-1).addJob(type, location, time);

    }

    public void removeJob(int day, int time){
        this.get(day-1).removeJob(time);

    }

    public void print(){
        System.out.println("|       |   Mon  |   Tue  |   Wed  |   Thu  |   Fri  |   Sat  |   Sun  |");
        System.out.println("--------------------------------------------------------------------------------");
        for(int a = 0; a < 24; a++ ){
            System.out.print("|   " + this.get(0).get(a).getTime() + "   |");
        for(Day i : this){
            System.out.print(" " + i.get(a).getOccupied() + "  |");
        }
            System.out.println();
        }


    }




}
