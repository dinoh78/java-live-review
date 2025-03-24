package utils;

public class BreakTimer {

    public static void main(String[] args) throws InterruptedException {
        setBreakTime(3);
    }

    //setBreakTime(5);
    public static void setBreakTime(int minutes) throws InterruptedException {
        if (minutes <= 0) {
            System.err.println("Invalid minutes, cannot be <= 0");
            return;
        }

        System.out.println("BREAK TIME FOR " + minutes + " MINUTES");

        for (int mins = minutes - 1; mins >= 0; mins--) {
            //seconds
            for (int seconds = 59; seconds >= 0; seconds--) {
                Thread.sleep(1000);

                String strMin = mins < 10 ? "0" + mins : mins + "";
                String strSeconds = seconds < 10 ? "0" + seconds : String.valueOf(seconds);

                System.out.print(strMin + ":" + strSeconds + "\r");
            }
        }

        System.out.println("BREAK TIME IS OVER. PLEASE COME BACK TO CLASS");

    }
}