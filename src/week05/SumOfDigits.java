package week05;
/*
Sum of all digits.
extract each digit and add to sum
123 -> 1+2+3 -> 6
333 -> 3+3+3 -> 9
43214 -> 4+3+2+1+4 -> 14
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        while (num > 0) {
            //read last digit and add to sum
            sum += num % 10;
            // remove last digit:
            num =num /= 10;

        }
        System.out.println("sum = " + sum);
    }

}
