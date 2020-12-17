package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static String getString(String input){
        return "You entered: " + input;
    }

    public static int getInt(int min, int max){
        return min;
    }

    public static double getDouble(double input){
        return input;
    }

    public static boolean yesNo(String input){
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }

    }




    public static void main(String[] args){
        System.out.println("Enter something");
        Input input1 = new Input();
        Scanner user = new Scanner(System.in);
        String userResponse = user.nextLine();

        System.out.println(yesNo(userResponse));


        System.out.println("Would you like to create a new grocery list?");
        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();

        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println("Would you like to pick a new item?");
            Scanner scn1 = new Scanner(System.in);
            String userInput2 = scn1.nextLine();
        }else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
                System.out.println("Goodbye");
            }



    }

}
