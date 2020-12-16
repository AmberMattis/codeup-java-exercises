package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(){
    }


    public Student(String name, ArrayList<Double> grades){
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }


    public String getName(){
        return name;
    }

    public ArrayList<Double> getGrade(){
        return grades;
    }


    public void addGrade(Double grade){
        grades.add(grade);
    }


    public double getGradeAverage(){
        double sum = 0;
        for (double i : grades) {
            sum += i;
        }
        return sum / grades.size();
    }




    public static void main(String[] args){


// Exercise 1 //


    Student Erin = new Student("Erin", new ArrayList<>());
            Erin.addGrade(85.0);
            Erin.addGrade(99.6);

        System.out.println("\n******** Erin's Grade Report ********\n");

        System.out.println("These are Erin's grades: " + "\n" + Erin.grades + "\n");
        System.out.println("This is Erin's GPA: " +"\n" + Erin.getGradeAverage() + "\n\n");



        Student Jacob = new Student("Jacob", new ArrayList<>());
            Jacob.addGrade(77.8);
            Jacob.addGrade(100.0);

        System.out.println("******** Jacob's Grade Report ********\n");

        System.out.println("These are Jacob's grades: " + "\n" + Jacob.grades  + "\n");
        System.out.println("This is Jacob's GPA: " + "\n" + Jacob.getGradeAverage());






    }
}
