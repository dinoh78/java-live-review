package week09;

import java.util.Arrays;

public class DailySteps {
    public static void main(String[] args) {


//array that can hold daily steps for a week:

        int[] dailySteps = { 3861, 5496, 4259, 4292, 8020,4531, 3620};

        //array to store weekday names:

        String[] days = new String [7];
        // var days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        // I walked 3861 steps on Monday.

        System.out.println("I walked " + dailySteps[0] + " steps on " + days[0]);

        //Length of each array

        System.out.println("dailySteps lenght = " + dailySteps.length);
        System.out.println("days lenght = " + days.length);

        //read last value in an array
        System.out.println("last = " + dailySteps[dailySteps.length-1]);
        System.out.println("last = " + days[days.length-1]);

        //loop array and print each pair: Monday =3861 Tuesday=5496...

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + "  \t=\t" + dailySteps[i]);


            //count total steps for whole week
            int totalSteps = 0;
            for (int steps : dailySteps){
                //System.out.println(steps);
                totalSteps += steps;

            }

        System.out.println(days[i] + "  \t=\t" + totalSteps);
        }


    }
}


