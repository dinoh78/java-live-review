package week09;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //print array using Arrays.toString()
        System.out.println(Arrays.toString(countries));

        //- Find and print all the first and last characters
        for(String country : countries) {
            System.out.println(country.charAt(0) + "" + country.charAt(country.length()-1));
            System.out.println(country.substring(0,1) + country.substring(country.length()-1));
        }

        //- Find the largest and smallest countries based on the length of their names
        //Arrays.sort(countries); Sorted by alphabet
        String shortest = countries[0];
        String longest = "";

        for(String country : countries) {
            if (country.length() < shortest.length()) {
                shortest = country;
            }

            if (country.length() > longest.length()) {
                longest = country;
            }
        }

        System.out.println("shortest = " + shortest);
        System.out.println("longest = " + longest);

        //- Show all the countries that start with a 'C'
        for(String country : countries) {
            if (country.startsWith("C")) {
                System.out.println(country);
            }
        }

        //- Show all the countries that end with an 's'
        for(String country : countries) {
            if (country.endsWith("s")) System.out.println(country);
        }
    }
}