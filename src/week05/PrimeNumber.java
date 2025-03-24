package week05;
/*Prime number is divisible by 1 and number itself.no other numbers
num = 5
check if num is divisible by 2,3,4

num = 6
check if num is divisible by 2,3,4,5
if num is divisible by any number between 2 and num,then num is Not prime.otherwise prime

 */
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        //i<=num/2;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
                //return;// stop method

            }

        }
        if (isPrime) {

            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not prime number");

        }

    }

}