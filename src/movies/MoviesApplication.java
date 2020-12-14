package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args){
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("view movies in the drama category");
        System.out.println("view movies in the horror category");
        System.out.println("view movies in the scifi category\n");

        System.out.print("Enter your choice: ");
        String first = "1";
        Input userInput = new Input();
        Scanner scn = new Scanner(System.in);
        String userResponse = scn.next();

//        if(userResponse.equals(first)) {
//            for(MoviesArray Movie[]: movies){
//
//            }
//


            System.out.println(userResponse);

        }
    }

