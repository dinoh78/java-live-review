package week02.variables;

/*
      year = 2025
      month = January
      day = 26
      weekDay = Sunday
      hour = 2
      minute = 47

      Sunday, January 26, 2025 - 2:47 EST
       */
public class Today {
    public static void main(String[] args) {
        int year = 2025;
        String month = "January";
        byte day = 26;
        String weekDay = "Sunday";
        var hour = 2;
        var minute = 47;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("weekDay = " + weekDay);
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);

        // Sunday, January 26, 2025 - 2:47 EST
        System.out.println(weekDay + ", " + month + " " + day + ", " + year +" - " + hour + ":" + minute + " PM EST");



    }
}