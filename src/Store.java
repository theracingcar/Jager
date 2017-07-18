import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rory on 7/9/2017.
 */
public class Store {
    public String name;
    public String SID;
    public ArrayList<String> employees;

    public Store(String name){
        this.name = name;
        this.employees = new ArrayList<>();

    }

    public void print(){
        System.out.println("Store Name: " + name);
        System.out.println("Store ID: " + SID);
        System.out.println("Employees:");
        for(String i : employees){
            MainPage.MAINU.get(i).print();
        }

    }
}
