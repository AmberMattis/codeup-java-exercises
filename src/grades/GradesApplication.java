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

            Student student2 = new Student( "William", new ArrayList<>());
            student2.addGrade(90.0);
            student2.addGrade(99.5);
            student2.addGrade(70.6);
            student2.addGrade(89.4);

            Student student3 = new Student( "Ashley", new ArrayList<>());
            student3.addGrade(87.5);
            student3.addGrade(90.5);
            student3.addGrade(88.6);
            student3.addGrade(100.0);

            Student student4 = new Student( "Reed", new ArrayList<>());
            student4.addGrade(90.5);
            student4.addGrade(95.5);
            student4.addGrade(85.5);
            student4.addGrade(90.5);









       // System.out.println(student1.getName() + student1.getGrade());


        students.put("Ambercrombie", student1.getGrade());
        students.put("dole.r.Bill", student2.getGrade());
        students.put("Ashleyknees", student3.getGrade());
        students.put("Reedabook", student4.getGrade());
        System.out.println(students);

        // 3. Command Line Interface

        // step 1. greet the user

        // step 2. Display the username options to the user

        // step 3. Ask the user if they would like to get more info on a student

        // step 4. If the user inputs y or yes, continue if user selects n or no exit else ask again

        // step 5. prompt user to enter a username from the list provided

        // step 6. if user input does not match usernames provided prompt user to enter again

        // step 7. display name, username and gpa that correlates to user input

        // step 8. Ask user if the would like to repeat if no end, if yes start over.


        // 1 //

        System.out.println("\n\n^V^V^V^V^V^V^V^V Welcome to GITHUB GRADE GRABBER V^V^V^V^V^V^V^V^V");




    }
}
