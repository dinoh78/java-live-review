package week11;

public class TestPlanets {
    public static void main(String[] args) {
        System.out.println("-----Welcome to " +  Planets.galaxy + "------");
       Planets earth = new Planets("Earth", 149_600_000L);
        System.out.println(earth);
    }
}