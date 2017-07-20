package Users;
import java.util.Date;

/**
 * Created by Rory on 7/18/2017.
 */
public class User {

    public String UID;
    public String firstname;
    public String lastname;
    public String email;
    public String phoneno;
    public Date dob;

    public User(){}

    public void setFirstname(String input){
        this.firstname = input;
    }

    public void setLastname(String input){
        this.lastname = input;
    }

    public void setEmail(String input){
        this.email = input;
    }

    public void setPhoneno(String input){
        this.phoneno = input;
    }

    public void setDob(Date input){
        this.dob = input;
    }




}
