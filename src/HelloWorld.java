public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        int myFavoriteNumber = 75;
        System.out.println(myFavoriteNumber);

        String myString = "I'm confused";
        System.out.println(myString);

        //4//

//         myString = 3.24259;
//         compiler error incompadable typed double can't be converted to a string          //



        //5//

//        long myNumber;
//        System.out.println(myNumber);
//        compiler error variable myNumber might not have been initialized



        //6//

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        compiler error incompatible types: possible lossy conversion from double to long



        //7//

//        long myNumber = 123L;
//        System.out.println(myNumber);
//        souts out 123 in terminal



        //8//

//        myNumber = 123;
//        System.out.println(myNumber);
//        souts 123 in terminal with nyNumber declared in above exercise
//
//        long myNumber = 1234;
//        System.out.println(myNumber);
//        souts 123 in terminal



        //9//

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        compiler error incompatible types: possible lossy conversion from double to long
//        System.out.println();



        //10//

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);



        //11//

//        String class = "Test";
//        System.out.println(class);
//        returns a compiler error not a statement.



        //12//

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        System.out.println(three);
//        returns a compiler error cannot cast String to Integer

//        String theNumberThree = "three";
//        int three = (int) "three";
//        System.out.println(three);
//        returns a compiler error string cannot be converted to int.
//        this code also returns a compiler error before it is run (red underline)



        //13//
//
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x  = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);



        //14//

//        byte max = 127;
//        max = ++max;
//        System.out.println(max);
//        the value spills over and is added to the min value or negative number

//        short max = 32.768;
//        System.out.println(max);
//        returns a compiler error incompatible types conversion from double to short.
//        compiler recognizes error before code is run.









    }
}
