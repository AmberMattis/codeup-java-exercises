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

    }

}
