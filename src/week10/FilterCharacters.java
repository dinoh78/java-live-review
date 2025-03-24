package week10;
/*
String str = "abcd@!#$etyi123lkjhaqwer%^&879";
digits: 123879
letters: abcdetyilkjhaqwer
special: @!#$%^&
        */

public class FilterCharacters {
    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhaqwer%^&879ȉϠ";
        String digits = "";
        String letters = "";
        String special = "";

        for(char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                special += each;
            }
        }

        System.out.println("str = " + str);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);

    }
}


