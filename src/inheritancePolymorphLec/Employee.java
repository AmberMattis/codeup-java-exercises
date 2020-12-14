package inheritancePolymorphLec;

import java.util.Scanner;

public class Employee {
    public String name;

    public Employee(){

    }
    public Employee(String name){
        this.name = name;
    }

    public void doWork(){
        System.out.println("Working.....working");
    }

    public String getName(){
        return name;
    }
}
