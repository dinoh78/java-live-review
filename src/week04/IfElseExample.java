


package week04;

public class IfElseExample {
    public static void main(String[] args) {
//*boolean hungry.
//if true -> lets get some snacks. Keep coding java
//if false -> Not hungry, lets keep coding java

        boolean hungry = false;

        if (hungry) {
            System.out.println("Lets get some snacks");
            System.out.println("Keep coding java");
        }else{
            System.out.println("Not hungry, lets keep coding java");

        }
//if (hungry) {
//    System.out.println("Mot hungry, lets keep coding java");
//}
        System.out.println("======================");

//int variable year
//- year is either 2020 or 2021 -> Lockdown. wear mask, stay home
//- year is something else -> Go out, meet friends, keep coding java

        int year = 2020;
        if (year == 2020 || year == 2021) {
            System.out.println("Lockdown");
            System.out.println("Wear mask, stay home, keep coding java");
        }else{
            System.out.println("Go out meet friends");
            System.out.println("Keep coding java");


        }
    }



}






