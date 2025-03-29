package week11;

import java.util.*;

public class TestPlanets {
    public static void main(String[] args) {
        System.out.println("-----Welcome to " + Planets.galaxy + "------");
        Planets earth = new Planets("Earth", 149_600_000L);
        System.out.println(earth);

        //create a list of Planet objects and add planets to it
        ArrayList<  Planets> planetsList = new ArrayList<>();
        planetsList.add(new Planets("Mercury", 57_900_000L));
        planetsList.add(new Planets("Venus", 108_200_000L));
        planetsList.add(new Planets("Earth", 149_600_000L));
        planetsList.add(new Planets("Mars", 227_900_000L));
        planetsList.add(new Planets("Jupiter", 778_500_000L));
        planetsList.add(new Planets("Saturn", 1_430_000_000L));
        planetsList.add(new Planets("Uranus", 2_870_000_000L));
        planetsList.add(new Planets("Neptune", 4_500_000_000L));

        Collections.shuffle(planetsList);

        for(Planets planet : planetsList) {
            System.out.println(planet);
        }

        //print first planet
        System.out.println("First planet = " + planetsList.get(0).name);

        //Loop and find the planet closest to Sun
        Collections.sort(planetsList, Comparator.comparing(planet -> planet.distanceFromSun));
        System.out.println("Closest planet = " + planetsList.get(0).name);

        Planets mars = new Planets("Mars", 227_900_000L);
        System.out.println(closerToSun(earth, mars));
    }

    /*
    Method accepts 2 Planet objects and returns name of closer to sun
     */
    public static String closerToSun(  Planets p1, Planets p2) {
        if (p1.distanceFromSun < p2.distanceFromSun) {
            return p1.name;
        }
        return p2.name;
    }
}
