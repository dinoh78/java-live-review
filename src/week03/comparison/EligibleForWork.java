package week03.comparison;
// age->eligible for work if between 18 and 65
public class EligibleForWork {
    public static void main(String[] args) {
        int age =96;
        System.out.println(age >=18 && age <=65);
        boolean canWork = age >= 18 && age <= 65;

        System.out.println("Eligible for work: " + canWork);



    }
}
