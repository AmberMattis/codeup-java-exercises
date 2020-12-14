import java.util.Random;
public class ServerNameGenerator {

public static String getWord(String[] word){
    Random random = new Random();
    int wordIndex  = random.nextInt(word.length);
    return word[wordIndex];
}


 public  static void main(String[] args){
     String[] nameAdjectives = {"sleepy","determined","educated","inspired","spontaineous","nervous","reliable","shady","predictable","sophisticated"};
     String[] nameNouns = {"poodle","playground","teacher","baker","resteruant","kitten","school","crayons","villain","car"};

     System.out.print("Server name: ");
     System.out.println(getWord(nameAdjectives) + "-" + getWord(nameNouns));
 }

}
