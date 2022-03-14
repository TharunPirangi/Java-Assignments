package java_assignments.assignment5.main;

import java_assignments.assignment5.data.Data;
import java_assignments.assignment5.singleton.Singleton;

public class Main {
    public static void main(String args[]){
        Data data = new Data();
        data.printInstanceVariables();
        data.printLocalVariables();


        Singleton singleton = Singleton.getInstance("tharun");
        singleton.printName();
    }
}
