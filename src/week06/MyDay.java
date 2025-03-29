package week06;

public class MyDay {
    /*
    Method: nap
    Param: minutes
    nap(30);
    nap(5);
    nap(55);
    minutes <= 10 -> short nap for 10 minutes
    minutes <= 30 -> moderate nap for .. minutes
    minutes <= 60 -> long nap for .. minutes
    > --> wake up and code java, its been ... minutes
     */
    public static void nap(int minutes) {
        if (minutes <= 10) {
            System.out.println("short nap for " + minutes + " minutes");
        } else if (minutes <= 30) {
            System.out.println("moderate nap for " + minutes + " minutes");
        } else if (minutes <= 60) {
            System.out.println("long nap for " + minutes + " minutes");
        } else {
            System.out.println("wake up and code java, its been " + minutes + " minutes");
        }
    }
}
