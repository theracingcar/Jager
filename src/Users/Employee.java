package Users;
import Factory.Factory;

/**
 * Created by Rory on 7/9/2017.
 */
public class Employee extends User {
    public String UID;
    public String firstname;
    public String lastname;
//    public Week week;
    public double experience;
    public int praise;

    public Employee(String firstname, String lastname){

        this.firstname = firstname;
        this.lastname = lastname;
//        this.week = Factory.createWeek();
        this.experience = 0;
        this.praise = 0;

    }

    public void print(){
        System.out.println("User ID: " + UID);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Week: ");
//        week.print();
        System.out.println("Experience: " + experience);
        System.out.println("Praises: " + praise);

        System.out.println();
    }

    public void praise(){
        praise++;
    }

    public void worked(double time){

        experience = experience + time;

    }



}
