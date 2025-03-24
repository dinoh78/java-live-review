package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Planets {
    public static void main(String[] args) {
        //Create arraylist and add planet names in solar system:
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Earth", "Mercury", "Venus",
                "Mars" ,"Jupiter","Pluto","Saturn","Neptune","Uranus"));

        System.out.println("planets = " + planets);

        //reverse
        Collections.reverse(planets);
        System.out.println("planets = " + planets);

        //print each planet in reverse:
        for (int i = planets.size() - 1; i >= 0; i--) {
            System.out.println(i + " = " + planets.get(i));
        }

        //shuffle
        Collections.shuffle(planets);
        System.out.println("planets = " + planets);

        //get frequency
        System.out.println(Collections.frequency(planets, "Earth"));

        planets.add("Earth");
        planets.add(0,"Earth");

        System.out.println("planets = " + planets);
        //remove all "Earth" from list
        planets.removeIf(planet -> planet.equals("Earth"));
        System.out.println("planets = " + planets);
    }
}

