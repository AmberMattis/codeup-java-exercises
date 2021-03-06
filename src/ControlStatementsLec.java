import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        // ==================== Boolean Expressions
        //Java does not have a truthy falsy concept like (javaScript (0 = false 1 = true))



        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

//        int randomNumber = 6;
//        System.out.println(randomNumber == 6);
//
//        char randomChar = 'Y';
//        System.out.println(randomChar == 'y');



        // ==================== Logical Operators

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
                int x = 2;
                int y = 3;

                if (true && ++x == y) {
                    System.out.println("Equal");
                } else {
                    System.out.println("Not equal");;
                }
                System.out.println(x);


        // ==================== String 7

        // DO NOT COMPARE STRINGS WITH == !!!!
        //Because they are are not primitive data types, They are objects which means they have different ids
        //An objet cannot equal an object
        //You must use .equals instead of == when using the String non primitive data type.

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);



        // do use equals(),

//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));



        // ==================== Switch Case

        // basically the same as JS :)


            String caseSwitch = "Fred";
            switch (caseSwitch) {
                case "bob":
                    System.out.println("Case 1");
                    break;
                case "fred":
                    System.out.println("Case 2");
                    break;
                default :
                    System.out.println("Default case");
                    break;
            }
    }
}
