package week05;
/*
24 hours in a day
Good morning -> 5 - 11
Good afternoon -> 12 - 17
Good evening -> 18 - 23, 0 - 4
 */

public class GreatingHours {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            switch (hour) {
                case 5,6,7,8,9,10,11 -> System.out.println("Good morning - " + hour);
                case 12,13,14,15,16,17 -> System.out.println("Good afternoon - " + hour);
                case 18,19,20,21,22,23,0,1,2,3,4 -> System.out.println("Good evening - " + hour);
                default -> System.out.println("Invalid hour - " + hour);
            }
        }

        for (int hour = 0; hour <= 23; hour++) {
            if (hour >= 5 && hour <= 11) {
                System.out.println("Good morning - " + hour);
            } else if (hour >= 12 && hour <= 17) {
                System.out.println("Good afternoon - " + hour);
            } else if ((hour >= 18 && hour <= 23) || (hour >= 0 && hour <= 4)) {
                System.out.println("Good evening - " + hour);
            } else {
                System.out.println("Invalid hour - " + hour);
            }
        }
    }
}
