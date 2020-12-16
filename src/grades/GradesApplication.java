package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication extends Student{

    public static void main(String[] args){

            HashMap<String, ArrayList<Double>> students = new HashMap<>();
            Student student1 = new Student( "Amber", new ArrayList<>());
            student1.addGrade(99.0);
            student1.addGrade(78.56);
            student1.addGrade(89.3);
            student1.addGrade(77.99);







        System.out.println(student1.getName() + student1.getGrade());


        students.put("Ambercrombie", student1.getGrade());
        System.out.println(students);

    }
}
