import java.util.Scanner;
public class ConsoleExercise {
    public static void main(String[] arg) {

        Scanner userInput = new Scanner(System.in);

        /* 1 */

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);



//        /* 2 */
//
//        System.out.println("Enter a random number!");
//            int userNumber = userInput.nextInt();
//            System.out.println(userNumber);
//            //If the user inputs a number that is not a string, the terminal returns a compiler error.


//        System.out.println("Enter your top three favorite foods!");
//            String firstFood = userInput.next();
//            String secondFood = userInput.next();
//            String thirdFood = userInput.next();

//            System.out.println(firstFood);
//            System.out.println(secondFood);
//            System.out.println(thirdFood);
//            userInput.nextLine();
//            //If you enter less than three foods, the compiler will not return the user's inputs.
//            //If you enter more than three foods, the compiler will only return the number of foods specified in the code.


//        System.out.println("Enter your favorite inspirational quote");
//            String userQuote = userInput.next();
//            System.out.println(userQuote);
//            // This step only captures the first word in the sentence.

//        System.out.println("Enter your favorite inspirational quote");
//            String userQuote = userInput.nextLine();
//            System.out.println(userQuote);
//


        /* 3 */

//        System.out.println("Enter the length and width of the Jupiter classroom.");
//            String userLength = userInput.nextLine();
//            String userWidth = userInput.next();
//            int lengthNumber = Integer.parseInt(userLength);
//            int widthNumber = Integer.parseInt(userWidth);
//            int roomArea = lengthNumber * widthNumber;
//            int roomPerimeter = (2 * lengthNumber) + (2 * widthNumber);
//
//            System.out.printf("The area of the classroom is %d.%n", roomArea);
//            System.out.printf("The perimeter of the classroom is %d.%n", roomPerimeter);

        System.out.println("Enter the length of the Jupiter classroom.");
            String userLength = userInput.nextLine();

        System.out.println("Enter the width of the Jupiter classroom.");
            String userWidth = userInput.nextLine();

            int lengthNumber = Integer.parseInt(userLength);
            int widthNumber = Integer.parseInt(userWidth);
            int roomArea = lengthNumber * widthNumber;
            int roomPerimeter = (2 * lengthNumber) + (2 * widthNumber);

            System.out.printf("The area of the classroom is %d.%n", roomArea);
            System.out.printf("The perimeter of the classroom is %d.%n", roomPerimeter);



        /* BONUS */

    }
}
