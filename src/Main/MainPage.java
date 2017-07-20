package Main;

import Store.Store;
import Factory.Factory;
import Users.Employee;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rory on 7/2/2017.
 */

public class MainPage {

    //TODO Website
    //TODO Security


   static public ArrayList<String> SID = new ArrayList<String>();

   static public ArrayList<String> UID = new ArrayList<String>();

   static public HashMap<String, Store> MAINS = new HashMap<>();

   static public HashMap<String, Employee> MAINU = new HashMap<>();

    static public void printMAINS(){
        for(Store i : MAINS.values()){
            i.print();
        }
    }

    static public void printMAINU(){
        for(Employee i : MAINU.values()){
            i.print();
        }
    }

    static public void printID(ArrayList<String> array){
        for (String i : array){
            System.out.println(i);
        }
    }





    public static void main(String[] args) {

        Factory.createStore("Test");

        Factory.createEmployee("Test1", "Test2", SID.get(0));

        printMAINS();
        printMAINU();


    }
}
