package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String userPrompt){
        System.out.println(userPrompt);
        return getString();
    }



//    public int getInt(){
//        return getString(Integer.valueOf(String s));
//    }


//    public int getInt ( int min, int max){
//        System.out.println("Enter number between " + min + " and " + "max");
//        return getInt();
//    }


    public double getDouble(){
        return this.scanner.nextDouble();
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
//        Input input1 = new Input();
//        Scanner user = new Scanner(System.in);
//        String userResponse = user.nextLine();
//
//        System.out.println(yesNo(userResponse));

        // if the user picks yes all round //




    }

}
