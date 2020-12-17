package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication extends Student {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>> students = new HashMap<>();

        Student student1 = new Student("Amber", new ArrayList<>());
        student1.addGrade(99.0);
        student1.addGrade(78.56);
        student1.addGrade(89.3);
        student1.addGrade(77.99);

        Student student2 = new Student("William", new ArrayList<>());
        student2.addGrade(90.0);
        student2.addGrade(99.5);
        student2.addGrade(70.6);
        student2.addGrade(89.4);

        Student student3 = new Student("Ashley", new ArrayList<>());
        student3.addGrade(87.5);
        student3.addGrade(90.5);
        student3.addGrade(88.6);
        student3.addGrade(100.0);

        Student student4 = new Student("Rita", new ArrayList<>());
        student4.addGrade(90.5);
        student4.addGrade(95.5);
        student4.addGrade(85.5);
        student4.addGrade(90.5);


        // System.out.println(student1.getName() + student1.getGrade());


        students.put("Ambercrombie", student1.getGrade());
        students.put("dole.r.Bill", student2.getGrade());
        students.put("Ashleyknees", student3.getGrade());
        students.put("Ritabook", student4.getGrade());
        System.out.println(students);

        Set<String> keys = students.keySet();

        // 3. Command Line Interface

        // step 1. greet the user

        // step 2. Display the username options to the user

        // step 3. Ask the user if they would like to get more info on a student

        // step 4. If the user inputs y or yes, continue if user selects n or no exit else ask again

        // step 5. prompt user to enter a username from the list provided

        // step 6. if user input does not match usernames provided prompt user to enter again

        // step 7. display name, username and gpa that correlates to user input

        // step 8. Ask user if the would like to repeat if no end, if yes start over.


        System.out.println("\n\n ^V^V^V^V^V^V^V^V^V Welcome to GITHUB GRADE GRABBER V^V^V^V^V^V^V^V^V^V\n");
        System.out.println("            Below are the usernames of students in Github\n");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|  | Ambercrombie |   | dole.or.Bill |   | Ashleyknees |   | Ritabook |  |");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\n       Would you like to get more info about a student? [y/n]");


        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();
        boolean getStudentInfo = true;


        // conditional that checks if user wants to get info and responds based on user's response.

        if (userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("y")) {
            System.out.println("\nWhich student would you like to know more about?");
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            getStudentInfo = false;
            System.out.println("goodbye");
        } else {
            System.out.println("Response is not valid");
        }


        //do while loop to used to get Student info based off users input

        do {
            Scanner scn2 = new Scanner(System.in);
            userInput = scn2.nextLine();

            if (userInput.equals("Ambercrombie")) {
                System.out.println("Name: " + student1.getName() + "\n" + "Grade: " + student1.getGradeAverage());
                for (String key : keys) {
                    if (students.get(key).equals(student1.getGrade())) {
                        System.out.println("Username: " + key);
                    }
                }
            } else if (userInput.equals("dole.or.Bill")) {
                System.out.println("Name: " + student2.getName() + "\n" + "Grade: " + student2.getGradeAverage());
                for (String key : keys) {
                    if (students.get(key).equals(student2.getGrade())) {
                        System.out.println("Username: " + key);
                    }
                }
            } else if (userInput.equals("Ashleyknees")) {
                System.out.println("Name: " + student3.getName() + "\n" + "Grade: " + student3.getGradeAverage());
                for (String key : keys) {
                    if (students.get(key).equals(student3.getGrade())) {
                        System.out.println("Username: " + key);
                    }
                }
            } else if (userInput.equals("Ritabook")) {
                System.out.println("Name: " + student4.getName() + "\n" + "Grade: " + student4.getGradeAverage());
                for (String key : keys) {
                    if (students.get(key).equals(student4.getGrade())) {
                        System.out.println("Username: " + key);
                    }
                }
            } else {
                System.out.println("Username not valid");
            }

            System.out.println("\nWould you like to get another student's information?");
            Scanner scn3 = new Scanner(System.in);
            userInput = scn3.nextLine();

            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
                System.out.println("\nWhich student would you like to know more about?");
            } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
                System.out.println("goodbye");
                getStudentInfo = false;
            } else {
                System.out.println("Response not valid");
               break;

            }
        }

        while(getStudentInfo);

    }
}




