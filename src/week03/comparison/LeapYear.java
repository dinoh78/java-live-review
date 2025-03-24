package week03.comparison;
/*
 1) A leap year is defined as a year that is divisible by 4 and not divisible by 100
 2) Or, years that are divisible by 400 are also considered leap years.
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2036;
        System.out.println(year % 400);
        System.out.println(year % 4);
        System.out.println(year % 100);
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("leapYear = " + leapYear);
    }
}


