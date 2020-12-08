import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }



    //Creating a multiplication method without using * opertator (use a loop)

    public static int loopMultiplication(int numA, int numB) {
        int factor = 0;
        for (int i = 0; i < numA; i++) {
            factor += numB;
        }
        return factor;
    }



    public static int recursionMultiplication(int numA, int numB) {
        if (numA == 0 || numB == 0) {
            return 0;
        } else if (numA == 1) {
            return numB;
        } else {
            return recursionMultiplication(numA - 1, numB) + numB;

        }
    }



    public static int range(int min, int max) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int number = Integer.parseInt(userInput.nextLine());
        if (number < min || number > max) {
            return range(min, max);
        } else {
            System.out.println("Valid");
        }
        return number;
    }



    public static long factorial(int min, int max) {
        Scanner userInput = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Enter a number between 1 and 10");
        int number = Integer.parseInt(userInput.nextLine());
            if (number > max || number < min) {
                System.out.println("not within range.");
            } else if (number == 1) {
                System.out.printf("%d! = %d", number,factorial);
            } else {
                for (int counter = 1; counter <= number; counter++) {
                    factorial = factorial * counter;
            }
                System.out.printf("%d! = %d", number,factorial);
        }

        return number;
    }



    public static void main(String[] arg) {

        Scanner sideDice = new Scanner(System.in);
        Random sides = new Random();
        boolean playAgain = true;

        do{
        System.out.println("Enter number of sides for first die");
        int die1 = Integer.parseInt(sideDice.nextLine());

        System.out.println("Enter number of sides for the second die");
        int die2 = Integer.parseInt(sideDice.nextLine());

        System.out.printf("The first die has %d sides.%nThe second die has %d sides.%n%n", die1, die2);
        int number1 = 1 + sides.nextInt(die1);
        int number2 = 1 + sides.nextInt(die2);

        Scanner choice = new Scanner(System.in);
        System.out.println("Would you like to roll the dice? [y/n]");
        String option = choice.nextLine();
        String yes = "y";
        String no = "n";
        if(option.equalsIgnoreCase(yes)) {
            System.out.printf("You rolled %d and %d.%n%n", number1, number2);
        }else{
            System.out.println("Abort");
        }

        System.out.println("Would you like to roll again? [y/n]");
        String newOption = choice.nextLine();
        if(newOption.equalsIgnoreCase(no)){
            playAgain = false;
            System.out.printf("Aaaaaw you were on a roll!%n%n");
            }
        }
        while(playAgain);




//            System.out.println(range(1, 10));
//            System.out.println(factorial(1,10));
//            System.out.println(add(2, 2));
//            System.out.println(subtract(2, 2));
//            System.out.println(multiply(2, 2));
//            System.out.println(divide(2, 2));
//            System.out.println(modulus(2, 2));
//            System.out.println(loopMultiplication(2, 3));
//            System.out.println(recursionMultiplication(2,2));

    }
}

