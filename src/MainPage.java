import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rory on 7/2/2017.
 */

public class MainPage {

   static public ArrayList<String> SID = new ArrayList<String>();

   static public ArrayList<String> UID = new ArrayList<String>();

   static public HashMap<String, Store> MAIN = new HashMap<>();

    static public void printMain(){
        for(Store i : MAIN.values()){
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

        printMain();


    }
}
