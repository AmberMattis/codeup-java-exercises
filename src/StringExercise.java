import java.util.Scanner;
public class StringExercise {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String string1 = "We don't need no education We dont need no thought control";
        System.out.printf(string1.substring(0,26) + "%n" + string1.substring(27) + "%n%n");

        String string2 = "Check \"this\" out! \"s inside of \"s!";
        System.out.printf(string2 + "%n%n");

        String string3 = "In the windows, the main drive is usually C:\\";
        System.out.printf(string3 + "%n%n");

        String string4 = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(string4 + "%n%n");
    }
}
