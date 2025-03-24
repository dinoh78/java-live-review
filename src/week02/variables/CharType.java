package week02.variables;

public class CharType {
    public static void main(String[] args) {
        //Java
        char first = 'J';
        char second = 'a';
        char third = 118;
        char fourth = 97;

        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.println(fourth);

        char someChar = '\u1788';
        System.out.println(someChar);

        someChar = '\u11D4';
        System.out.println(someChar);

        char emoji = '\u263A';
        System.out.println(emoji);


    }
}