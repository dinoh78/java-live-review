



package week06;

public class MyWeek {
    public static void main(String[] args) {
        dailyRoutine("Monday");
    }

     /*
    dailyRoutine("Monday");
    dailyRoutine("Saturday");

    "Monday","Tuesday","Wednesday" -> makeCoffee,"java tasks for an hour", exercise for 20 mins,
                                    study java modules 2 hours, nap 25 mins
    "Thursday","Friday","Saturday" ->  makeCoffee, exercise for 30 mins, study soft skills for 2 hours
                                    makeCoffee, nap 10 mins
     "Sunday ->  makeCoffee, exercise 15 mins, live review session for 4 hours, make more coffee,
                -> nap 32 mins, study more live review session for 3 hours
     */

    public static void dailyRoutine(String day) {
        System.out.println("------" + day + "-------");
        switch (day) {
            case  "Monday","Tuesday","Wednesday" -> {

                MyDay.nap(25);
            }
            case "Thursday","Friday","Saturday" -> {

                MyDay.nap(10);
            }
            case "Sunday" -> {

                MyDay.nap(32);

            }
            default -> System.out.println("Invalid day");
        }
    }

}
