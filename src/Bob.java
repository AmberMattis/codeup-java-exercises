import java.util.Scanner;
public class Bob {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String bobGreeting = "Bob: Hey I'm Bob.";
        System.out.println(bobGreeting);

        do {
            String response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Bob: You ask too many questions");
            } else if (response.endsWith("!")) {
                System.out.println("Bob: Chill out!");
            } else if (response.equals("")) {
                System.out.println("Bob: Fine be that way");
            } else if (response.equalsIgnoreCase("Bob")) {
                System.out.println("Bob: What");
            } else {
                System.out.println("Whatever");
            }

        }while(true);
    }
}
