package week13.inheritance_review;

public class TestSports {
    public static void main(String[] args) {
        //create object of super class
        OlympicSport olympicSport = new OlympicSport("Basketball") {
            @Override
            public void compete() {

            }
        };
        System.out.println(olympicSport);
        olympicSport.complete();
        System.out.println("name = " + olympicSport.name);
    }
}