package week08;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Java"));
        System.out.println(isPalindrome(" Race Car "));
    }

    //isPalindrome(" Race car ") => true
    public static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        //remove empty spaces and make lowercase
        str = str.replace(" ", "").toLowerCase();

        //reverse the str
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        //return boolean if original equals to reversed
        return str.equals(reversed);
    }
}