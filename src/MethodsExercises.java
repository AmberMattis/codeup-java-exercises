public class MethodsExercises {



    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
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


    public static void main(String[] arg){

        System.out.println(add(2, 2));
        System.out.println(subtract(2, 2));
        System.out.println(multiply(2, 2));
        System.out.println(divide(2, 2));
        System.out.println(modulus(2, 2));
        System.out.println(loopMultiplication(2, 3));

    }
}