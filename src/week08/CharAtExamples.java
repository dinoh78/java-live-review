package week08;
import java.util.Scanner;
/*
Accepts a String from scanner, then print each character in seperate lines.
front also reverse
cat
c
a
t
t
a
c
 */
public class CharAtExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        printCharsReverse(word);
    }

    //printCharsReverse(word)
    public static void printCharsReverse(String str) {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

}