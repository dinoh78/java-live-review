package week09;

import javax.swing.text.ViewFactory;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "java";
        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char each : str.toCharArray()) {
            System.out.println("each = " + each);
        }

        System.out.println(isAnagram("cat", "act"));
        System.out.println(isAnagram("silent", "listen"));

        System.out.println(isAnagram("java", "cava"));

        System.out.println(isAnagram("java", "ava"));
    }

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        //sort arrays
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        return Arrays.equals(aArr, bArr);
    }
}