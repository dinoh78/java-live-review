package week10;

public class WrapperClasses {
    public static void main(String[] args) {
        int n = 10;
        Integer n1 = 10;
        System.out.println("n = " + n);
        System.out.println("n1 = " + n1);

        double d = 33.44;
        Double d1 = d; //Auto-boxing - converting from primitive to Wrapper class object

        double d2 = d1; //Unboxing - converting from wrapper object to primitive

        System.out.println("Max int value = " + Integer.MAX_VALUE);
        System.out.println("min int = " + Integer.MIN_VALUE);

        System.out.println("max double = " + Double.MAX_VALUE);
        System.out.println("min double = " + Double.MIN_VALUE);

        //convert string to primitive
        String price = "43.99";
        double dPrice = Double.parseDouble(price);
        System.out.println("dPrice = " + dPrice);

        String numStr = "43525";
        int iNum = Integer.parseInt(numStr);
        iNum++;
        System.out.println("iNum = " + iNum);

        if (iNum >= 0) {
            System.out.println("iNum is positive");
        } else {
            System.out.println("iNum is negative");
        }

        //Character class methods:

        char ch = 'A';
        System.out.println("isLetter = " + Character.isLetter(ch));
        System.out.println("isUppercase = " + Character.isUpperCase(ch));
        String name = "Bob";
        if (Character.isUpperCase(name.charAt(0))) {
            System.out.println("Format check passed");
        } else {
            System.out.println("Format check failed, must be uppercase");
        }

        char d4 = '5';
        System.out.println("isDigit = " + Character.isDigit(d4));
    }
}

