import java.util.UUID;

/**
 * Created by Rory on 7/9/2017.
 */
public class Factory {


   static public Week createWeek(){
        Week output = new Week();

        output.add(new Day("Monday", false));
        output.add(new Day("Tuesday", false));
        output.add(new Day("Wednesday", false));
        output.add(new Day("Thursday", false));
        output.add(new Day("Friday", false));
        output.add(new Day("Saturday", true));
        output.add(new Day("Sunday", true));

        for (Day i : output){
            i.add(new Job(false, null, null, 0));
            i.add(new Job(false, null, null, 1));
            i.add(new Job(false, null, null, 2));
            i.add(new Job(false, null, null, 3));
            i.add(new Job(false, null, null, 4));
            i.add(new Job(false, null, null, 5));
            i.add(new Job(false, null, null, 6));
            i.add(new Job(false, null, null, 7));
            i.add(new Job(false, null, null, 8));
            i.add(new Job(false, null, null, 9));
            i.add(new Job(false, null, null, 10));
            i.add(new Job(false, null, null, 11));
            i.add(new Job(false, null, null, 12));
            i.add(new Job(false, null, null, 13));
            i.add(new Job(false, null, null, 14));
            i.add(new Job(false, null, null, 15));
            i.add(new Job(false, null, null, 16));
            i.add(new Job(false, null, null, 17));
            i.add(new Job(false, null, null, 18));
            i.add(new Job(false, null, null, 19));
            i.add(new Job(false, null, null, 20));
            i.add(new Job(false, null, null, 21));
            i.add(new Job(false, null, null, 22));
            i.add(new Job(false, null, null, 23));






        }


        return output;
    }

    static public Store createStore(){

        return null;

    }

    static public Employee createEmployee(String firstname, String lastname, String SID){

        Employee output = new Employee(firstname, lastname);
        output.UID = "U" + UUID.randomUUID();

        return output;

    }
}
