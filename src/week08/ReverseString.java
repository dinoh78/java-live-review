package week08;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Sunday"));
        System.out.println(reverseString("JAVA").toLowerCase());
        System.out.println("wooden spoon = " + reverseString("wooden spoon"));

        StringBuilder stb = new StringBuilder("apple");
        System.out.println(stb.reverse());

    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
































































































