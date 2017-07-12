/**
 * Created by Rory on 7/9/2017.
 */
public class Employee {
    public String UID;
    public String firstname;
    public String lastname;
    public Week week;

    public Employee(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.week = Factory.createWeek();
    }

    public void print(){
        System.out.println("User ID: " + UID);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Week: ");
        week.print();
        System.out.println();
    }

}
