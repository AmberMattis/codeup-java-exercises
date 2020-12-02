public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        int myFavoriteNumber = 75;
        System.out.println(myFavoriteNumber);

        String myString = "I'm confused";
        System.out.println(myString);

        //4//

        // myString = 3.24259;
        // compiler error incompadable typed double can't be converted to a string


        //5//

        //long myNumber;
        //System.out.println(myNumber);
        //compiler error variable myNumber might not have been initialized


        //6//

        //long myNumber = 3.14;
        //System.out.println(myNumber);
        // compiler error incompatible types: possible lossy conversion from double to long


        //7//

        long myNumber = 123L;
        System.out.println(myNumber);
        //souts out 123 in terminal

    }
}
