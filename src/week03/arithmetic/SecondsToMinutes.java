package week03.arithmetic;

/*
SecondsToMinutes [variables, remainder operator, concatenation]
    Declare and assign the following variables
        totalSeconds

    Declare minutes , calculate minutes in totalSeconds
    Declare seconds , calculate remaining seconds
    Display in this format:
    In 550 seconds - there are 9 minutes and 10 seconds
 */
public class SecondsToMinutes {
    public static void main(String[] args) {
        System.out.println(9 / 3); //3+3+3
        System.out.println(9 % 3); //3+3+3 = 0
        System.out.println(9 % 2); //2+2+2+2+1
        System.out.println(9 % 5); //5 + 4
        System.out.println(10 % 4); //4+4+2

        System.out.println(100 / 60);
        System.out.println(100 % 60);

        int totalSeconds = 550;
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        System.out.println("minutes = " + minutes);
        System.out.println("remainingSeconds = " + remainingSeconds);
        //In 550 seconds - there are 9 minutes and 10 seconds
        System.out.println("In " + totalSeconds + " seconds - there are " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}