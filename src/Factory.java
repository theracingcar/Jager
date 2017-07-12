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
            i.add(new Event(false, null, null, 0));
            i.add(new Event(false, null, null, 1));
            i.add(new Event(false, null, null, 2));
            i.add(new Event(false, null, null, 3));
            i.add(new Event(false, null, null, 4));
            i.add(new Event(false, null, null, 5));
            i.add(new Event(false, null, null, 6));
            i.add(new Event(false, null, null, 7));
            i.add(new Event(false, null, null, 8));
            i.add(new Event(false, null, null, 9));
            i.add(new Event(false, null, null, 10));
            i.add(new Event(false, null, null, 11));
            i.add(new Event(false, null, null, 12));
            i.add(new Event(false, null, null, 13));
            i.add(new Event(false, null, null, 14));
            i.add(new Event(false, null, null, 15));
            i.add(new Event(false, null, null, 16));
            i.add(new Event(false, null, null, 17));
            i.add(new Event(false, null, null, 18));
            i.add(new Event(false, null, null, 19));
            i.add(new Event(false, null, null, 20));
            i.add(new Event(false, null, null, 21));
            i.add(new Event(false, null, null, 22));
            i.add(new Event(false, null, null, 23));






        }


        return output;
    }


    static public Employee createEmployee(String firstname, String lastname, String SID){

        Employee output = new Employee(firstname, lastname);
        String id = "U" + UUID.randomUUID();
        MainPage.UID.add(id);
        output.UID = id;

        MainPage.MAIN.get(SID).employees.put(id,output);

        return output;

    }

    static public Store createStore(String name){
        Store output = new Store(name);

        String id = "S" + UUID.randomUUID();

        output.SID = id;

        MainPage.SID.add(id);

        MainPage.MAIN.put(id, output);

        return output;


    }
}
