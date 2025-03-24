package week04;

public class TernaryDemo {
    public static void main(String[] args) {
        int num = 22;
        String result =(num%2==0)? "Even":"Odd";
        System.out.println(num + " is even " + result);

        int hour =5;
        result =(num>=5)? "Bye Bye time": "Keep coding java";

        System.out.println("hour = " + hour);
        System.out.println("result = " + result);

    }
}
