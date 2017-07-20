package Users;
import Factory.Factory;

import java.util.Date;

/**
 * Created by Rory on 7/9/2017.
 */
public class Employee extends User {

    public double experience;
    public int praise;
    public String SID;


    public Employee() {

        this.praise = 0;
        this.experience = 0;

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

    public void setSID(String input){
        this.SID = input;
    }

    public void praise(){
        praise++;
    }

    public void worked(double time){

        experience = experience + time;

    }



}
