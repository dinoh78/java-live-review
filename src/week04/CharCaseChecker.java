package week04;
/*
   CharCaseChecker
    ch = 'A'
    if ch is uppercase: "Uppercase letter"
        ch >= 'A' && ch <= 'Z'
    if ch is lowercase: "Lowercase letter"
    else: "Not a letter"
 */
public class CharCaseChecker {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch +" is Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " lowercase letter");
        } else {
            System.out.println(ch + " is not a letter");
        }
    }
}