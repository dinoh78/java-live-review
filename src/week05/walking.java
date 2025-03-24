package week05;
/*
You are walking from 100 steps
every third step you are also jumping
Ex:
Step 1
Step 2
Jump 3
Step 4

 */
public class walking {
    public static void main(String[] args) throws InterruptedException {
        for (int step = 1; step <= 100; step++) {
            //pause for half a second
            Thread.sleep(500);
            if (step % 3 == 0) {
                System.out.println("jump " + step);
            } else {
                System.out.println("step " + step);
            }

        }
/*
you are running 300 metters,but at 200 metters you decide to stop

 */
        int meters = 300;
        for (int i = 1; i <= meters; i++) {
            System.out.println("Running metter -" + i);
            if (i == 200) {
                System.out.println("Stopping-"+i);
                break;// exit loop
            }

        }
        /*
        You are watching a recording that has 30 minutes.
        you want to watch 5 minutes then skip a minute
         */

        int minutes =30;
        for (int min = 0; min <= minutes; min++){
            if (min % 5 == 0) {
                System.out.println("Skipping minute -" + min);
                continue;//goto next iteration

            }
            System.out.println("Watching a minute -" + min);

        }
    }

}
