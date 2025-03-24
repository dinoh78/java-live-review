package week06.

























        method_with_return;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("current year="+ getCurrentYear());
        System.out.println(getCurrentYear());//2025
    }
    /*
    getCurrentYear
    returns 2025
     */
    public static int getCurrentYear() {
        System.out.println("return current year..");
        return 2025;
    }
    /*
    metod:calculateAge
    Param:birthYear
    returns age
   */
    public static int calculateAge(int birthYear) {
        var age = 2025-birthYear;
        return age;
    }
}
