package week05;
/*
 loop from 1 to 100
 if number is divisible by 3 -> "Fizz"
  if number is divisible by 5 -> "Buzz"
   if number is divisible by 3 and 5 -> "FizzBuzz"
   Otherwise print number itself
 */
public class FizzBazz {
    public static void main(String[] args) {
        for (int i = 1; i < 100 ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FIZZBUZZ" );
            } else if (i % 3 == 0){
                System.out.print("FIZZ ");
            } else if (i % 5 == 0){
                System.out.print("BUZZ ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}