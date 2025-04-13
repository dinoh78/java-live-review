package week13.abstract_and_interface.exceptions;

/*
Unchecked Exceptions -> RunTime Exceptions
 */
public class UnChecked {
    public static void main(String[] args) {

        try {
            String str = "java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception happened and caught");
        }

        System.out.println("After charAt");

        System.out.println("=========================");
        /*
        If we put parent exception type in catch block,
        Then it is able
         */

        try {
            //String word = null;
            String word = "hello";
            System.out.println(word.toUpperCase());

            int[] nums = {4, 1, 7};
            System.out.println(nums[5]);
        } catch (Exception e) {
            System.out.println("Exception happened - " + e.getMessage());
        }


        System.out.println("============================");
        /*
        Somettimes,we want to catch

         */
        try {
            System.out.println(10 / 0);
            String s = "python";
            System.out.println(s.charAt(10));
        } catch (ArithmeticException e) {
            System.out.println("Math exception caught");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index exception caught");
        } catch (Exception e) {
            System.out.println("Some other exception caught - " + e.getMessage());
        }

    }

}